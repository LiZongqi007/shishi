package com.gaozhen.fruitbuyer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;

public class MyCouponAdapter extends BaseAdapter {
	private Context mContext;

	public MyCouponAdapter(Context context) {
		this.mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null || convertView.getTag() == null) {
			LayoutInflater inflater = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.item_my_coupon, null);
			holder = new ViewHolder();
			holder.store_name = (TextView) convertView.findViewById(R.id.store_name);
			holder.money = (TextView) convertView.findViewById(R.id.money);
			holder.order = (TextView) convertView.findViewById(R.id.order);
			holder.date = (TextView) convertView.findViewById(R.id.date);
			holder.get = (Button) convertView.findViewById(R.id.get);
			holder.ll_background = (LinearLayout) convertView.findViewById(R.id.ll_background);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		if (position == 0) {
			holder.ll_background.setBackgroundResource(R.color.one);
		} else if (position == 1) {
			holder.ll_background.setBackgroundResource(R.color.two);
		} else if (position == 2) {
			holder.ll_background.setBackgroundResource(R.color.three);
		} else if (position == 3) {
			holder.ll_background.setBackgroundResource(R.color.four);
		} else if (position == 4) {
			holder.ll_background.setBackgroundResource(R.color.five);
		}
		return convertView;
	}

	private class ViewHolder {
		private TextView store_name, money, order, date;
		private Button get;
		private LinearLayout ll_background;
	}
}
