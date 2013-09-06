package com.cristhian.unadnotas.sql;

import java.sql.SQLException;

import android.R.integer;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.cristhian.unadnotas.model.Carrera;
import com.cristhian.unadnotas.model.Escuela;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DBHelper extends OrmLiteSqliteOpenHelper {
	
	private static final String DATABASE_NAME = "unadDB.db";
	private static final int DATABASE_VERSION = 3; 
	
	private Dao<Escuela, Integer> escuelaDAO;
	private Dao<Carrera, Integer> carreraDAO;
	
	public DBHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}	
	
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try{
			TableUtils.createTable(connectionSource, Escuela.class);
			TableUtils.createTable(connectionSource, Carrera.class);
			Dao<Escuela, Integer> escuelas = getEscuelaDAO();
			Escuela ecacen = new Escuela(0, "ECACEN", "Escuela de Ciencias Administrativas Contables y de Negocios");
			Escuela ecsah = new Escuela(0, "ECSAH", "Escuela de Ciencias Sociales Artes y Humanidades");
			Escuela ecbti = new Escuela(0,"ECBTI", "Escuela de Ciencias B�sicas Tecnolog�as e Ingenier�as");
			Escuela ecapma = new Escuela(0, "ECAPMA", "Escuela de Ciencias Agrarias Pecuarias y de Medio Ambiente");
			Escuela ece = new Escuela(0, "ECE", "Escuela de Ciencias de la Educaci�n");
			escuelas.create(ecacen);
			escuelas.create(ecsah);
			escuelas.create(ecbti);
			escuelas.create(ecapma);
			escuelas.create(ece);
			Dao<Carrera, Integer> carreras = getCarreraDAO();
			Carrera sistemas = new Carrera(0, ecbti, "Ingenier�a de Sistemas", 124, 43, 167);
			Carrera alimentos = new Carrera(0, ecbti, "Ingenier�a de Alimentos", 128, 22, 150);
			Carrera teleco = new Carrera(0, ecbti, "Ingenier�a de Telecomunicaciones", 129, 29, 158);
			Carrera electronica = new Carrera(0, ecbti, "Ingenier�a Electr�nica", 170, 0, 170);
			Carrera adminEmpre = new Carrera(0, ecacen, "Administraci�n de Empresas", 140, 20, 160);
			Carrera gestionComer = new Carrera(0, ecacen, "Tecnolog�a en Gesti�n Comercial y de Negocios", 71, 24, 95);
			Carrera gestionIndus = new Carrera(0, ecacen, "Tecnolog�a en Gesti�n Industrial", 76, 0, 76);
			Carrera gestionAgrop = new Carrera(0, ecacen, "Tecnolog�a en Gesti�n Agropecuaria", 95, 0, 95);
			Carrera agronomia = new Carrera(0, ecapma, "Agronom�a", 170, 0, 170);
			Carrera ambiental = new Carrera(0, ecapma, "Ingenier�a Ambiental", 149, 0, 149);
			Carrera zootecnia = new Carrera(0, ecapma, "Zootecnia", 171, 0, 171);
			Carrera etnoeducacion = new Carrera(0, ece, "Licenciatura en Etnoeducaci�n", 120, 40, 160);
			Carrera Licenciadofilosofia = new Carrera(0, ece, "Licenciatura en Filosof�a", 160, 0, 160);
			Carrera ingles = new Carrera(0, ece, "Licenciatura en Ingl�s como Lengua Extranjera", 160, 0, 160);
			Carrera matematicas = new Carrera(0, ece, "Licenciatura en Matem�ticas", 160, 0, 160);
			Carrera comunicacion = new Carrera(0, ecsah, "Comunicaci�n Social", 160, 0, 160);
			Carrera filosof�a = new Carrera(0, ecsah, "Filosof�a", 160, 0, 160);
			Carrera psicologia = new Carrera(0, ecsah, "Psicolog�a", 160, 0, 160);
			carreras.create(sistemas);
			carreras.create(alimentos);
			carreras.create(teleco);
			carreras.create(electronica);
			carreras.create(adminEmpre);
			carreras.create(gestionComer);
			carreras.create(gestionIndus);
			carreras.create(gestionAgrop);
			carreras.create(agronomia);
			carreras.create(ambiental);
			carreras.create(zootecnia);
			carreras.create(etnoeducacion);
			carreras.create(Licenciadofilosofia);
			carreras.create(ingles);
			carreras.create(matematicas);
			carreras.create(comunicacion);
			carreras.create(filosof�a);
			carreras.create(psicologia);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion,	int newVersion) {
		/*try {
			TableUtils.dropTable(connectionSource, Carrera.class, true);
			TableUtils.dropTable(connectionSource, Escuela.class, true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		onCreate(db, connectionSource);
	}
	
	public Dao<Escuela, Integer> getEscuelaDAO() throws SQLException{
		if (escuelaDAO == null){
			escuelaDAO = getDao(Escuela.class);
		}
		return escuelaDAO; 
	}
	
	public Dao<Carrera, Integer> getCarreraDAO() throws SQLException{
		if (carreraDAO == null){
			carreraDAO = getDao(Carrera.class); 
		}
		return carreraDAO;
	}

	@Override
	public void close() {
		super.close();
		escuelaDAO = null;
		carreraDAO = null;
	}
	
}
