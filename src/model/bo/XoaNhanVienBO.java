package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.XoaNhanVienDAO;


public class XoaNhanVienBO {
	static XoaNhanVienDAO xoanhanvienDAO = new XoaNhanVienDAO();
	public static boolean checkDelete(String IDNV) throws ClassNotFoundException{
		return xoanhanvienDAO.checkDelete(IDNV);
	}
	public ArrayList<nhanvien> getUserList() throws ClassNotFoundException{
		return xoanhanvienDAO.getUserList();
	}
}
