package com.gaozhen.fruitbuyer.activity;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.SeekFruitAdapter;
import com.gaozhen.fruitbuyer.utils.AppUtil;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow.OnDismissListener;

public class SeekActivity extends BaseActivity implements OnItemClickListener {
	private TextView tvselect;
	private ImageView below;
	private ListView section_list;
	private PopupWindow pwMyPopWindow;
	private TextView back;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seek_fruit);
		back = (TextView) findViewById(R.id.back);
		tvselect = (TextView) findViewById(R.id.select);
		below = (ImageView) findViewById(R.id.below);
		tvselect.setOnClickListener(this);
		below.setBackgroundResource(R.drawable.my_order_down);
		iniPopupWindow();
		section_list = (ListView) findViewById(R.id.my_order_list);
		SeekFruitAdapter adapter = new SeekFruitAdapter(this);
		back.setOnClickListener(this);
		section_list.setAdapter(adapter);
		section_list.setOnItemClickListener(this);
	}

	private void iniPopupWindow() {
		// TODO Auto-generated method stub
		View layout = View.inflate(this, R.layout.pop_order_type, null);
		layout.findViewById(R.id.obligation).setOnClickListener(this);
		layout.findViewById(R.id.weit_shipments).setOnClickListener(this);
		layout.findViewById(R.id.have_shipments).setOnClickListener(this);
		layout.findViewById(R.id.get_goods).setOnClickListener(this);
		layout.findViewById(R.id.cancel).setOnClickListener(this);
		layout.findViewById(R.id.abnormal_order).setOnClickListener(this);
		layout.findViewById(R.id.seek_distance).setOnClickListener(this);
		pwMyPopWindow = new PopupWindow(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		pwMyPopWindow.setContentView(layout);
		pwMyPopWindow.setTouchable(true);
		pwMyPopWindow.setFocusable(true);
		pwMyPopWindow.setBackgroundDrawable(new BitmapDrawable());
		pwMyPopWindow.setOutsideTouchable(true);
		pwMyPopWindow.setOnDismissListener(new OnDismissListener() {

			@Override
			public void onDismiss() {
				below.setBackgroundResource(R.drawable.my_order_down);
			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.back:
			finish();
			break;
		case R.id.select:

			// pwMyPopWindow.showAtLocation(tvselect, Gravity.CENTER, 0, 0);
			pwMyPopWindow.showAsDropDown(tvselect);
			below.setBackgroundResource(R.drawable.my_order_up);
			break;
		case R.id.obligation:
			tvselect.setText("销量");
			pwMyPopWindow.dismiss();
			break;

		case R.id.weit_shipments:
			tvselect.setText("价格");
			pwMyPopWindow.dismiss();
			break;
		case R.id.have_shipments:
			tvselect.setText("地域");
			pwMyPopWindow.dismiss();
			break;
		case R.id.get_goods:
			tvselect.setText("预售截止时间");
			pwMyPopWindow.dismiss();
			break;
		case R.id.cancel:
			tvselect.setText("成熟时间");
			pwMyPopWindow.dismiss();
			break;
		case R.id.abnormal_order:
			tvselect.setText("更新时间");
			pwMyPopWindow.dismiss();
			break;
		case R.id.seek_distance:
			tvselect.setText("距离");
			pwMyPopWindow.dismiss();
		default:
			break;
		}
	}

	@Override
	void setTopBar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		AppUtil.startActivity(this, FruitDetailActivity.class, null);
	}

}
