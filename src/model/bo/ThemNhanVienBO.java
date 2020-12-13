package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.ThemNhanVienDAO;

public class ThemNhanVienBO {
	ThemNhanVienDAO themnhanvienDAO = new ThemNhanVienDAO();
	
	public boolean CheckAdd(String IDNV, String Hoten, String IDPB, String Diachi) throws ClassNotFoundException {
		return themnhanvienDAO.CheckAdd(IDNV, Hoten, IDPB, Diachi);
	}
	public ArrayList<nhanvien> getUserList() throws ClassNotFoundException{
		return themnhanvienDAO.getUserList();
	}
}
