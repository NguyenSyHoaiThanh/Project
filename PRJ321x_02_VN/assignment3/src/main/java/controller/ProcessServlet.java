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
 * Servlet implementation class ProcessServlet
 */
@WebServlet("/process")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Cart cart = null;
		Object o = session.getAttribute("cart");
		
		if(o!=null) {
			cart = (Cart)o;
		}else {
			cart = new Cart();
		}
		String tnum = request.getParameter("num").trim();
		String tid = request.getParameter("id");
		int id, num;
		try {
			id = Integer.parseInt(tid);
			num = Integer.parseInt(tnum);
			if((num==-1) &&(cart.getQuantityById(id)<=1)) {
				cart.removeItem(id);
			}else{
				ListProductDAO lpd = new ListProductDAO();
				Product p = lpd.getProductByID(tid);
				double price = p.getPrice();
				ProductOrders po = new ProductOrders(price, num, p);
				cart.addItem(po);
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		List<ProductOrders> list = cart.getItems();
		session.setAttribute("cart", cart);
		session.setAttribute("size", list.size());
		request.getRequestDispatcher("cart.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Cart cart = null;
		Object o = session.getAttribute("cart");
		
		if(o!= null) {
			cart = (Cart)o;
		}else {
			cart = new Cart();
		}
		int id = Integer.parseInt(request.getParameter("id"));
		cart.removeItem(id);
		
		List<ProductOrders> list = cart.getItems();
		
		session.setAttribute("cart", cart);
		session.setAttribute("size", list.size());
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

}
