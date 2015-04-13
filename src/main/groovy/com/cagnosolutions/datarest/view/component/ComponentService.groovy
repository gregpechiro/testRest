package com.cagnosolutions.datarest.view.component

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
/**
 * Created by greg on 2/12/15.
 */

@CompileStatic
@Service
class ComponentService {
	
	@Autowired
	ComponentRepository repo
	
	List<Component> findAll() {
		repo.findAll()
	}
	
	Component findOne(Integer id) {
		repo.findOne(id)
	}
	
	def save(Component component) {
		repo.save(component)
	}

	def mergeProperties(source, target) {
		source.properties.each { key, value ->
			if (target.hasProperty(key as String) && !((key as String) in ['class', 'metaClass']) && value != null)
				target[key as String] = value
		}
	}
}

