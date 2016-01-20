package com.gaozhen.fruitbuyer.activity;

import com.gaozhen.fruitbuyer.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class FruitDetailActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_good_detail);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("水果详情");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
