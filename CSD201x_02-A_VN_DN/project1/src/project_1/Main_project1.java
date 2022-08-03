package project_1;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main_project1 {
	static Scanner sc = new Scanner(System.in);

	// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế	
	static File f = new File("C:\\Users\\OS\\Desktop\\project_1\\src\\project_1\\INPUT.txt");

	public static void main(String[] args) {
		// tạo biến n, arr, isContinue và choose
		int n = 0;
		int[] arr = new int[n];
		int choose;
		boolean isContinue = true;

		// tạo hàm lặp while với điều kiện true
		while (isContinue) {

			// gọi hàm show menu
			Show();

			// người dùng nhập vào các lựa chọn
			System.out.println("Choice: ");
			choose = sc.nextInt();

			switch (choose) {
			case 1:
				// Người dùng nhập số lượng và giá trị phần tử của mảng
				arr = nhapMang();
				break;
			case 2:
				// Xuất dữ liệu từ file output
				xuatINPUT();
				break;
			case 3:
				// gọi hàm bubbleSort
				BubbleSort newBubbleSort = new BubbleSort();
				newBubbleSort.bubbleSort(arr);
				break;
			case 4:
				// gọi hàm selectionSort
				SelectionSort newSelectionSort  = new SelectionSort();
				newSelectionSort.selectionSort(arr);
				break;
			case 5:
				// gọi hàm insertionSort
				InsertionSort newInsertionSort = new InsertionSort();
				newInsertionSort.insertionSort(arr);
				break;
			case 6:
				// người dùng nhập vào giá trị cần tìm
				System.out.println("Nhap gia tri can tim");
				int x = sc.nextInt();

				// gọi hàm searchValue1
				LinearSearch newLinearSearch = new LinearSearch();
				newLinearSearch.linearSearch(arr, x);
				break;
			case 7:
				// người dùng nhập vào giá trị cần tìm
				System.out.println("Nhap gia tri can tim");
				x = sc.nextInt();
				BinarySearch newBinarySearch = new BinarySearch();
				newBinarySearch.binarySearch(arr, x);
				break;
			case 0:
				isContinue = false;
				break;
			default:
				System.out.println("Nhập sai giá trị, vui lòng nhập lại");
			}
		}
	}

	/**
	 * Hiểu thị menu
	 */
	static void Show() {
		System.out.println("+-------------------Menu------------------+");
		System.out.println("|      1.Input                            |");
		System.out.println("|      2.Output                           |");
		System.out.println("|      3.Bubble sort                      |");
		System.out.println("|      4.Selection sort                   |");
		System.out.println("|      5.Insertion sort                   |");
		System.out.println("|      6.Search > value                   |");
		System.out.println("|      7.Search = value                   |");
		System.out.println("|      0.Exit                             |");
		System.out.println("+-----------------------------------------+");
	}

	/**
	 * Nhập số phần tử của mảng và lưu vào trong file input
	 * 
	 * @return n
	 */
	public static int[] nhapMang() {
		// người dùng nhập giá trị n
		System.out.println("Nhập giá trị n = ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		// lặp qua các phần tử của mảng
		for (int i = 0; i < arr.length; i++) {

			// Người dùng nhập vào giá trị từng phần tử
			System.out.print("Nhập giá trị [" + (i + 1) + "] của mảng: ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		try {
			// Sử dụng PrintWriter ghi dữ liệu vào file input
			PrintWriter pw = new PrintWriter(f, "UTF-8");

			// ghi biến n vào trong file input
			pw.println("Input number of elements:" + n);
			pw.println("Array: " + Arrays.toString(arr));

			// đóng file để các chương trình khác có thể mở file
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// trả về giá trị n
		return arr;
	}

	/**
	 * tạo hàm xuất INPUT để lấy giá trị từ file INPUT
	 * 
	 * @param arr
	 */
	public static void xuatINPUT() {
		System.out.println("Read from file");

		try {
			// Sử dụng readAllLines để đọc file Output1, sử dụng bảng mã uft8 và gán vào
			// list allText
			List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);

			// sử dụng hàm for để lấy tất cả dữ liệu từ list allText
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
