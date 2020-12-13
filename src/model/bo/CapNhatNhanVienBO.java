package model.bo;

import java.util.ArrayList;

import model.bean.nhanvien;
import model.dao.CapNhatNhanVienDAO;


public class CapNhatNhanVienBO {
	static CapNhatNhanVienDAO capnhatnhanvienDAO = new CapNhatNhanVienDAO();
	public static boolean checkUpdate(String IDNV, String Hoten, String IDPB, String Diachi) throws ClassNotFoundException{
		return capnhatnhanvienDAO.checkUpdate(IDNV, Hoten, IDPB, Diachi);
	}
	public ArrayList<nhanvien> getUserList() throws ClassNotFoundException{
		return capnhatnhanvienDAO.getUserList();
	}
}
