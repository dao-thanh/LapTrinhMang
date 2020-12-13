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
import model.bo.LayPhongBanBO;



/* Servlet implementation class CheckLoginServlet*/

@WebServlet("/LayPhongBan")
public class LayPhongBanServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
		String IDPB = request.getParameter("IDPB");
		ArrayList<phongban> userArray = null;
		LayPhongBanBO layphongbanBO = new LayPhongBanBO();	
		try {
				 userArray = layphongbanBO.getUserList(IDPB);
				 request.setAttribute("userArray", userArray);
				 destination = "/CapNhatPhongBan.jsp";
				 RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
				 rd.forward(request, response);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
