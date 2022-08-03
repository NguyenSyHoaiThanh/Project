package project2;

/**
 * Lớp MyQueue chứ thông tin và các hành vi cơ bản của queue 
 * @author OS
 *
 */
public class MyQueue implements IStackQueue {
	private Node head, tail;

	public MyQueue() {
		head = tail = null;
	}
	
	/**
	 * thêm 1 sản phẩm vào hàng đợi.
	 */
	@Override
	public void push(Product product) {
		Node newNode = new Node(product);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	/**
	 *  xóa 1 sản phẩm khỏi hàng đợi.
	 */
	@Override
	public Product pop() {
		
		if (isEmpty()) {
			return null;
		}
		Product prod = head.product;
		if (head == tail) {
			head = tail = null;
		}else {
			head = head.next;
		}
		return prod;
	}
	/**
	 * kiểm tra sản phẩm có rỗng không.
	 */
	@Override
	public boolean isEmpty() {
		return (head == null);
	}
	
	/**
	 * Hiển thị hàng đợi
	 */
	@Override
	public void show() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}

		Node curNode = head;
		while (curNode != null) {
			curNode.product.printInfo();
			curNode = curNode.next;
		}
		System.out.println();
		
	}
	
}
