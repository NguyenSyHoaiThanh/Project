package project_1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

public class InsertionSort {
	/**
	 * Tạo hàm sắp xếp sử dụng thuật toán sắp xếp chèn
	 */
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		// tạo mảng arr3 copy phần tử từ mảng arr
		int[] arr3 = arr.clone();

		// lấy giá trị thời gian khi bắt đầu thuật toán
		long start = System.currentTimeMillis();

		// lặp qua các phần tử trong mảng arr3
		for (int i = 1; i < n; i++) {

			// tạo 1 biến key và gán giá trị bằng giá trị của mảng tại vị trí i
			int key = arr3[i];

			// tạo biến j và gán giá trị bằng i - 1
			int j = i - 1;

			// Sử dụng hàm lặp while với biểu thức điều kiện j lớn hơn hoặc bằng 0 và giá
			// trị của mảng tại vị trí j lớn hơn key
			while (j >= 0 && arr3[j] > key) {

				// gán giá trị tại vị trí j cho arr tại vị trí j+1
				arr3[j + 1] = arr3[j];

				j--;
			}

			// gán key cho arr tại vị trí j+1
			arr3[j + 1] = key;

			// Xuất ra Kết quả sắp xếp tại mỗi bước của thuật toán
			for (int k = 0; k < n; k++) {
				System.out.print(" " + arr3[k]);
			}
			System.out.println();
		}

		// lấy giá trị thời gian sau khi kết thúc thật toán
		long end = System.currentTimeMillis();

		// xuất ra mảng sau khi đã sắp xếp
		System.out.println(Arrays.toString(arr3));

		// Xuất ra thời gian chạy của thuật toán
		System.out.println("Total execution time: " + (end - start));

		try {
			// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế

			// tạo file OUTPUT4
			File f = new File("C:\\Users\\OS\\Desktop\\project_1\\src\\project_1\\OUTPUT3.txt");

			// Sử dụng PrintWriter ghi dữ liệu vào file output4, sử dụng bảng mã uft8
			PrintWriter pw = new PrintWriter(f, "UTF-8");

			// ghi mảng arr sau khi sắp xếp vào trong file output4
			pw.println("Array a:" + Arrays.toString(arr3));

			// đóng file để các chương trình khác có thể mở file
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
