package com.southgis.shardingjdbcdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {
	@Autowired
	private orderMapper orderMapper;

	@Test
	void contextLoads() {
		orderMapper.insert(new orderEntity("0", "name", 1.0));
		orderMapper.insert(new orderEntity("1", "name", 1.0));
		orderMapper.insert(new orderEntity("2", "name", 1.0));
		orderMapper.insert(new orderEntity("3", "name", 1.0));
		List<orderEntity> orderEntities = orderMapper.selectList(null);
		System.out.println(orderEntities);
		System.out.println(orderMapper.deleteById("3"));
		orderMapper.updateById(new orderEntity("2", "name2", 2.0));
		System.out.println(orderMapper.selectById(2));
		orderMapper.delete(null);
	}

}
