package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.phongban;





public class CapNhatPhongBanDAO {
	public boolean checkUpdate(String IDPB, String Tenpb, String Mota) throws ClassNotFoundException{
		//Connect vao database lam mot so viec
		boolean invalid=true;
		try 
    	{
			//load driver
	    	Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dulieu";
			Connection conn=DriverManager.getConnection(url, "root", "");
			String sql="update phongban set " + "Tenpb = ?, Mota = ? where IDPB = ?";
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, Tenpb);
			pre.setString(2, Mota);
			pre.setString(3, IDPB);
			
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
	
	public ArrayList<phongban> getUserList() throws ClassNotFoundException{
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
