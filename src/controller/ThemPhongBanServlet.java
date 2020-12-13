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
import model.bo.ThemPhongBanBO;


/* Servlet implementation class CheckLoginServlet*/

@WebServlet("/ThemPhongBan")
public class ThemPhongBanServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination =  null;
		String IDPB = request.getParameter("IDPB");
		String Tenpb = request.getParameter("Tenpb");
		String Mota = request.getParameter("Mota");
		
		
		ThemPhongBanBO themphongbanBO = new ThemPhongBanBO();
		
		ArrayList<phongban> userArray = null;
		
		try {
			if(themphongbanBO.CheckAdd(IDPB, Tenpb, Mota)) {
				 userArray = themphongbanBO.getUserList();
				 request.setAttribute("userArray", userArray);
				 destination = "/XemPhongBan.jsp";
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
