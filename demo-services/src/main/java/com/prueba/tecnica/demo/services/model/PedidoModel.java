package com.prueba.tecnica.demo.services.model;

import java.io.Serializable;

public class PedidoModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6546751828289874642L;
	
	private double total;
	private String sku;
	private double amout;
	private double price;

	public PedidoModel() {
		super();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getAmout() {
		return amout;
	}

	public void setAmout(double amout) {
		this.amout = amout;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PedidoModel [total=").append(", total=").append(total).append(", sku=").append(sku).append(", amout=").append(amout).append(", price=")
				.append(price).append("]");
		return builder.toString();
	}

}
