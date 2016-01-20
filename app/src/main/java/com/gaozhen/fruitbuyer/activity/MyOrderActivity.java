package com.gaozhen.fruitbuyer.activity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.application.Constant.OrderState;

public class MyOrderActivity extends BaseActivity implements OnItemClickListener {
	private ListView section_list;
	private TextView tvselect;
	private PopupWindow pwMyPopWindow;
	private ImageView below;
	private int type;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_order);
		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			type = bundle.getInt(OrderState.ORDER_TYPE);
		}
		tvselect = (TextView) findViewById(R.id.select);
		below = (ImageView) findViewById(R.id.below);
		tvselect.setOnClickListener(this);
		below.setBackgroundResource(R.drawable.my_order_down);
		iniPopupWindow();
		section_list = (ListView) findViewById(R.id.my_order_list);

	}

	private void iniPopupWindow() {
		View layout = View.inflate(this, R.layout.pop_order_type, null);
		layout.findViewById(R.id.obligation).setOnClickListener(this);
		layout.findViewById(R.id.weit_shipments).setOnClickListener(this);
		layout.findViewById(R.id.have_shipments).setOnClickListener(this);
		layout.findViewById(R.id.get_goods).setOnClickListener(this);
		layout.findViewById(R.id.cancel).setOnClickListener(this);
		layout.findViewById(R.id.abnormal_order).setOnClickListener(this);
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
		switch (v.getId()) {
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
		default:
			break;
		}
	}

	@Override
	void setTopBar() {
		setTitle("我的订单");

		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
		if (OrderState.UNPAID == type) {
			tvselect.setText("待付款");
		} else if (OrderState.PAID_UNSEND == type) {
			tvselect.setText("待发货");
		} else if (OrderState.SEND == type) {
			tvselect.setText("已发货");
		} else if (OrderState.COMMENTED == type) {
			tvselect.setText("已收货");
		} else if (OrderState.EXCEPTION == type) {
			tvselect.setText("异常订单");
		}
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub

	}

}
