package io.ivan.tao.business.mycat.service;

import io.ivan.tao.business.mycat.entity.Order;

import java.util.List;

public interface OrderService {
	public void addOrder();
	
	public Long count();
	
	public List<Order> findByUser();
}
