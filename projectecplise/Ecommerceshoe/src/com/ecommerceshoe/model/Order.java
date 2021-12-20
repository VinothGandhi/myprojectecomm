package com.ecommerceshoe.model;

import java.util.Objects;

public class Order {
	private Product product;
	private Users user;
	private int quantity;
	private double price;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Order(Product product, Users user, int quantity, double price) {
		super();
		this.product = product;
		this.user = user;
		this.quantity = quantity;
		this.price = price;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", user=" + user + ", quantity=" + quantity + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, product, quantity, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(product, other.product) && quantity == other.quantity
				&& Objects.equals(user, other.user);
	}
	
	

}