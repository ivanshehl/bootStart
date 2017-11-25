package io.ivan.tao.business.mycat;

import java.sql.ResultSet;
import java.sql.SQLException;

import io.ivan.tao.business.mycat.entity.Order;

import org.springframework.jdbc.core.RowMapper;

public class OrderRowMapper implements RowMapper<Order> {

	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setId(rs.getLong("id"));
		order.setStatus(rs.getString("status"));
		order.setUserId(rs.getInt("user_id"));
		return order;
	}

}
