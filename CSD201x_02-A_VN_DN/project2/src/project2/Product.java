package project2;

import java.util.Scanner;

/**
 * Lớp Product chứa thông tin và hành vi cần thiết cho sản phẩm
 * @author OS
 *
 */
public class Product {
	//tạo các thông tin cơ bản cho sản phẩm
	private int soLuong;
	private String tenSP, maSP;
	private float donGia;
	public String resultBinary;
	
	public Product() {}
	
	public Product(String maSP, String tenSP, int soLuong,  float donGia) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenSP() {
		return tenSP;
	}
	
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public void printInfo() {
		System.out.println("Product [maSP= " + this.maSP + ", tenSP= " + this.tenSP + ", soLuong= " + this.soLuong + ", donGia= " + this.donGia + "]");
	}
	public void printResultBinary() {
		System.out.println("maSP= " + this.maSP + ", tenSP= " + this.tenSP + " số lượng sau khi chuyển đổi sang nhị phân: " + resultBinary);
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sản phẩm:");
		this.maSP = sc.next();
		System.out.println("Nhập tên sản phẩm:");
		this.tenSP = sc.next();
		System.out.println("Nhập số lượng sản phẩm:");
		this.soLuong = sc.nextInt();
		System.out.println("Nhập đơn giá sản phẩm:");
		this.donGia = sc.nextFloat();
	}
	
}
