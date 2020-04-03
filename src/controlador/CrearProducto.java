package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Descuento;
import modelo.bean.Estado;
import modelo.bean.Talla;
import modelo.dao.ModeloDescuento;
import modelo.dao.ModeloEstado;
import modelo.dao.ModeloTalla;

/**
 * Servlet implementation class CrearProducto
 */
@WebServlet("/CrearProducto")
public class CrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloEstado mEst = new ModeloEstado();
		ModeloDescuento mDes = new ModeloDescuento();
		ModeloTalla mTal = new ModeloTalla();
		
		ArrayList<Estado> estados = mEst.getAll();
		ArrayList<Descuento> descuentos = mDes.getAll();
		ArrayList<Talla> tallas = mTal.getAll();
		
		request.setAttribute("estados", estados);
		request.setAttribute("descuentos", descuentos);
		request.setAttribute("tallas", tallas);
		
		request.getRequestDispatcher("formCrearProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
