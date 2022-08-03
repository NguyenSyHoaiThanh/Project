package project2;

import java.util.Scanner;

/**
 * Lớp AS2_Main là lớp để tạo menu và thực hiện các chức năng
 * @author OS
 *
 */
public class AS2_Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		OperationToProduct OTD = new OperationToProduct();
		boolean isContinue = true;

		// tạo hàm lặp while với điều kiện true
		while (isContinue) {

			// gọi hàm show menu
			Show();

			// người dùng nhập vào các lựa chọn
			System.out.println("Choice: ");
			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				OTD.loadData();
				break;
			case 2:
				OTD.inputAndAdd();
				break;
			case 3:
				OTD.displayData();
				break;
			case 4:
				OTD.saveToFile();
				break;
			case 5:
				OTD.searchByID();
				break;
			case 6:
				OTD.deleteByID();
				break;
			case 7:
				OTD.sortByID();
				break;
			case 8:
				OTD.convertToBinary();
				break;
			case 9:
				OTD.loadToStack();
				break;
			case 10:
				OTD.loadToQueue();
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
		System.out.println("+---------------------Menu---------------------+");
		System.out.println("|      1. Load data from file and display      |");
		System.out.println("|      2. Input & add to the end.              |");
		System.out.println("|      3. Display data.                        |");
		System.out.println("|      4. Save product list to file.           |");
		System.out.println("|      5. Search by ID                         |");
		System.out.println("|      6. Delete by ID                         |");
		System.out.println("|      7. Sort by ID.                          |");
		System.out.println("|      8. Convert to Binary.                   |");
		System.out.println("|      9. Load to stack and display.           |");
		System.out.println("|      10. Load to queue and display.          |");
		System.out.println("|      0.Exit                                  |");
		System.out.println("+----------------------------------------------+");
	}

}
