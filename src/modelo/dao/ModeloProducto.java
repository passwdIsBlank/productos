package modelo.dao;

import java.sql.*;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

public class ModeloProducto extends Conector{

	public ArrayList<Producto> getAll(){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		try {
			PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM productos");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Producto producto = new Producto(rs.getString("nombre"), rs.getInt("stock"), rs.getDate("fecha_compra").toLocalDate(), rs.getString("color"), rs.getString("made_in"), rs.getDouble("precio"), rs.getInt("descuento"), rs.getString("tallas"));
				producto.setId(rs.getInt("id"));
				productos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}
	
	public Producto get(int id) {
		Producto producto = null;
		try {
			PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM productos WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				producto = new Producto(rs.getString("nombre"), rs.getInt("stock"), rs.getDate("fecha_compra").toLocalDate(), rs.getString("color"), rs.getString("made_in"), rs.getDouble("precio"), rs.getInt("descuento"), rs.getString("tallas"));
				producto.setId(rs.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return producto;
	}
	
	public void insert(Producto producto) {
		try {
			PreparedStatement ps = this.conexion.prepareStatement("INSERT INTO productos VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, producto.getNombre());
			ps.setInt(2, producto.getStock());
			ps.setDate(3, Date.valueOf(producto.getFecha_compra()));
			ps.setString(4, producto.getColor());
			ps.setString(5, producto.getMade_in());
			ps.setDouble(6, producto.getPrecio());
			ps.setInt(7, producto.getDescuento());
			ps.setString(8, producto.getTallas());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Producto producto) {
		try {
			PreparedStatement ps = this.conexion.prepareStatement("UPDATE productos SET nombre=?, stock=?, fecha_compra=?, color=?, made_in=?, precio=?, descuento=?, tallas=? WHERE id=?");
			ps.setString(1, producto.getNombre());
			ps.setInt(2, producto.getStock());
			ps.setDate(3, Date.valueOf(producto.getFecha_compra()));
			ps.setString(4, producto.getColor());
			ps.setString(5, producto.getMade_in());
			ps.setDouble(6, producto.getPrecio());
			ps.setInt(7, producto.getDescuento());
			ps.setString(8, producto.getTallas());
			ps.setInt(9, producto.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			PreparedStatement ps = this.conexion.prepareStatement("DELETE FROM productos WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Producto> deLaTalla(Talla talla){
		//TODO implementar, un poco mas dificil
		return null;
	}
}
