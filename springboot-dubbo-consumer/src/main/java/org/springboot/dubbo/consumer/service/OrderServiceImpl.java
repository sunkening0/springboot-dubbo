package org.springboot.dubbo.consumer.service;

import java.util.Date;

import org.springboot.dubbo.api.bean.Order;
import org.springboot.dubbo.api.bean.User;
import org.springboot.dubbo.api.service.OrderService;
import org.springboot.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * dubbo中默认使用随机的负载均衡机制
 * @author skn
 *
 */

@Service
public class OrderServiceImpl implements OrderService{
	@Reference(version = "1.0.0",loadbalance="roundrobin")  //loadbalance：设置负载均衡机制
	UserService userService;
	public Order getOrderByUserId(User user) {
		Order order = new Order();
		order.setId(1);
		order.setOrderName("订单1");
		order.setOrderTime(new Date());
		int userId;
		
		userId = user.getId();
		order.setUserId(userId);			
		
		System.out.println(userService.getUsers().get(0).getId());
		
		return order;
	}

}
