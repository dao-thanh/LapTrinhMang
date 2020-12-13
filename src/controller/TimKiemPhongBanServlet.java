package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.phongban;
import model.bo.TimKiemPhongBanBO;



@WebServlet(name="/TimKiemPhongBan", urlPatterns = "/TimKiemPhongBan")
public class TimKiemPhongBanServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
		
		TimKiemPhongBanBO timkiemphongbanBO = new TimKiemPhongBanBO();
		String tenphongban = request.getParameter("tenphongban");
		ArrayList<phongban> userArray = null;
		
		try {
			userArray = timkiemphongbanBO.getUserList(tenphongban);
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

