package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoMyBatisPlusJPAApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Resource
	private UserRepo userRepo;

	public void mybatisPlus() {
		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
	}

	public void jpa() {
		List<User> userList = userRepo.findAll();
		userList.forEach(System.out::println);
	}

	@Test
	public void contextLoads() {
		jpa();
		mybatisPlus();
	}
}