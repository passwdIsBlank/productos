package controlador;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Producto;
import modelo.dao.ModeloProducto;

/**
 * Servlet implementation class InsertarProducto
 */
@WebServlet("/InsertarProducto")
public class InsertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarProducto() {
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
		doGet(request, response);
		String nombre = request.getParameter("nombre");
		int stock  = Integer.parseInt(request.getParameter("stock"));
		LocalDate fechaCompra = LocalDate.parse(request.getParameter("fechaCompra"));
		String color = request.getParameter("color");
		String madein = request.getParameter("madein");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		int descuento = Integer.parseInt(request.getParameter("descuento"));
		String tallas = "";
		
		for (String talla : request.getParameterValues("talla")) {
			tallas += talla + ", ";
		}
		tallas = tallas.substring(0, tallas.length()-2);
		
		Producto producto = new Producto(nombre, stock, fechaCompra, color, madein, precio, descuento, tallas);
		
		ModeloProducto mPro = new ModeloProducto();
		mPro.insert(producto);
		request.getRequestDispatcher("formCrearProducto.jsp").forward(request, response);
	}

}
