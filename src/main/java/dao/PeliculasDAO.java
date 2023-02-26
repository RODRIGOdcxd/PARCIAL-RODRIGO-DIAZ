package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Pelicula;

public class PeliculasDAO {

	db.Db db = new db.Db("Cinestar");
	
	public Object getPeliculas(int id) {
		db.Sentencia(String.format("call sp_getPeliculas(%s)", id));
		return db.getRegistros();
	}
	public Object getPelicula(int id) {
		db.Sentencia(String.format("call sp_getPelicula(%s)", id));
		return db.getRegistros();
}
}
