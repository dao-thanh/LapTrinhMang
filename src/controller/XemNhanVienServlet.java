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
import model.bo.XemNhanVienBO;



/* Servlet implementation class CheckLoginServlet*/

@WebServlet(name="/XemNhanVienServlet", urlPatterns = "/XemNhanVienServlet")
public class XemNhanVienServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
	
		XemNhanVienBO xemnhanvienBO = new XemNhanVienBO();
		ArrayList<nhanvien> userArray = null;
		
		try {
			userArray = xemnhanvienBO.getUserList();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("userArray", userArray);
		destination = "/XemNhanVien.jsp";
		
		 RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		 rd.forward(request, response);
	}
}
