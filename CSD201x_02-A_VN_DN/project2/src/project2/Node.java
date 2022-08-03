package project2;

/**
 * Lớp Node để quản lý thông tin và hành  của vi mỗi node trong danh sách
 * @author OS
 *
 */
public class Node {
	public Product product;
	public Node next;
	
	public Node(Product product) {
		this.product = product;
		this.next = null;
	}
	
	public void printData() {
		product.printInfo();
	}
	
	public void printBimary() {
		product.printResultBinary();
	}
	
}
