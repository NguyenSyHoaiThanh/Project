package com.assignment;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assignment.Account;

@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		try {
			request.getSession(true).invalidate();
			String regexMail = "^[A-Z0-9_a-z]+@[A-Z0-9\\.a-z]+\\.[A-Za-z]{2,6}$";
			String regex = "[a-zA-Z0-9!@#$%^&*]+";
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Account acc = new Account();
			acc.setEmail(email);acc.setPsw(password);
			HttpSession session = request.getSession(true);
			if(!password.matches(regex) || !email.matches(regexMail)) {
				session.setAttribute("emal", email);
				response.sendRedirect("login.jsp");
			}
			
			String e = getServletContext().getInitParameter("email");
			String p = getServletContext().getInitParameter("password");
			
			if(email != null && acc.getPsw().equals(p) && acc.getEmail().equalsIgnoreCase(e)) {
				response.sendRedirect("admin.jsp");
			}else {
				
				response.sendRedirect("Error.jsp");
			}
		} catch (NullPointerException e) {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			response.getWriter().print(e);
		}
	}
}
