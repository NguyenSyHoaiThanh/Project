package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import model.Account;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		LoginDAO ld = new LoginDAO();
		Account a = ld.login(email, password);
		if(a==null) {
			request.setAttribute("ErrorMess", "Wrong user or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("acc", a);
			getServletContext().getRequestDispatcher("/Trang-chu").forward(request, response);
			//response.sendRedirect("admin.jsp");
		}
	}

}
