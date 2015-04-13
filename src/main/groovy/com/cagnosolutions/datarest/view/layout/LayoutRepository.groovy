package com.cagnosolutions.datarest.view.layout
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
interface LayoutRepository extends JpaRepository<Layout, Integer> {
}