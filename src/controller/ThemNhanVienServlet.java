package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.nhanvien;
import model.bo.ThemNhanVienBO;


/* Servlet implementation class CheckLoginServlet*/

@WebServlet("/ThemNhanVien")
public class ThemNhanVienServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
		//request.setCharacterEncoding("UTF-8");
		String IDNV = request.getParameter("IDNV");
		String Hoten = request.getParameter("Hoten");
		String IDPB = request.getParameter("IDPB");
		String Diachi = request.getParameter("Diachi");
		
		ThemNhanVienBO themnhanvienBO = new ThemNhanVienBO();
		
		ArrayList<nhanvien> userArray = null;
		
		try {
			if(themnhanvienBO.CheckAdd(IDNV, Hoten, IDPB, Diachi)) {
				 userArray = themnhanvienBO.getUserList();
				 request.setAttribute("userArray", userArray);
				 destination = "/XemNhanVien.jsp";
				 RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				 rd.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
