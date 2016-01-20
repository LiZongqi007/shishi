package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.MessageAdapter;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class MySystemMessageActivity extends BaseActivity implements OnItemClickListener{

	private ListView message_list;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_system_message);
		message_list=(ListView)findViewById(R.id.message_list);
		
		MessageAdapter adapter=new MessageAdapter(this);
		message_list.setAdapter(adapter);
		message_list.setOnItemClickListener(this);
		
		
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
		setTitle("系统消息");
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
		AppUtil.startActivity(MySystemMessageActivity.this, MesgeDetailActivity.class, null);
	}

}
