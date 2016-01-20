package com.gaozhen.fruitbuyer.activity;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.FruitFriendAdapter;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MyFruitFriendActivity extends BaseActivity {
	private ImageView imageView1, imageView2;
	private TextView tv_name;
	private ListView frend;
	private FruitFriendAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fruit_frend);
		imageView1 = (ImageView) findViewById(R.id.imageView1);
		imageView2 = (ImageView) findViewById(R.id.imageView2);
		tv_name = (TextView) findViewById(R.id.tv_name);
		frend = (ListView) findViewById(R.id.frend);
		addHead();
		adapter = new FruitFriendAdapter(mContext);
		frend.setAdapter(adapter);
	}

	private void addHead() {
		View headView = View.inflate(mContext, R.layout.header_fruit_circle, null);
		frend.addHeaderView(headView);
	}

	@Override
	public void onClick(View v) {

	}

	@Override
	void setTopBar() {
		setTitle("果友圈");

		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
	}

}
