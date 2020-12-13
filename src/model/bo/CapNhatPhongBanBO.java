package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.CapNhatPhongBanDAO;


public class CapNhatPhongBanBO {
	static CapNhatPhongBanDAO capnhatphongbanDAO = new CapNhatPhongBanDAO();
	public static boolean checkUpdate(String IDPB, String Tenpb, String Mota) throws ClassNotFoundException{
		return capnhatphongbanDAO.checkUpdate(IDPB, Tenpb, Mota);
	}
	public ArrayList<phongban> getUserList() throws ClassNotFoundException{
		return capnhatphongbanDAO.getUserList();
	}
}
