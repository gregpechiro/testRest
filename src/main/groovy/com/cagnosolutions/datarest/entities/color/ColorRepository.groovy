package com.cagnosolutions.datarest.entities.color
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
interface ColorRepository extends JpaRepository<Color, Integer> {

	@Query("SELECT c FROM Color c WHERE c.userId=:userId")
	Color findOneByUserId(@Param("userId") Integer userId)
}