package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.phongban;


public class LayPhongBanDAO {
	public ArrayList<phongban> getUserList(String IDPB) throws ClassNotFoundException{
		ArrayList<phongban> result = new ArrayList<phongban>();
		//Connect vao database lam mot so viec
		try 
    	{
			
			//load driver
	    	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dulieu";
			Connection conn=DriverManager.getConnection(url, "root", "");
			String sql="select * from phongban where IDPB = ?";
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, IDPB);
			ResultSet rs = pre.executeQuery();
			
			while(rs.next())
			{	
						phongban user = new phongban();
						user.setIDPB(rs.getString(1));
						user.setTenpb(rs.getString(2));
						user.setMota(rs.getString(3));
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
