package com.gaozhen.fruitbuyer.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import com.gaozhen.fruitbuyer.application.Constant.DB;

public class DBHelper extends SQLiteOpenHelper {

//	private static String creatWeatherCityTable = "create table if not exists "
//			+ WeatherCityTable.TABLE_NAME + "(" + WeatherCityTable._ID
//			+ " integer primary key autoincrement," + WeatherCityTable.AREA_ID
//			+ " varchar(255) not null," + WeatherCityTable.PROV + " varchar(255) not null,"
//			+ WeatherCityTable.CITY + " varchar(255) not null," + WeatherCityTable.DISTRICT
//			+ " varchar(255) not null)";

	public DBHelper(Context context) {
		this(context, DB.NAME, null, DB.VERSION);
	}
	public DBHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
//		db.execSQL(creatWeatherCityTable);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
