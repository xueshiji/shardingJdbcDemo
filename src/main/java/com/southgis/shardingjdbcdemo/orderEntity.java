package com.southgis.shardingjdbcdemo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_order")
@ToString
public class orderEntity {
	@TableId(value = "order_id", type = IdType.INPUT)
	private String order_id;

	private String name;

	private double price;
}
