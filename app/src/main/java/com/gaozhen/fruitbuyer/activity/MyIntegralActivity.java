package com.gaozhen.fruitbuyer.activity;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.IntegralAdpter;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class MyIntegralActivity extends BaseActivity {

	private ListView lv_list;
	private IntegralAdpter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_integral_list);
		lv_list = (ListView) findViewById(R.id.lv_list);
		adapter = new IntegralAdpter(mContext);
		lv_list.setAdapter(adapter);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("我的积分");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});

	}

}
