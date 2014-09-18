package com.developpez.esb.service;

import com.developpez.esb.dto.OrderDto;

public interface IOrderManagementService {

	public OrderDto getOrderConfirmation(OrderDto orderDto);

	public OrderDto getOrderStatus(OrderDto orderDto);
	
}
