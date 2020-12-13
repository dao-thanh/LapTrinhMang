package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.nhanvien;
import model.bo.TimKiemNhanVienBO;



@WebServlet(name="/TimKiemNhanVien", urlPatterns = "/TimKiemNhanVien")
public class TimKiemNhanVienServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
		
		TimKiemNhanVienBO timkiemnhanvienBO = new TimKiemNhanVienBO();
		String username = request.getParameter("username");
		ArrayList<nhanvien> userArray = null;
		
		try {
			userArray = timkiemnhanvienBO.getUserList(username);
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

