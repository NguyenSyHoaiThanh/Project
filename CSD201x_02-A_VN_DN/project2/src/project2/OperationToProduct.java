package project2;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

/**
 * Lớp OperationToProduct sẽ chứa các phương thức thức biểu diễn các yêu cầu chức năng của bài toán
 * @author OS
 *
 */
public class OperationToProduct {
	static Scanner sc = new Scanner(System.in);
	
	// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế
	static File f1 = new File("..\\project2\\src\\project2\\Data.txt");
	
	MyList list = new MyList();

	/**
	 *  Đọc dữ liệu có sẵn từ file chứa các sản phẩm rồi lưu vào Linked List
	 */
	public void loadData() {
		try {
			 
			
			// list allText
			List<String> allText = Files.readAllLines(f1.toPath(), StandardCharsets.UTF_8);
			 
			// sử dụng hàm for để lấy tất cả dữ liệu từ list allText
			for (String line : allText) {
				String[] productsInfor = line.split(",");
				System.out.print("id: " + productsInfor[0]);
				System.out.print(" name: " + productsInfor[1]);
				System.out.print(" Quantity: " + productsInfor[2]);
				System.out.print(" price: " + productsInfor[3]);
				System.out.println();

				Product product = new Product();
				product.setMaSP(productsInfor[0]);
				product.setTenSP(productsInfor[1]);
				product.setSoLuong(Integer.parseInt(productsInfor[2]));
				product.setDonGia(Float.parseFloat(productsInfor[3]));

				list.insertAtTail(product);
			}
			System.out.println();
			System.out.println("Successfully!");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *  Nhập và thêm một sản phẩm vào cuối của danh sách Linked List
	 */
	public void inputAndAdd() {
		Product product = new Product();
		product.input();

		list.insertAtTail(product);
	}

	/**
	 *  Hiển thị thông tin của các sản phẩm trong Linked List
	 */
	public void displayData() {
		list.printList();
	}

	/**
	 *  Lưu danh sách các sản phẩm vào file
	 */
	public void saveToFile() {
		try {
			// Sử dụng PrintWriter ghi dữ liệu vào file input
			PrintWriter pw = new PrintWriter(f1, "UTF-8");

			// ghi biến n vào trong file input

			Node head = list.head;

			while (head.next != null) {
				pw.println(head.product.getMaSP() + ","+head.product.getTenSP()+ ","+head.product.getSoLuong()+ ","+head.product.getDonGia()+ ",");
				 
				
				head = head.next;
			}
			pw.println(head.product.getMaSP() + ","+head.product.getTenSP()+ ","+head.product.getSoLuong()+ ","+head.product.getDonGia()+ ",");
			// đóng file để các chương trình khác có thể mở file
			pw.close();
			System.out.println("Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *  Tìm kiếm thông tin của sản phẩm theo ID
	 */
	public void searchByID() {
		System.out.print("Nhập mã sản phẩm cần tìm: ");
		String id = sc.next();

		Node searchNode = list.searchByID(id);
		if (searchNode != null) {
			System.out.println("Sản phẩmm cần tìm là");
			searchNode.product.printInfo();
		} else {
			System.out.println("Sản phẩm có mã = " + id + " không có trong danh sách");
		}
	}

	/**
	 *  Xóa sản phẩm trong danh sách theo ID
	 */
	public void deleteByID() {
		System.out.println("Nhập mã sản phẩm cần xóa");
		String id = sc.next();
		list.removeByID(id);
		System.out.println("Successfully!");
	}

	/**
	 *  Sắp xếp các sản phẩm trong danh sách theo ID
	 */
	public void sortByID() {
		list.sortByID();
		System.out.println("Successfully!");
	}

	/**
	 * Biểu diễn số lượng sản phẩm ở hệ đếm cơ số 10 về hệ đếm nhị phân
	 */
	public void convertToBinary() {
		list.convertBinary(list.head);
		list.printResultBinary();
	}
	
	/**
	 * Đọc dữ liệu từ file chứa các sản phẩm rồi lưu vào stack
	 */
	public void loadToStack() {
		MyStack stack = new MyStack();
		try {
			
			// list allText
			List<String> allText = Files.readAllLines(f1.toPath(), StandardCharsets.UTF_8);
			
			// sử dụng hàm for để lấy tất cả dữ liệu từ list allText
			for (String line : allText) {
				String [] productsInfor = line.split(",");
				
				Product product2 = new Product();
				product2.setMaSP(productsInfor[0]);
				product2.setTenSP(productsInfor[1]);
				product2.setSoLuong(Integer.parseInt(productsInfor[2]));
				product2.setDonGia(Float.parseFloat(productsInfor[3]));
				
				stack.push(product2);

			}
			stack.show();
			System.out.println();
			System.out.println("Successfully!");
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Đọc dữ liệu từ file chứa các sản phẩm lưu vào queue.
	 */
	public void loadToQueue() {
		MyQueue queue = new MyQueue();
		try {
			
			// list allText
			List<String> allText = Files.readAllLines(f1.toPath(), StandardCharsets.UTF_8);
			
			// sử dụng hàm for để lấy tất cả dữ liệu từ list allText
			for (String line : allText) {
				String [] productsInfor = line.split(",");
				
				Product product2 = new Product();
				product2.setMaSP(productsInfor[0]);
				product2.setTenSP(productsInfor[1]);
				product2.setSoLuong(Integer.parseInt(productsInfor[2]));
				product2.setDonGia(Float.parseFloat(productsInfor[3]));
				
				queue.push(product2);

			}
			queue.show();
			System.out.println();
			System.out.println("Successfully!");
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
