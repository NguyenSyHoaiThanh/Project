package GradeStudent;

import java.util.Iterator;
import java.util.Scanner;

public class GradeStudent {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		begin();
		report();
	}

	/**
	 * begin hiển thị thông điệp chào mừng.
	 */
	public static void begin() {
		System.out.println("This program reads exam/homework scores and reports your overall course grade");
		System.out.println();
	}

	/**
	 * midTerm() nhập và tính toán điểm thi giữa kỳ. 
	 * @return weight, resultMidTerm
	 */
	public static double[] midTerm(double[] a) {
		System.out.println("Mid term:");
		System.out.print("Weight (0-100): ");
		int weight1 = sc.nextInt();

		System.out.print("Score earned: ");
		int scoreE = sc.nextInt();
		
		System.out.print("Were scores shifted (1 = yes, 2 = no): ");
		int scoreS = sc.nextInt();
		
		int totalPoint;
		// Nếu người dùng nhập giá trị 1 thì điểm thi sẽ đc tăng, 2 thì không
		if (scoreS == 1) {
			System.out.print("Shift amount: ");
			int shift = sc.nextInt();
			totalPoint = scoreE + shift;

			//nếu tổng điểm thi cộng với điểm tăng thêm lớn hơn 100 thì điểm tổng bằng 100
			if (totalPoint > 100) {
				totalPoint = 100;
			}
			System.out.println("Total points = " + totalPoint + "/100");
		} else {
			totalPoint = scoreE;
	
			//Nếu điểm số người dùng nhập vào lớn hơn 100 thì tổng điểm bằng 100
			if (scoreE > 100) {
				totalPoint = 100;
			}
			System.out.println("Total points = " + totalPoint + "/100");
		}

		double weightScore = (double) totalPoint / 100 * weight1;
		double resultMidTerm = Math.round(weightScore * 10.0) / 10.0;

		System.out.println("Weight score = " + resultMidTerm + "/" + weight1);
		
		//trả về weight và weightScore
		a[0] = weight1;
		a[1] +=  weightScore;
		return a;
	}

	/**
	 * finalTerm() nhập và tính toán điểm thi cuối kỳ 
	 * @return weight, resultFinalTerm
	 */
	public static double[] finalTerm(double[] a) {
		System.out.println("Final term:");
		System.out.print("Weight (0-100): ");

		int weight2 = sc.nextInt();
		//Nếu trọng số của điểm giữa kỳ và điểm cuối kỳ cộng với nhau lớn hơn 100 thì sẽ nhập lại
		 
		while (weight2 + a[0] > 100) {
			System.out.print("Nhập sai điểm, vui lòng nhập lại: ");
			weight2 = sc.nextInt();
		}

		System.out.print("Score earned: ");
		int scoreE = sc.nextInt();

		System.out.print("Were scores shifted (1 = yes, 2 = no): ");
		int scoreS = sc.nextInt();

		int totalPoint;

		//Nếu người dùng nhập giá trị 1 thì điểm thi sẽ đc tăng, 2 thì không

		if (scoreS == 1) {
			System.out.print("Shift amount: ");
			int shift = sc.nextInt();

			totalPoint = scoreE + shift;

			
			//nếu tổng điểm thi cộng với điểm tăng thêm lớn hơn 100 thì điểm tổng bằng 100
			if (totalPoint > 100) {
				totalPoint = 100;
			}
			System.out.println("Total points = " + totalPoint + "/100");

		} else {
			totalPoint = scoreE;
			
			//Nếu điểm số người dùng nhập vào lớn hơn 100 thì tổng điểm bằng 100
			if (scoreE > 100) {
				totalPoint = 100;
			}

			System.out.println("Total points = " + totalPoint + "/100");
		}

		double weightScore = (double) totalPoint / 100 * weight2;
		double resultFinalTerm = Math.round(weightScore * 10.0) / 10.0;
		System.out.println("Weight score = " + resultFinalTerm + "/" + weight2);

		a[0] = weight2 + a[0];
		a[1] +=  weightScore;
		return a;
	}
	/**
	 * homeWork() nhập và tính toán điểm bài tập về nhà.
	 * @return weight, resultHomework
	 */
	public static double[] homeWork(double[] a) {
		int score = 0;
		int max = 0;
		double weight = 0;

		System.out.println("Homework: ");
		System.out.print("Weight (0-100): ");
		
		//Nếu trọng số của điểm giữa kỳ, điểm cuối kỳ và điểm bài tập về nhà cộng với
		//nhau lớn hơn 100 thì sẽ nhập lại
		double weight3 = sc.nextInt();
		weight = a[0] + weight3;
		while (weight > 100) {
			System.out.print("Nhập sai điểm, vui lòng nhập lại:");
			weight3 = sc.nextInt();
			weight = a[0]+weight3;
		}
		System.out.print("Number of assignments: ");
		int numAsm = sc.nextInt();
		
		//vòng lặp để người dùng nhập điểm các assigment tương ứng
		for (int i = 1; i <= numAsm; i++) {
			System.out.print("Assignment " + i + " score and max = ");
			int score1 = sc.nextInt();
			int max1 = sc.nextInt();
			score += score1;
			max += max1;
		}
		//Nếu điểm vượt quá 150 thì điểm bằng 150 
		if (score > 150) {
			score = 150;
		}

		System.out.print("How many sections did you attend = ");
		int attend = sc.nextInt();

		int sectionPoints = attend * 5;

		if (sectionPoints > 30) {
			sectionPoints = 30;
		}

		System.out.println("Section points = " + sectionPoints + "/30");
		double totalPoint = (double) score + sectionPoints;
		System.out.println("Total points = " + totalPoint + "/" + (max + 30));

		double weightScore = (double) totalPoint / (max + 30) * weight3;
		double resultHomework = Math.round(weightScore * 10.0) / 10.0;
		System.out.println("Weight score = " + resultHomework + "/" + weight3);

		a[0] = weight3;
		a[1] +=  weightScore;
		return a;
	}
	 /**
	  * hàm tính tổng điểm
	  * return giá trị điểm sau khi tính toán
	  */
	public static double overallPercentage(double a) {
		return Math.round(a)*10.0/10.0;
	}
	
	/**
	 * report() tính toán về hiển thị kết quả GPA cũng như thông báo nhận xét tương ứng.
	 */
	public static void report() {
		double[] a = { 0, 0};

		midTerm(a);
		System.out.println();

		finalTerm(a);
		System.out.println();
		
		homeWork(a);
		System.out.println();

		System.out.println("Overall percentage = " + overallPercentage(a[1]));

		if (overallPercentage(a[1]) >= 85) {
			System.out.println("Your grade will be at least: 3.0");

		} else if (overallPercentage(a[1]) < 85 && overallPercentage(a[1]) >= 75) {

			System.out.println("Your grade will be at least: 2.0");

		} else if (overallPercentage(a[1]) < 75 && overallPercentage(a[1]) >= 60) {
			System.out.println("Your grade will be at least: 1.0");

		} else {

			System.out.println("Your grade will be at least: 0.0");
		}

		System.out.println("<< your custom grade message here>>");
	}
}
