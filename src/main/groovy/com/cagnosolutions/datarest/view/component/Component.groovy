package com.cagnosolutions.datarest.view.component
import groovy.transform.CompileStatic

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
/**
 * Created by greg on 2/12/15.
 */
@CompileStatic
@Entity
class Component {
	
	@Id
	@GeneratedValue
	Integer id
	String name
	String type
	String resource
	@Column(columnDefinition = "longblob")
	ArrayList<Map<String, String>> data
}
