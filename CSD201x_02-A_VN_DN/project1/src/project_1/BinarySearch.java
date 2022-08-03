package project_1;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class BinarySearch {
	/**
	 * tạo hàm tìm kiếm sử dụng thuật toán tìm kiếm nhị phân
	 * @param arr
	 * @param x
	 */
	public static void binarySearch(int arr[], int x) {
		int n = arr.length;
		// tạo mảng arr4 copy phần tử từ mảng arr
		int[] arr4 = arr.clone();

		// lặp qua các phần tử của mảng
		for (int i = 1; i < n; i++) {

			// tạo 1 biến key và gán giá trị bằng giá trị của mảng tại vị trí i
			int key = arr4[i];

			// tạo biến j và gán giá trị bằng i - 1
			int j = i - 1;

			// Sử dụng hàm lặp while với biểu thức điều kiện j lớn hơn hoặc bằng 0 và giá
			// trị của mảng tại vị trí j lớn hơn key
			while (j >= 0 && arr4[j] > key) {

				// gán giá trị tại vị trí j cho arr tại vị trí j+1
				arr4[j + 1] = arr4[j];
				j = j - 1;
			}
			// gán key cho arr tại vị trí j+1
			arr4[j + 1] = key;
		}

		// Sau khi sắp xếp tiến hành tìm vị trí bằng thuật toán nhị phân
		// tạo biến middle, left và right
		int left = 0;
		int right = n - 1;

		while (left < right) {

			int middle = (left + right) / 2;

			if (arr4[middle] < x) {
				left = middle + 1;
			} else {
				right = middle;
			}
		}

		try {
			// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế

			// tạo file OUTPUT6
			File f = new File("C:\\Users\\OS\\Desktop\\project_1\\src\\project_1\\OUTPUT5.txt");

			// Sử dụng PrintWriter ghi dữ liệu vào file output5, sử dụng bảng mã uft8
			PrintWriter pw = new PrintWriter(f, "UTF-8");

			// ghi các giá trị tìm được vào trong file output6
			if (arr4[left] == x) {
				pw.println("Vi tri can tim: " + left);
			} else {
				pw.print("Không tìm thấy giá trị " + x);
			}

			// đóng file để các chương trình khác có thể mở file
			pw.close();
			// Sử dụng readAllLines để đọc file Output1, sử dụng bảng mã uft8 và gán vào
			// list allText
			List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);

			// sử dụng hàm for để lấy tất cả dữ liệu từ list allText
			for (String line : allText) {
				System.out.println(line);
			}
			//
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
