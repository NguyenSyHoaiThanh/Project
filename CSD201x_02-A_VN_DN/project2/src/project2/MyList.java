package project2;

/**
 * Lớp MyList chứa thông tin và hành vi cơ bản của một danh sách móc nối
 * @author OS
 *
 */
public class MyList {
	public Node head;
	public Node tail;

	public MyList() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Thêm sản phẩm vào cuối danh sách
	 * @param product
	 */
	public void insertAtTail(Product product) {
		
		//tạo 1 node mới tên newNode
		Node newNode = new Node(product);
		
		//Nếu danh sách rỗng thêm node mới và gán vào head, tail
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		//nếu danh sách không rỗng, chèn node mới vào đuôi của danh sách.
		//gán tail của danh sách bằng node mới
		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	/**
	 * Tìm kiếm thông tin của sản phẩm theo ID
	 * @param maSP
	 * @return
	 */
	public Node searchByID(String maSP) {
		
		//tạo 1 node mới gán bằng head
		Node currentNode = this.head;
		
		//tạo vòng lặp đến hết danh sách
		while (currentNode != null) {
			//So sách mã sản phẩm trong danh sách với mã sản phẩm người dùng nhập vào
			if (currentNode.product.getMaSP().equalsIgnoreCase(maSP)) {
				
				return currentNode;
			}
			
			currentNode = currentNode.next;
		}
		return null;
	}

	/**
	 * Xóa sản phẩm trong danh sách theo ID
	 * @param maSP
	 */
	public void removeByID(String maSP) {
		
		Node temp = head, prev = null;
		
		//nếu mảng không rỗng và mã sản phẩm trong danh sách bằng với mã sản phẩm người dùng nhập vào thì gán head bằng temp.next
		if (temp != null && temp.product.getMaSP().equalsIgnoreCase(maSP)) {
			head = temp.next;
			return;
		}
		
		//nếu mảng không rỗng và mã sản phẩm trong danh sách không bằng với mã sản phẩm người dùng nhập vào
		//thì gán prev bằng vị trí temp và tem bằng vị trí tiếp theo
		while (temp != null && !temp.product.getMaSP().equalsIgnoreCase(maSP)) {
			prev = temp;
			temp = temp.next;
		}
	
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}
	
	/**
	 * Sắp xếp các sản phẩm  trong danh sách theo ID
	 */
	public void sortByID() {
		Node current = this.head;
		Node index = null;
		
		//tạo vòng lặp đến hết danh sách
		while (current != null) {
			//index sẽ bằng vị trí tiếp theo của current
			index = current.next;
			
			while (index != null) {

				//so sách mã sản phẩm tại vị trí current và tại vị trí index
				if (current.product.getMaSP().compareTo(index.product.getMaSP()) > 0) {
					
					//hoán đổi vị trí sản phẩm
					Product temp = current.product;
					current.product = index.product;
					index.product = temp;
				}
				
				index = index.next;
			}
			
			current = current.next;
		}
	}
	/**
	 * Biểu diễn số lượng sản phẩm ở hệ đếm cơ số 10 về hệ đếm nhị phân
	 * @param node
	 * @return
	 */
	public Node convertBinary(Node node) {
		
		if(node == null) {
			return null;
		}
		
		//tạo 1 node mới
		Product product = node.product;
		
		//tạo biến số lượng lấy ra số lượng sản phẩm trong danh sách
		int soLuong = product.getSoLuong();
		
		//tạo biến resultBinary
		String resultBinary = "";
		
		//tạo vòng lặp đến khi số lượng bằng 0
		while (soLuong > 0) {
			//tạo biến value gán bằng phần dư của số lượng chia 2 
			int value = soLuong % 2;
			
			//số lượng gán bằng giá trị sau khi chia 2
			soLuong = soLuong / 2;
			
			//lấy ra kết quả sau khi đã chia lấy phần dư và lưu vào biến resultBinary
			resultBinary += String.valueOf(value);
		}
		
		//gán kết quả vào resultBinary của lớp product
		product.resultBinary = resultBinary;
		
		return convertBinary(node.next);
	}
	
	/**
	 * In danh sách ra màn hình
	 */
	public void printList() {
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.printData();
			currentNode = currentNode.next;
		}
	}
	
	/**
	 * in danh sách sau khi đã chuyển đổi số lượng sản phẩm sang nhị phân
	 */
	public void printResultBinary() {
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.printBimary();
			currentNode = currentNode.next;
		}
	}
}
