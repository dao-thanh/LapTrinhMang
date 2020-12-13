package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.XoaPhongBanDAO;
;

public class XoaPhongBanBO {
	static XoaPhongBanDAO xoaphongbanDAO = new XoaPhongBanDAO();
	public static boolean checkDelete(String IDPB) throws ClassNotFoundException{
		return xoaphongbanDAO.checkDelete(IDPB);
	}
	public ArrayList<phongban> getUserList() throws ClassNotFoundException{
		return xoaphongbanDAO.getUserList();
	}
}
