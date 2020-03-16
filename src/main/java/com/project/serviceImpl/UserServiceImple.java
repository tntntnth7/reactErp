package com.project.serviceImpl;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.controller.UserController;
import com.project.mapper.UserMapper;
import com.project.service.UserService;
import com.project.vo.User;

@Service
public class UserServiceImple implements UserService{
	
	private static final Logger LOGGER = LogManager.getLogger(UserController.class);
	
	@Autowired
	UserMapper userMapper;
	
	/*
	 * rollbackFor = 롤백
	 * noRollbackFor = 롤백 예외 
	 * */ 
	@Override
	@Transactional(rollbackFor = {Exception.class},noRollbackFor={NullPointerException.class})  
	public void selectListUser() {
		LOGGER.info("## UserServiceImple ##");
		try {
			List<User> userList = userMapper.selectListUser();
			
		} catch (Exception e) {
			LOGGER.error("## Error ##");
			throw new RuntimeException(e);
			// TODO: handle exception
		}
	}
	
	

}
