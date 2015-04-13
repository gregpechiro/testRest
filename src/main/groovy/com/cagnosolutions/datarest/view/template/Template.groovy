package com.cagnosolutions.datarest.view.template
import groovy.transform.CompileStatic

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
/**
 * Created by greg on 2/12/15.
 */
@CompileStatic
@Entity
class Template {
	
	@Id
	@GeneratedValue
	Integer id
	String name
	ArrayList<Integer> positions
}
