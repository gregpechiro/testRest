package com.cagnosolutions.datarest.entities.user
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(@Param("username") String username)

	@Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password AND active=1")
	User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password)
}