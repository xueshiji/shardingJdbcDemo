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
		orderMapper.insert(new orderEntity("0","name0",1.0));
		orderMapper.insert(new orderEntity("1","name0",1.0));
		orderMapper.insert(new orderEntity("2","name0",1.0));
		orderMapper.insert(new orderEntity("3","name0",1.0));
		List<orderEntity> orderEntities = orderMapper.selectList(null);
		System.out.println(orderEntities);
		System.out.println(orderMapper.deleteById("3"));
		orderMapper.updateById(new orderEntity("3","name0",2.0));
		orderEntities = orderMapper.selectList(null);
		System.out.println(orderEntities);
		orderMapper.delete(null);
	}

}
