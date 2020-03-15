package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class UserController {
	
	private static final Logger LOGGER = LogManager.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String selectListUser() {
		
		// log 사용법
		LOGGER.info("## UserController ##");
		LOGGER.debug("## DEBUG ##");
        LOGGER.error("## Error ##");
        
		userService.selectListUser();
		
		return "user";
	}
}
