package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.project.vo.User;

@Repository 
@Mapper
public interface UserMapper {

	public List<User> selectListUser();

}
