package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.FruiterAdapter;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class AttentionFruiterActivity extends BaseActivity implements
		OnItemClickListener {

	private ListView my_attention_fruiter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attention_fruiter);
		my_attention_fruiter = (ListView) findViewById(R.id.my_attention_fruiter);
		my_attention_fruiter.setOnItemClickListener(this);
		FruiterAdapter adapter = new FruiterAdapter(this);
		my_attention_fruiter.setAdapter(adapter);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("关注的果农");
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
		AppUtil.startActivity(this, MyShopActivity.class, null);
	}

}
