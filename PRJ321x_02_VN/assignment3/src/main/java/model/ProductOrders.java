package model;

public class ProductOrders {
	private int id;
	private double price;
	private int quantity;
	private Orders order;
	private Product product;
	
	public ProductOrders() {
	}

	public ProductOrders(int id, double price, int quantity, Orders order, Product product) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}

	public ProductOrders(double price, int quantity, Product product) {
		this.price = price;
		this.quantity = quantity;
		this.product = product;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double f) {
		this.price = f;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
