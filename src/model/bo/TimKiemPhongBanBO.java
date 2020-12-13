package model.bo;

import java.util.ArrayList;

import model.bean.phongban;
import model.dao.TimKiemPhongBanDAO;


public class TimKiemPhongBanBO {
	static TimKiemPhongBanDAO timkiemphongbanDAO = new TimKiemPhongBanDAO();
	public static ArrayList<phongban> getUserList(String tenphongban) throws ClassNotFoundException{
		return timkiemphongbanDAO.getUserList(tenphongban);
	}
}
