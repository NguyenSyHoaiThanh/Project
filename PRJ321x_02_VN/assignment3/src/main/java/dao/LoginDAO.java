package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import context.DBContext;
import model.Account;

public class LoginDAO {
	Connection conn	= null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public Account login(String user, String pass) {
		String query = "select * from Account where user_mail = ? and password = ?";
		
		try {
			conn =new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public Account checkAccountExist(String user) {
		String query = "select * from Account where user_mail = ?";
		
		try {
			conn =new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public void signup(String user, String pass, String name) {
		String query = "insert into Account values(?,?,0,?,null,null)";
		try {
			conn =new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			ps.setString(3, name);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
