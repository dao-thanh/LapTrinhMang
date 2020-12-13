package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.XemPhongBanDAO;

public class XemPhongBanBO {
	XemPhongBanDAO xemphongbanDAO = new XemPhongBanDAO();
	public ArrayList<phongban> getUserList() throws ClassNotFoundException{
		return xemphongbanDAO.getUserList();
	}
}
