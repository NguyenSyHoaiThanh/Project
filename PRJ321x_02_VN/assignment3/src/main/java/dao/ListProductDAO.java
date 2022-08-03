package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import context.DBContext;
import model.Product;

public class ListProductDAO {
	Connection conn	= null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	//Lay tat ca san pham trong csdl dua len trang chu
	public List<Product> getAllProduct(){
		List<Product> list = new ArrayList<Product>();
		String query = "select * from Products";
		try {
			conn =new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//Xem thong tin san pham
	public Product getProductByID(String id){
		String query = "select * from Products\n" + "where product_id = ?";
		try {
			conn =new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//tim kiem san pham
	
	public List<Product> searchByName(String textSearch){
		List<Product> list = new ArrayList<Product>();
		String query = "select * from Products where product_name like ?";
		try {
			conn =new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1,"%" + textSearch +"%" );
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
//	public static void main(String[] args) {
//		ListProductDAO dao = new ListProductDAO();
//		List<Product> list = dao.getAllProduct();
//		try {
//			for (Product o : list) {
//				System.out.println(o);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
