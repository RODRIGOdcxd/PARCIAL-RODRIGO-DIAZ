package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Pelicula;

public class CineDAO {

	db.Db db = new db.Db("Cinestar");

	public String[][] getCines(Object idCine) {
		db.Sentencia(String.format("call usp_getCine(%s)",idCine));
		return db.getRegistros();
	}
	public String[][] getVerCines() {
		db.Sentencia("call usp_getVerCines()");
		return db.getRegistros();
	}
	public String[][] getCineTarifas(Object idCine) {
		db.Sentencia(String.format("call usp_getCineTarifas(%s)",idCine));
		return db.getRegistros();
	}
	public Object getCinePeliculas(Object idCine) {
		db.Sentencia(String.format("call usp_getCinePeliculas(%s)",idCine));
		return db.getRegistros();
	}
	public String[] getCine(Object idCine) {
		// TODO Auto-generated method stub
		return null;
	}
}
