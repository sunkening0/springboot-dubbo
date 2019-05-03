package org.springboot.dubbo.provider;

import java.util.Arrays;
import java.util.List;

import org.springboot.dubbo.api.bean.User;
import org.springboot.dubbo.api.service.UserService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;



@Service(version = "1.0.0", interfaceClass = UserService.class)   //dubbo注解  用于暴露服务
@Component
public class UserServiceImpl implements UserService{

	public List<User> getUsers() {
		User user1 = new User();
		user1.setId(1);
		user1.setName("skn");
		user1.setAddress("chongqing");
		user1.setAge(25);
		
		User user2 = new User();
		user2.setId(1);
		user2.setName("sky");
		user2.setAddress("beijing");
		user2.setAge(26);
		
		System.out.println("userservice========"+2);
		return Arrays.asList(user1,user2);
	}

}
