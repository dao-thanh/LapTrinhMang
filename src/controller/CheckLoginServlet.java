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


import model.bo.CheckLoginBO;

/* Servlet implementation class CheckLoginServlet*/

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		CheckLoginBO checkLoginBO = new CheckLoginBO();
		
		try {
			if(checkLoginBO.isValidUser(username, password)) {
				 //Khoi tao session
			     HttpSession session = request.getSession();
				 session.setAttribute("username", username);
				 
				 response.sendRedirect("Home");
			}else {
				response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
