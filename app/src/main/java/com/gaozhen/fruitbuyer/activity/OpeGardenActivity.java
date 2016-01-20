package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RadioButton;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.GardenAdapter;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class OpeGardenActivity extends BaseActivity implements OnItemClickListener{
	private ListView open_list1, open_list2;
	private RadioButton rb_1, rb_2;
	private GardenAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_open_remind);
		open_list1 = (ListView) findViewById(R.id.open_list1);
		open_list2 = (ListView) findViewById(R.id.open_list2);
		rb_1 = (RadioButton) findViewById(R.id.rb_1);
		rb_2 = (RadioButton) findViewById(R.id.rb_2);
		adapter = new GardenAdapter(mContext);
		open_list1.setAdapter(adapter);
		open_list1.setOnItemClickListener(this);
		open_list2.setOnItemClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("开园提醒");
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
