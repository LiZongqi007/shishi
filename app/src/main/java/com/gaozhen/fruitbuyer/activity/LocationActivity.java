package com.gaozhen.fruitbuyer.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.AddressAdapter;
import com.gaozhen.fruitbuyer.bean.AddressBean;

public class LocationActivity extends BaseActivity implements
		OnItemClickListener {
	private ListView address_list_one,address_list_two,address_list_three;
	private TextView province_first, city_two, county_three;
	private List<AddressBean> adressbean = new ArrayList<AddressBean>();
	private int a=1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_location);
		address_list_one = (ListView) findViewById(R.id.address_list_one);
		address_list_two = (ListView) findViewById(R.id.address_list_two);
		address_list_three = (ListView) findViewById(R.id.address_list_three);
		province_first = (TextView) findViewById(R.id.province_first);
		city_two = (TextView) findViewById(R.id.city_two);
		county_three = (TextView) findViewById(R.id.county_three);

		AddressAdapter adapter = new AddressAdapter(this);
		address_list_one.setAdapter(adapter);
		address_list_two.setAdapter(adapter);
		address_list_three.setAdapter(adapter);
		address_list_one.setOnItemClickListener(this);
		address_list_two.setOnItemClickListener(this);
		address_list_three.setOnItemClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case 1:
			break;

		default:
			break;
		}
	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub
		setTitle("定位");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {
				 if(a==1){
					finish(); 
				 }else if(a==2){
					 address_list_two.setVisibility(View.GONE);
					 address_list_one.setVisibility(View.VISIBLE);
					 city_two.setText("");
					 a=1;
				 }else if(a==3){
					 address_list_three.setVisibility(View.GONE);
					 address_list_two.setVisibility(View.VISIBLE);
					 county_three.setText("");
					 a=2;
				 }

				
			}
		});
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		// String a = get(position).getName();
		
		if (position == 0) {
			a=1;
			province_first.setText("山西省");
			address_list_one.setVisibility(View.GONE); 
			address_list_two.setVisibility(View.VISIBLE);
		} else if (position == 1 && !province_first.getText().equals("")) {
			a=2;
			city_two.setText("太原市");
			address_list_two.setVisibility(View.GONE); 
			address_list_three.setVisibility(View.VISIBLE);
		}else if (position == 2&&!city_two.getText().equals("")) {
			a=3;
			address_list_three.setVisibility(View.GONE); 
			county_three.setText("小店区");
			finish();
		}

	}
}
