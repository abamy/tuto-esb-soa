package com.developpez.esb.utils;

import org.example.GetOrderStatusResponseType;
import org.example.GetOrderStatusType;
import org.example.ObjectFactory;
import org.example.OrderConfirmationType;
import org.example.PurchaseOrderType;

import com.developpez.esb.dto.OrderDto;

public class CXFAdapter {

	/**
	 * converts inbound CXF bean purchaseOrderType to API bean orderDto
	 * 
	 * @param purchaseOrderType
	 * @return orderDto
	 */
	public static OrderDto fromPurchaseOrderType(PurchaseOrderType purchaseOrderType) {
		OrderDto orderDto = new OrderDto();

		orderDto.setProductName(purchaseOrderType.getProductName());
		orderDto.setQuantity(purchaseOrderType.getQuantity());

		return orderDto;
	}

	/**
	 * converts inbound CXF bean getOrderStatusType to API bean orderDto
	 * 
	 * @param getOrderStatusType
	 * @return orderDto
	 */
	public static OrderDto fromGetOrderStatusType(GetOrderStatusType getOrderStatusType) {
		OrderDto orderDto = new OrderDto();

		orderDto.setOrderID(getOrderStatusType.getOrderID());

		return orderDto;
	}

	/**
	 * converts API bean orderDto to outbound CXF bean purchaseOrderType
	 * 
	 * @param orderDto
	 * @return getOrderStatusResponseType
	 */
	public static GetOrderStatusResponseType toGetOrderStatusResponseType(OrderDto orderDto) {
		org.example.ObjectFactory objectFactory = new ObjectFactory();
		GetOrderStatusResponseType getOrderStatusResponseType = objectFactory.createGetOrderStatusResponseType();

		getOrderStatusResponseType.setOrderID(orderDto.getOrderID());
		getOrderStatusResponseType.setStatus(orderDto.getStatus());

		return getOrderStatusResponseType;
	}

	/**
	 * converts API bean orderDto to outbound CXF bean orderConfirmationType
	 * 
	 * @param orderDto
	 * @return orderConfirmationType
	 */
	public static OrderConfirmationType toOrderConfirmationType(OrderDto orderDto) {
		org.example.ObjectFactory objectFactory = new ObjectFactory();
		OrderConfirmationType orderConfirmationType = objectFactory.createOrderConfirmationType();

		orderConfirmationType.setOrderID(orderDto.getOrderID());
		orderConfirmationType.setExpectedShipDate(orderDto.getExpectedShipDate());

		return orderConfirmationType;
	}
}
