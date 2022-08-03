 package controller.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.OrdersDAO;
import model.Account;
import model.Cart;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutServlet() {
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
		HttpSession session = request.getSession(true);
		Cart cart = null;
		Object o = session.getAttribute("cart");
		
		if(o!= null) {
			cart=(Cart) o;
		}else {
			cart = new Cart();
		}
		Account a = null;
		Object o2 = session.getAttribute("acc");
		if(o2!= null) {
			a = (Account) o2;
			OrdersDAO odd = new OrdersDAO();
			odd.addOrder(a, cart);
			session.removeAttribute("cart");
			session.setAttribute("size", 0);
			response.sendRedirect("/assignment/Trang-chu");
			
		}else {
			response.sendRedirect("/assignment/login.jsp");
			
		}
	}

}
