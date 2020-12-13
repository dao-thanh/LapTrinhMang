package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.XemNhanVienDAO;

public class XemNhanVienBO {
	XemNhanVienDAO xemnhanvienDAO = new XemNhanVienDAO();
	public ArrayList<nhanvien> getUserList() throws ClassNotFoundException{
		return xemnhanvienDAO.getUserList();
	}
}
