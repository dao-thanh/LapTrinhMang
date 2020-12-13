package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.ThemPhongBanDAO;


public class ThemPhongBanBO {
	ThemPhongBanDAO themphongbanDAO = new ThemPhongBanDAO();
	
	public boolean CheckAdd(String IDPB, String Tenpb, String Mota) throws ClassNotFoundException {
		return themphongbanDAO.CheckAdd(IDPB, Tenpb, Mota);
	}
	
	public ArrayList<phongban> getUserList() throws ClassNotFoundException{
		return themphongbanDAO.getUserList();
	}
}
