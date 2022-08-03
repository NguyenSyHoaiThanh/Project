package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ListProductDAO;
import model.Cart;
import model.Product;
import model.ProductOrders;

/**
 * Servlet implementation class BuyServlet
 */
@WebServlet("/buy")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyServlet() {
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
			cart = (Cart) o;
		}else {
			cart = new Cart();
		}
		
		String tnum = request.getParameter("num");
		String tid = request.getParameter("id");
		int num;
		
		try {
			num = Integer.parseInt(tnum);
			
			ListProductDAO lpd = new ListProductDAO();
			Product p = lpd.getProductByID(tid);
			double price = p.getPrice();
			ProductOrders t = new ProductOrders(price, num, p);
			cart.addItem(t);
		} catch (NumberFormatException e) {
			num = 1;
		}
		
		List<ProductOrders> list = cart.getItems();
		session.setAttribute("cart", cart);
		session.setAttribute("size", list.size());
		request.getRequestDispatcher("/Trang-chu").forward(request, response);
	}

}
