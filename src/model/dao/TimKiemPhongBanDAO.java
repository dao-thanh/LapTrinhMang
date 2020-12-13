package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.phongban;



public class TimKiemPhongBanDAO {
	public ArrayList<phongban> getUserList(String tenphongban) throws ClassNotFoundException{
		ArrayList<phongban> result = new ArrayList<phongban>();
		//Connect vao database lam mot so viec
		try 
    	{
			//load driver
	    	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dulieu";
			Connection conn=DriverManager.getConnection(url, "root", "");
			Statement state=conn.createStatement();
			String sql="select * from phongban";
			ResultSet rs=state.executeQuery(sql);
	
			while(rs.next())
			{	
					if(rs.getString(2).indexOf(tenphongban)>=0) {
						phongban PhongBan = new phongban();
						PhongBan.setIDPB(rs.getString(1));
						PhongBan.setTenpb(rs.getString(2));
						PhongBan.setMota(rs.getString(3));
						result.add(PhongBan);
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
