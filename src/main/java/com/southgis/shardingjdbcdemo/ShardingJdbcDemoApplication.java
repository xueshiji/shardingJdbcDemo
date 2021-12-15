package com.southgis.shardingjdbcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.southgis.shardingjdbcdemo")
public class ShardingJdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcDemoApplication.class, args);
	}

}
