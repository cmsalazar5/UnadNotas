package com.cristhian.unadnotas;

import java.sql.SQLException;
import java.util.List;

import com.cristhian.unadnotas.adapter.CarrerasExpandableListAdapter;
import com.cristhian.unadnotas.model.Carrera;
import com.cristhian.unadnotas.model.Escuela;
import com.cristhian.unadnotas.sql.ActivityManejadorDB;
import com.j256.ormlite.dao.Dao;

import android.app.ExpandableListActivity;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class CarreraActivity extends ActivityManejadorDB  {

	private List<Escuela> listEscuelas = null;
	private ExpandableListView exlistDatos;
	private CarrerasExpandableListAdapter adaptador;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carrera);
		Dao<Escuela, Integer> escuelas;
		try {
		    escuelas = getHelper().getEscuelaDAO();
		    listEscuelas = escuelas.queryForAll();
		    System.out.print("sds");
		} catch (SQLException e) {
			Toast.makeText(this, R.string.problemaCarreras, Toast.LENGTH_SHORT).show();
		}
		adaptador = new CarrerasExpandableListAdapter(this, listEscuelas);
		exlistDatos = (ExpandableListView) findViewById(R.id.exListCarreras);
		exlistDatos.setAdapter(adaptador);
		exlistDatos.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(CarreraActivity.this, "D", Toast.LENGTH_SHORT).show();
			}
		});
		exlistDatos.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				Carrera item = (Carrera)adaptador.getGroup(groupPosition).getCarreras().toArray()[childPosition];
				item.seleccion = !item.seleccion;
				CheckBox check = (CheckBox)v.findViewById(R.id.checkPrograma);
				check.setChecked(item.seleccion);
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.carrera, menu);
		return true;
	}

}
