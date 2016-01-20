package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.BillAdapter;

public class MyBillActivity extends BaseActivity {

	private ListView my_bill;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_bill);
		my_bill = (ListView) findViewById(R.id.my_bill);
		BillAdapter adapter = new BillAdapter(this);
		my_bill.setAdapter(adapter);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("我的账单");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
	}

}
