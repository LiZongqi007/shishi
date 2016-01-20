package com.gaozhen.fruitbuyer.application;


import android.app.Application;

public class FBApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Setting.context = getApplicationContext();
	}

}
