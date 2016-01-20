package com.gaozhen.fruitbuyer.activity;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.MyCouponAdapter;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class MyCouponActivity extends BaseActivity {
	private ListView my_coupon_list;
	private MyCouponAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_coupon);
		my_coupon_list = (ListView) findViewById(R.id.my_coupon_list);
		adapter = new MyCouponAdapter(mContext);
		my_coupon_list.setAdapter(adapter);
	}

	@Override
	public void onClick(View v) {

	}

	@Override
	void setTopBar() {
		setTitle("优惠券");
		setLeft("返回", R.drawable.back, new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
