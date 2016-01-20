package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.FruitAdapter;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class AttentionFruitActivity extends BaseActivity implements
		OnItemClickListener {

	private ListView my_attention_fruit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attention_fruit);
		my_attention_fruit = (ListView) findViewById(R.id.my_fruit);
		my_attention_fruit.setOnItemClickListener(this);
		FruitAdapter adapter = new FruitAdapter(this);
		my_attention_fruit.setAdapter(adapter);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("关注的水果");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		AppUtil.startActivity(this, GoodsDetailActivity.class, null);
	}

}
