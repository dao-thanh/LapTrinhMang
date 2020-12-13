package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.LayPhongBanDAO;

public class LayPhongBanBO {
	static LayPhongBanDAO layphongbanDAO = new LayPhongBanDAO();
		public ArrayList<phongban> getUserList(String IDPB) throws ClassNotFoundException{
		return layphongbanDAO.getUserList(IDPB);
	}
}
