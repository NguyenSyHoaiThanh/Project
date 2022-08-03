package project_1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

public class BubbleSort {
	/**
	 * Tạo hàm sắp xếp sử dụng thuật toán sắp xếp nổi bọt
	 * 
	 */
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		// tạo mảng arr1 copy phần tử từ mảng arr
		int[] arr1 = arr.clone();

		// lấy giá trị thời gian khi bắt đầu thuật toán
		long start = System.currentTimeMillis();

		// duyệt qua các phần tử của mảng arr1
		for (int i = 0; i < n - 1; i++) {
			// duyệt qua các phần từ để so sánh và sắp xếp
			for (int j = 0; j < n - i - 1; j++) {

				// nếu vị trí của mảng tại vị trí j lớn hơn vị trí của mảng tại vị trí j+1 thì
				// hoán đổi vị trí của 2 giá trị
				if (arr1[j] > arr1[j + 1]) {

					// tạo biến trung gian temp và gán bằng giá trị của mảng tại vị trí j
					int temp = arr1[j];

					// lấy giá trị của mảng tại vị trí j+1 gán vào giá trị của mảng tại vị trí j
					arr1[j] = arr1[j + 1];

					// lấy giá trị temp gán vào giá trị của mảng tại vị trí j+1
					arr1[j + 1] = temp;

					// Xuất ra Kết quả sắp xếp tại mỗi bước của thuật toán
					for (int k = 0; k < n; k++) {
						System.out.print(" " + arr1[k]);
					}
					System.out.println();
				}
			}
		}

		// lấy giá trị thời gian sau khi kết thúc thật toán
		long end = System.currentTimeMillis();

		// Xuất ra mảng sau khi đã sắp xếp
		System.out.println(Arrays.toString(arr1));

		// Xuất ra thời gian chạy của thuật toán
		System.out.println("Total execution time: " + (end - start));

		// ghi vào file
		try {
			// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế

			// tạo file OUTPUT1
			File f = new File("C:\\Users\\OS\\Desktop\\project_1\\src\\project_1\\OUTPUT1.txt");

			// Sử dụng PrintWriter ghi dữ liệu vào file output2, sử dụng bảng mã uft8
			PrintWriter pw = new PrintWriter(f, "UTF-8");

			// ghi mảng arr sau khi sắp xếp vào trong file output2
			pw.println("Array a:" + Arrays.toString(arr1));

			// đóng file để các chương trình khác có thể mở file
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
