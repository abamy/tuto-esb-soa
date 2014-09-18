package com.developpez.esb.dto;

import java.io.Serializable;

public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8196150634142289321L;
	protected Long orderID;
	protected String expectedShipDate;
	protected Integer quantity;
	protected String productName;
    protected String status;

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public String getExpectedShipDate() {
		return expectedShipDate;
	}

	public void setExpectedShipDate(String expectedShipDate) {
		this.expectedShipDate = expectedShipDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
