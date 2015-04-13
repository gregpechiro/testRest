package com.cagnosolutions.datarest.entities.color
import groovy.transform.CompileStatic

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
@Entity
class Color {

	@Id
	@GeneratedValue
	Integer id
	Integer userId
	@Column(columnDefinition = "longblob")
	HashMap<String, Object> links
	@Column(columnDefinition = "longblob")
	HashMap<String, Object> buttons
	@Column(columnDefinition = "longblob")
	HashMap<String, Object> navbar

}
