package com.cristhian.unadnotas.adapter;

import java.util.List;

import com.cristhian.unadnotas.utils.ItemOpcionMenu;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ImageOptionAdapter extends BaseAdapter {
	
	private Context context;
	private List<ItemOpcionMenu> lista;
	
	public ImageOptionAdapter(Context context, List<ItemOpcionMenu> lista){
		this.context = context;
		this.lista = lista;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public ItemOpcionMenu getItem(int position) {
		// TODO Auto-generated method stub
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return getItem(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LinearLayout contenedor;
		ItemOpcionMenu item = lista.get(position);
		ImageView image;
		if (convertView == null){
			TextView text = new TextView(this.context);
			text.setText(item.getNombre());
			text.setGravity(Gravity.CENTER);
			contenedor = new LinearLayout(this.context);
			contenedor.setOrientation(LinearLayout.VERTICAL);
			contenedor.setGravity(Gravity.CENTER);
			contenedor.setPadding(0, 0, 0, 10);
			image = new ImageView(this.context);
			image.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			//image.setLayoutParams(new GridView.LayoutParams(76,76));
			//image.setScaleType(ImageView.ScaleType.CENTER);
			//image.setPadding(8, 8, 8, 8);
			image.setImageResource(item.getRecurso());
			contenedor.addView(image);
			contenedor.addView(text);
		}else{
			contenedor = (LinearLayout)convertView;
		}
		return contenedor;
	}

}
