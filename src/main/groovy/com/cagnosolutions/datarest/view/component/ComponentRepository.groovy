package com.cagnosolutions.datarest.view.component

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
interface ComponentRepository extends JpaRepository<Component, Integer> {
}