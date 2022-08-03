package project_1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

public class SelectionSort {
	/**
	 * Tạo hàm sắp xếp sử dụng thuật toán sắp xếp chọn
	 * 
	 */
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		// tạo mảng arr2 copy phần tử từ mảng arr
		int[] arr2 = arr.clone();

		// lấy giá trị thời gian khi bắt đầu thuật toán
		long start = System.currentTimeMillis();

		// Duyệt qua các phần tử trong mảng arr2
		for (int i = 0; i < n; i++) {
			// thiết lập phần tử hiện tại là min
			int indexMin = i;

			// kiểm tra phần tử hiện tại có phải là nhỏ nhất không
			for (int j = i + 1; j < n; j++) {

				// nếu phần tử tại vị trí j nhỏ hơn phần tử tại vị trí min thì gán min bằng vị
				// trí j;
				if (arr2[j] < arr2[indexMin]) {
					indexMin = j;
				}
			}

			// nếu min khác i thì hoán đổi vị trí i và min
			if (indexMin != i) {

				// tạo 1 biến trung gian temp và gán giá trị bằng giá trị arr tại vị trí min
				int temp = arr2[indexMin];

				// lấy giá trị arr tại vị trí i gán cho arr tại vị trí min
				arr2[indexMin] = arr2[i];

				// gán temp cho arr tại vị trí i
				arr2[i] = temp;
			}

			// Xuất ra Kết quả sắp xếp tại mỗi bước của thuật toán
			for (int k = 0; k < n; k++) {
				System.out.print(" " + arr2[k]);
			}
			System.out.println();
		}

		// lấy giá trị thời gian sau khi kết thúc thật toán
		long end = System.currentTimeMillis();

		// xuất ra mảng sau khi đã sắp xếp
		System.out.println(Arrays.toString(arr2));

		// Xuất ra thời gian chạy của thuật toán
		System.out.println("Total execution time: " + (end - start));

		try {
			// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế

			// tạo file OUTPUT2
			File f = new File("C:\\Users\\OS\\Desktop\\project_1\\src\\project_1\\OUTPUT2.txt");

			// Sử dụng PrintWriter ghi dữ liệu vào file output3, sử dụng bảng mã uft8
			PrintWriter pw = new PrintWriter(f, "UTF-8");

			// ghi mảng arr sau khi sắp xếp vào trong file output3
			pw.println("Array a:" + Arrays.toString(arr2));

			// đóng file để các chương trình khác có thể mở file
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
