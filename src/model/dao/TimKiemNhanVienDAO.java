package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;



public class TimKiemNhanVienDAO {
	public ArrayList<nhanvien> getUserList(String username) throws ClassNotFoundException{
		ArrayList<nhanvien> result = new ArrayList<nhanvien>();
		//Connect vao database lam mot so viec
		try 
    	{
			//load driver
	    	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dulieu";
			Connection conn=DriverManager.getConnection(url, "root", "");
			Statement state=conn.createStatement();
			String sql="select * from nhanvien";
			ResultSet rs=state.executeQuery(sql);
	
			while(rs.next())
			{	
					if(rs.getString(2).indexOf(username)>=0) {
						nhanvien user = new nhanvien();
						user.setIDNV(rs.getString(1));
						user.setHoten(rs.getString(2));
						user.setIDPB(rs.getString(3));
						user.setDiaChi(rs.getString(4));
						result.add(user);
					}	
			}
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Loi thao tac CSDL");
		}
		return result;
	}
}
