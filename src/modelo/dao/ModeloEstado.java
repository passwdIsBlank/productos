package modelo.dao;

import java.util.ArrayList;
import java.sql.*;

import modelo.Conector;
import modelo.bean.Estado;

public class ModeloEstado extends Conector{
	
	public ModeloEstado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Estado> getAll(){
		ArrayList<Estado> estados = new ArrayList<Estado>();
		PreparedStatement ps;
		try {
			ps = this.conexion.prepareStatement("SELECT * FROM estados");
			ResultSet rset = ps.executeQuery();
			
			while (rset.next()) {
				estados.add(new Estado(rset.getString("Name"), rset.getInt("id"), rset.getString("Continent")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return estados;
	}

}
