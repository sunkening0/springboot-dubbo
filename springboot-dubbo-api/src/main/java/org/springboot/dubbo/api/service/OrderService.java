package org.springboot.dubbo.api.service;

import org.springboot.dubbo.api.bean.Order;
import org.springboot.dubbo.api.bean.User;

public interface OrderService {
	public Order getOrderByUserId(User user);
}
