package org.springboot.dubbo.consumer.controller;

import javax.websocket.server.PathParam;

import org.springboot.dubbo.api.bean.User;
import org.springboot.dubbo.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@GetMapping("/order/{id}")
	@ResponseBody
	public Object getOrder(@PathVariable("id") int id){
		//System.out.println(id);
		User user = new User();
		user.setId(1);
		return orderService.getOrderByUserId(user);
	}
}
