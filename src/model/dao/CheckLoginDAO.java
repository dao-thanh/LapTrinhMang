package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CheckLoginDAO {
	public static boolean isExistUser(String username, String password) throws ClassNotFoundException {
		//Connect vao database lam mot so viec
		//Tat ca nhung cau sql deu phai dat o DAO
		boolean isValid = true;
		try 
    	{
			//load driver
	    	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dulieu";
			Connection conn=DriverManager.getConnection(url, "root", "");
			String sql="select * from taikhoan1 where username = ? and password = ?" ;
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, username);
			pre.setString(2, password);
			ResultSet rs = pre.executeQuery();
			
			if(rs.next()) {
				isValid = true;
			}else {
				isValid = false;
			}
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Loi thao tac CSDL");
		}
		return isValid;
	}
}
