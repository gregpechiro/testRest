package com.cagnosolutions.datarest.view.template

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository

@CompileStatic
interface TemplateRepository extends JpaRepository<Template, Integer> {
}