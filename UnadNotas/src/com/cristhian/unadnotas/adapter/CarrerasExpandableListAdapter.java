package com.cristhian.unadnotas.adapter;

import java.util.List;

import com.cristhian.unadnotas.MainActivity;
import com.cristhian.unadnotas.R;
import com.cristhian.unadnotas.model.Carrera;
import com.cristhian.unadnotas.model.Escuela;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class CarrerasExpandableListAdapter extends BaseExpandableListAdapter {

	private Context context;
	public List<Escuela> escuelas;
	
	public CarrerasExpandableListAdapter(Context context, List<Escuela> escuelas){
		this.context = context;
		this.escuelas = escuelas;
	}
	
	@Override
	public Carrera getChild(int groupPosition, int childPosition) {
		return (Carrera) getGroup(groupPosition).getCarreras().toArray()[childPosition];
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return getChild(groupPosition, childPosition).getId();
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		/*TextView textView = getGenericView();
        textView.setText(getChild(groupPosition, childPosition).toString());
        return textView;*/
		Carrera carrera = getChild(groupPosition, childPosition);
		View vista = View.inflate(this.context, R.layout.item_expandable_list, null);
		TextView tvPrograma = (TextView)vista.findViewById(R.id.tvDescripcion);
		tvPrograma.setText(carrera.getNombre());
		TextView tvCredito = (TextView)vista.findViewById(R.id.tvCreditos);
		tvCredito.setText("Creditos: " + carrera.getTotalCreditos());
		TextView tvObligatorio = (TextView)vista.findViewById(R.id.tvObligatorios);
		tvObligatorio.setText("Obligatorios:" + carrera.getCreditosObligatorios());
		CheckBox check = (CheckBox)vista.findViewById(R.id.checkPrograma);
		check.setChecked(carrera.seleccion);
		return vista;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return getGroup(groupPosition).getCarreras().size();
	}

	@Override
	public Escuela getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return escuelas.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return escuelas.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return getGroup(groupPosition).getId();
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		Escuela escuela = (Escuela)getGroup(groupPosition);
		View vista = View.inflate(this.context, R.layout.head_expandable_list, null);
		TextView tvCabecera = (TextView)vista.findViewById(R.id.tvCabecera);
		tvCabecera.setText(escuela.toString());
        return vista;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
