package io.ivan.tao.business.mycat.service.impl;

import io.ivan.tao.business.mycat.dao.OrderItemRepository;
import io.ivan.tao.business.mycat.dao.OrderJdbcDao;
import io.ivan.tao.business.mycat.dao.OrderRepository;
import io.ivan.tao.business.mycat.entity.Order;
import io.ivan.tao.business.mycat.entity.OrderItem;
import io.ivan.tao.business.mycat.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private OrderJdbcDao orderJdbcDao;

	public void addOrder() {
		Order order = null;
		OrderItem item = null;
		for(int i = 0; i < 1000; i++){
			order = new Order();
			order.setStatus("123");
			order.setUserId(1);
			orderRepository.save(order);
			item = new OrderItem();
			item.setOrderId(order.getId());
			item.setStatus("666");
			item.setUserId(11);
			orderItemRepository.save(item);
		}
	}

	public Long count() {
		// TODO Auto-generated method stub
		return orderRepository.count();
	}
	
	public List<Order> findByUser(){
		return orderJdbcDao.showAll();
	}

}
