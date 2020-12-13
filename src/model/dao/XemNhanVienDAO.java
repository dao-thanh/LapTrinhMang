package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;


public class XemNhanVienDAO {
	public ArrayList<nhanvien> getUserList() throws ClassNotFoundException{
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
						nhanvien nv = new nhanvien();
						nv.setIDNV(rs.getString(1));
						nv.setHoten(rs.getString(2));
						nv.setIDPB(rs.getString(3));
						nv.setDiaChi(rs.getString(4));
						result.add(nv);
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
