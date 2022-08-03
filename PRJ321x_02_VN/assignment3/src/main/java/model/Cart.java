package model;

import java.util.*;

public class Cart {
	private List<ProductOrders> items;

	public Cart() {
		this.items = new ArrayList<>();
	}

	public Cart(List<ProductOrders> items) {
		this.items = items;
	}
	
	private ProductOrders getItemById(int id) {
			for(ProductOrders i: items) {
				if(i.getProduct().getId()==id) {
					return i;
				}
			}
		return null;
	}
	
	public int getQuantityById(int id) {
		return getItemById(id).getQuantity();
	}
	
	public void addItem(ProductOrders i) {
		if (getItemById(i.getProduct().getId()) != null) {
			ProductOrders po = getItemById(i.getProduct().getId());
			po.setQuantity(i.getQuantity()+po.getQuantity());
		}else {
			items.add(i);
		}
	}
	
	public void removeItem(int id) {
		if (getItemById(id)!= null) {
			items.remove(getItemById(id));
		}
	}
	
	public double getTotalMoney() {
		double t = 0;
		for(ProductOrders i : items) {
			t+=(i.getProduct().getPrice()*i.getQuantity());
		}
		return t;
	}

	public List<ProductOrders> getItems() {
		return items;
	}

	public void setItems(List<ProductOrders> items) {
		this.items = items;
	}
}
