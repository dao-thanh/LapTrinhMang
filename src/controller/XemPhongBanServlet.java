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


import model.bean.phongban;
import model.bo.XemNhanVienBO;
import model.bo.XemPhongBanBO;



/* Servlet implementation class CheckLoginServlet*/

@WebServlet("/XemPhongBanServlet")
public class XemPhongBanServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
	
		
		XemPhongBanBO xemphongbanBO = new XemPhongBanBO();
		ArrayList<phongban> userArray = null;
		
		try {
			userArray = xemphongbanBO.getUserList();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("userArray", userArray);
		destination = "/XemPhongBan.jsp";
		
		 RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		 rd.forward(request, response);
	}
}
