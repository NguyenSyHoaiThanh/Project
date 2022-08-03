package project2;

/**
 * Lớp MyStack chứa thông tin và các hành vi cơ bản của stack
 * @author OS
 *
 */
public class MyStack implements IStackQueue{
	private Node top;
	public MyStack() {
		this.top = null;
	}
	
	/**
	 * Thêm sản phẩm vào trong stack
	 */
	@Override
	public void push(Product product) {
		Node  node = new Node(product);
		node.next = top;
		top = node;
	}
	
	/**
	 * loại bỏ sản phẩm ở trong stack
	 */
	@Override
	public Product pop() {
	
		if(isEmpty()) {
			return null;
		}
		Product prod = top.product;
		top = top.next;
		return prod;
	}
	
	/**
	 * Kiểm tra stack rỗng
	 */
	@Override
	public boolean isEmpty() {	
		return this.top == null;
	}

	/**
	 * Xuất stack ra màn hình
	 */
	@Override
	public void show() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return;
		}
		Node temp = top;
		while (temp != null) {
			temp.product.printInfo();
			temp = temp.next;
		}
	}
	
}
