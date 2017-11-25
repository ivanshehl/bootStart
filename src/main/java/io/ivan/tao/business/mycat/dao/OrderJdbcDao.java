package io.ivan.tao.business.mycat.dao;

import io.ivan.tao.business.mycat.entity.Order;

import java.util.List;

public interface OrderJdbcDao {
	public List<Order> showAll();
}
