package project_1;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
	/**
	 * Tạo hàm tìm kiếm sử dụng thuật toán tìm kiếm tuyến tính
	 * 
	 * @param arr
	 * @param x
	 */
	public static void linearSearch(int arr[], int x) {
		int n = arr.length;
		// tạo 1 list để lưu kết quả tìm kiếm
		List<Integer> listSearch = new ArrayList<Integer>();
		boolean isSearch = false;
		// lặp qua các phàn tử có trong mảng
		for (int i = 0; i < n; i++) {

			// nếu giá trị tại vị trí i lớn hơn giá trị cần tìm
			if (arr[i] > x) {

				isSearch = true;

				// thêm vị trí i vào list
				listSearch.add(i);
			}
		}
		if (!isSearch) {
			System.out.println("Không tìm thấy giá trị x");
		}
		System.out.println(listSearch);
		try {
			// TODO: phải thay đổi đường dẫn trong biến file khi chạy thực tế

			// tạo file OUTPUT5
			File f = new File("C:\\Users\\OS\\Desktop\\project_1\\src\\project_1\\OUTPUT4.txt");

			// Sử dụng PrintWriter ghi dữ liệu vào file output5, sử dụng bảng mã uft8
			PrintWriter pw = new PrintWriter(f, "UTF-8");

			// ghi các giá trị tìm được vào trong file output5
			pw.print("Vi tri tim kiem lon hon gia tri " + x + " la: ");

			// ghi các phần tử của listSearch vào file output5
			for (int i = 0; i < listSearch.size(); i++) {
				pw.print("\t" + listSearch.get(i));
			}

			// đóng file để các chương trình khác có thể mở file
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
