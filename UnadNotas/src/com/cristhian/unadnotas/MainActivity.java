package com.cristhian.unadnotas;

import java.util.ArrayList;
import java.util.List;

import com.cristhian.unadnotas.adapter.ImageOptionAdapter;
import com.cristhian.unadnotas.utils.ItemOpcionMenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	private GridView gvOpciones;
	private List<ItemOpcionMenu> listaItems = new ArrayList<ItemOpcionMenu>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Agrego los items del menu
		listaItems.add(new ItemOpcionMenu(getResources().getString(R.string.itemCarrera), R.drawable.carrera));
		listaItems.add(new ItemOpcionMenu(getResources().getString(R.string.itemConvenios), R.drawable.convenios));
		listaItems.add(new ItemOpcionMenu(getResources().getString(R.string.itemPlanEstudio), R.drawable.plan_estudio));
		gvOpciones = (GridView)findViewById(R.id.gvOpciones);
		gvOpciones.setAdapter(new ImageOptionAdapter(this, listaItems));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
