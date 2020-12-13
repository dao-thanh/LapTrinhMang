package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.TimKiemNhanVienDAO;


public class TimKiemNhanVienBO {
	static TimKiemNhanVienDAO timkiemnhanvienDAO = new TimKiemNhanVienDAO();
	public static ArrayList<nhanvien> getUserList(String username) throws ClassNotFoundException{
		return timkiemnhanvienDAO.getUserList(username);
	}
}
