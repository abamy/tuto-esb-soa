package com.developpez.esb.service;

import java.util.Date;

import com.developpez.esb.dto.OrderDto;

/*
 * this is a mock of your api service
 */
public class OrderManagementService {

	public OrderDto getOrderConfirmation(OrderDto orderDto) {
		orderDto.setExpectedShipDate(new Date().toString());
		return orderDto;
	}

	public OrderDto getOrderStatus(OrderDto orderDto) {
		orderDto.setStatus("Ready to send");
		return orderDto;
	}

}
