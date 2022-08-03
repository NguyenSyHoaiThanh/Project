package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;

import com.mysql.jdbc.PreparedStatement;

import context.DBContext;
import model.Account;
import model.Cart;
import model.ProductOrders;

public class OrdersDAO {
	Connection conn	= null;
	PreparedStatement ps,ps2,ps3 = null;
	ResultSet rs = null;
	
	public void addOrder(Account a, Cart cart) {
		LocalDate curDate = java.time.LocalDate.now();
		String date = curDate.toString();
		String query = "insert into Orders values(?,null,?,null,?)";
		try {
			conn =new DBContext().getConnection();
			ps = (PreparedStatement) conn.prepareStatement(query);
			ps.setString(1, a.getEmail());
			ps.setString(2, date);
			ps.setString(3, a.getAddress());
			
			String sql1 = "select top(1) order_id from Orders order by order_id desc";
			ps2 = (PreparedStatement) conn.prepareStatement(sql1);
			rs = ps2.executeQuery();
			
			if(rs.next()) {
				int oid = rs.getInt(1);
				for (ProductOrders i : cart.getItems()) {
					String sql2 = "insert into [Orders_detail] values (?,?,?,?)";
					ps3 = (PreparedStatement) conn.prepareStatement(sql2);
					ps3.setInt(1, oid);
					ps3.setInt(2, i.getProduct().getId());
					ps3.setInt(3, i.getQuantity());
					ps3.setDouble(4, i.getProduct().getPrice());
					ps3.executeUpdate();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
