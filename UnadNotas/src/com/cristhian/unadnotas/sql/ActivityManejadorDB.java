package com.cristhian.unadnotas.sql;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.Menu;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;

public abstract class ActivityManejadorDB extends Activity {
	
	private DBHelper dbHelper;
	
	protected DBHelper getHelper(){
		if (dbHelper == null){
			dbHelper = OpenHelperManager.getHelper(this , DBHelper.class);
		}
		return dbHelper;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (dbHelper != null){
			OpenHelperManager.releaseHelper();
			dbHelper = null;
		}
	}
	
	
	
}
