package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.gaozhen.fruitbuyer.R;

public class MesgeDetailActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_system_meaaage_two);
		

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("系统消息");

		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
	}

}
