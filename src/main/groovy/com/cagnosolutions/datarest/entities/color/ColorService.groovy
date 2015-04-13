package com.cagnosolutions.datarest.entities.color

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by greg on 2/12/15.
 */

@CompileStatic
@Service
class ColorService {
	
	@Autowired
	ColorRepository repo
	
	List<Color> findAll() {
		repo.findAll()
	}
	
	Color findOne(Integer id) {
		repo.findOne(id)
	}

	Color findOneByUserId(Integer userId) {
		repo.findOneByUserId(userId)
	}
	
	Color save(Color color) {
		repo.save(color)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
