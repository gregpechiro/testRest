package com.cagnosolutions.datarest.entities.color
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
/**
 * Created by greg on 2/12/15.
 */

@CompileStatic
@RestController
@RequestMapping("/color")
class ColorController {
	
	@Autowired
	ColorService colorService

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	Color findColorByUserId(@PathVariable Integer userId) {
		colorService.findOneByUserId userId
	}

	@RequestMapping(method = RequestMethod.POST)
	Color addColor(@RequestBody Color color) {
		colorService.save(color)
	}

}
