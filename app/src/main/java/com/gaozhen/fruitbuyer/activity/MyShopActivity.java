package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.FruitAdapter;
import com.gaozhen.fruitbuyer.adapter.FruitShopAdapter;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class MyShopActivity extends BaseActivity implements OnItemClickListener {

	private ImageView mShopImg;
	private TextView mShopEdit, tv_issue, mShopDesc, mShopTel, mShopAddress, mShopName;
	private ListView mListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fruit_shop_details);

		mShopImg = (ImageView) findViewById(R.id.shop_img);
		mShopName = (TextView) findViewById(R.id.shop_name);
		mShopAddress = (TextView) findViewById(R.id.shop_address);
		mShopTel = (TextView) findViewById(R.id.shop_tel);
		mShopDesc = (TextView) findViewById(R.id.shop_desc);
		mShopEdit = (TextView) findViewById(R.id.edit_fruitshop);
		tv_issue = (TextView) findViewById(R.id.tv_issue);
		tv_issue.setOnClickListener(this);

		mListView = (ListView) findViewById(R.id.list);
		mListView.setOnItemClickListener(this);

		// UI填充数据。
		FruitShopAdapter adapter = new FruitShopAdapter(this);
		mListView.setAdapter(adapter);
		mShopEdit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.edit_fruitshop:
			break;
		default:
			break;
		}

	}

	@Override
	void setTopBar() {
		setTitle("果铺详情");
		setLeft("返回", R.drawable.back, new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub

	}

}
