package com.assignment;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String e = getServletContext().getInitParameter("email");
			String p = getServletContext().getInitParameter("password");
	
			if(email != null && password.equals(p) && email.equalsIgnoreCase(e)) {
				response.sendRedirect("Home.jsp");
			}else {
				response.sendRedirect("Error.jsp");
			}
		} catch (Exception e) {
			response.getWriter().println(e);
		}
	}

}
