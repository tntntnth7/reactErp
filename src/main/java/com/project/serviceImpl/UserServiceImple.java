package com.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mapper.UserMapper;
import com.project.service.UserService;
import com.project.vo.User;

@Service
public class UserServiceImple implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public void selectListUser() {
		System.out.println("## UserServiceImple");
		
		List<User> userList = userMapper.selectListUser();
		
		System.out.println("##ㅁㅇㄴㄹ userList 갯수 ttttt = "+userList.size());
		
	}

}
