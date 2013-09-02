package com.cristhian.unadnotas;

import java.util.ArrayList;
import java.util.List;

import com.cristhian.unadnotas.adapter.ImageOptionAdapter;
import com.cristhian.unadnotas.utils.ItemOpcionMenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity implements OnItemClickListener {
	
	private GridView gvOpciones;
	private List<ItemOpcionMenu> listaItems = new ArrayList<ItemOpcionMenu>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Agrego los items del menu
		crearMenu();
		gvOpciones = (GridView)findViewById(R.id.gvOpciones);
		gvOpciones.setAdapter(new ImageOptionAdapter(this, listaItems));
		gvOpciones.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void crearMenu(){
		listaItems.add(new ItemOpcionMenu(1,getResources().getString(R.string.itemCarrera), R.drawable.carrera));
		listaItems.add(new ItemOpcionMenu(2,getResources().getString(R.string.itemConvenios), R.drawable.convenios));
		listaItems.add(new ItemOpcionMenu(3,getResources().getString(R.string.itemPlanEstudio), R.drawable.plan_estudio));
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		int idMenu = Integer.parseInt(String.valueOf(id));
		Intent i = null;
		switch(idMenu){
		case 1:
			i = new Intent(this, CarreraActivity.class);
			break;
		}
		startActivity(i);
	}
	
}
