package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.nhanvien;



public class CapNhatNhanVienDAO {
	public boolean checkUpdate(String IDNV, String Hoten, String IDPB, String Diachi) throws ClassNotFoundException{
		//Connect vao database lam mot so viec
		boolean invalid=true;
		try 
    	{
			//load driver
	    	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dulieu";
			Connection conn=DriverManager.getConnection(url, "root", "");
			String sql="update nhanvien set " + "Hoten = ?, IDPB = ?, Diachi = ? where IDNV = ?";
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, Hoten);
			pre.setString(2, IDPB);
			pre.setString(3, Diachi);
			pre.setString(4, IDNV);
			
			int i = pre.executeUpdate();
			
			if(i!=0) {
				invalid = true;
			}	
			else
				invalid = false;
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Loi thao tac CSDL");
		}
		return invalid;
	}
	
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
						nhanvien user = new nhanvien();
						user.setIDNV(rs.getString(1));
						user.setHoten(rs.getString(2));
						user.setIDPB(rs.getString(3));
						user.setDiaChi(rs.getString(4));
						result.add(user);	
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
