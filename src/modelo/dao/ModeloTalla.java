package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Talla;

public class ModeloTalla extends Conector{
	
	public ArrayList<Talla> getAll(){
		ArrayList<Talla> tallas = new ArrayList<Talla>();
		try {
			PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM tallas");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				tallas.add(new Talla(rs.getInt("id"), rs.getString("nombre")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tallas;
	}
}
