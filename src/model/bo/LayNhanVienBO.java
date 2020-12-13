package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.LayNhanVienDAO;


public class LayNhanVienBO {
	static LayNhanVienDAO laynhanvienDAO = new LayNhanVienDAO();
		public ArrayList<nhanvien> getUserList(String IDNV) throws ClassNotFoundException{
		return laynhanvienDAO.getUserList(IDNV);
	}
}
