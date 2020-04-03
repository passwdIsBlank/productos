package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Descuento;

public class ModeloDescuento extends Conector{
	
	public ArrayList<Descuento> getAll(){
		ArrayList<Descuento> descuentos = new ArrayList<Descuento>();
		try {
			PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM descuentos");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				descuentos.add(new Descuento(rs.getInt("id"), rs.getInt("valor"), rs.getString("descripcion")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return descuentos;
	}
}
