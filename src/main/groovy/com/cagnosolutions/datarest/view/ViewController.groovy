package com.cagnosolutions.datarest.view

import com.cagnosolutions.datarest.view.component.Component
import com.cagnosolutions.datarest.view.component.ComponentService
import com.cagnosolutions.datarest.view.layout.Layout
import com.cagnosolutions.datarest.view.layout.LayoutService
import com.cagnosolutions.datarest.view.template.Template
import com.cagnosolutions.datarest.view.template.TemplateService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping("/view")
@CrossOrigin(allowedHeaders = ["Content-Type", "x-requested-with"], origins = ["*"], methods = [RequestMethod.OPTIONS, RequestMethod.POST, RequestMethod.GET])
class ViewController {
	
	@Autowired
	LayoutService layoutService

	@Autowired
	ComponentService componentService

	@Autowired
	TemplateService templateService


	@RequestMapping(value = "/template", method = RequestMethod.GET)
	List<Template> findAllTemplates() {
		templateService.findAll()
	}
	
	@RequestMapping(value = "/template/{id}", method = RequestMethod.GET)
	Template findOneTemplate(@PathVariable Integer id) {
		templateService.findOne id
	}
	
	@RequestMapping(value = "/template", method = RequestMethod.POST)
	def saveTemplate(@RequestBody Template newTemplate) {
		if (newTemplate.id != null) {
			def template = templateService.findOne newTemplate.id
			templateService.mergeProperties(newTemplate, template)
			templateService.save(template)
		} else {
			templateService.save(newTemplate)
		}
	}

	@RequestMapping(value = "/component", method = RequestMethod.GET)
	List<Component> findAllComponents() {
		componentService.findAll()
	}

	@RequestMapping(value = "/component/{id}", method = RequestMethod.GET)
	Component findOneComponent(@PathVariable Integer id) {
		componentService.findOne id
	}

	@RequestMapping(value = "/component", method = RequestMethod.POST)
	def saveComponent(@RequestBody Component newComponent) {
		if (newComponent.id != null) {
			def component = componentService.findOne newComponent.id
			componentService.mergeProperties(newComponent, component)
			componentService.save(component)
		} else {
			componentService.save(newComponent)
		}
	}

	@RequestMapping(value = "/layout", method = RequestMethod.GET)
	List<Layout> findAllLayouts() {
		layoutService.findAll()
	}

	@RequestMapping(value = "/layout/{id}", method = RequestMethod.GET)
	Layout findOneLayout(@PathVariable Integer id) {
		layoutService.findOne id
	}

	@RequestMapping(value = "/layout", method = RequestMethod.POST)
	def saveLayout(@RequestBody Layout newLayout) {
		if (newLayout.id != null) {
			def layout = layoutService.findOne newLayout.id
			layoutService.mergeProperties(newLayout, layout)
			layoutService.save(layout)
		} else {
			layoutService.save(newLayout)
		}
	}
}
