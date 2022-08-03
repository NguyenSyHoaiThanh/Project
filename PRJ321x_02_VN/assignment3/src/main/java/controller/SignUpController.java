package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoginDAO;
import model.Account;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/signup")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String user = request.getParameter("email");
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		String confirmPass = request.getParameter("confirm-pass");
		if(!pass.equals(confirmPass)) {
			response.sendRedirect("login.jsp");
		}else {
			LoginDAO ld = new LoginDAO();
			Account a = ld.checkAccountExist(user);
			if(a==null) {
				ld.signup(user, pass, name);
				getServletContext().getRequestDispatcher("/Trang-chu").forward(request, response);
			}else {
				response.sendRedirect("login.jsp");
			}
		}
	}

}
