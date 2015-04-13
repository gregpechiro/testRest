package com.cagnosolutions.datarest.view.template

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class TemplateService {
	
	@Autowired
	TemplateRepository repo
	
	List<Template> findAll() {
		repo.findAll()
	}
	
	Template findOne(Integer id) {
		repo.findOne(id)
	}
	
	def save(Template template) {
		repo.save(template)
	}

	def mergeProperties(source, target) {
		source.properties.each { key, value ->
			if (target.hasProperty(key as String) && !((key as String) in ['class', 'metaClass']) && value != null)
				target[key as String] = value
		}
	}
}

