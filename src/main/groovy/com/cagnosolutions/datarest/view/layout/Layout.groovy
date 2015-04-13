package com.cagnosolutions.datarest.view.layout
import groovy.transform.CompileStatic

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
/**
 * Created by greg on 2/12/15.
 */
@CompileStatic
@Entity
class Layout {
	
	@Id
	@GeneratedValue
	Integer id
	String template
	String name
	String globalResource
	ArrayList<Integer> components
}
