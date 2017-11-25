package io.ivan.tao.business.mycat.dao.impl;

import java.util.List;

import io.ivan.tao.business.mycat.OrderRowMapper;
import io.ivan.tao.business.mycat.dao.OrderJdbcDao;
import io.ivan.tao.business.mycat.entity.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderJdbcDaoImpl implements OrderJdbcDao {
	
	public static final String SQL = "select * from t_order t , t_order_item m where t.id = m.order_id ";

	@Autowired
    private JdbcTemplate jdbcTemplate;

	public List<Order> showAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL, new OrderRowMapper());
	}
	
}
