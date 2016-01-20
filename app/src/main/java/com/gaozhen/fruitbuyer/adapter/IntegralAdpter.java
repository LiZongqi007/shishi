package com.gaozhen.fruitbuyer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;

public class IntegralAdpter extends BaseAdapter {
	private Context mContext;

	public IntegralAdpter(Context mContexts) {
		this.mContext = mContexts;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		// return adressbean.size();
		return 10;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
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
			convertView = inflater.inflate(R.layout.item_integral_list, null);
			holder = new ViewHolder();
			holder.tv_number = (TextView) convertView.findViewById(R.id.tv_number);
			holder.tv_source = (TextView) convertView.findViewById(R.id.tv_source);
			holder.tv_time = (TextView) convertView.findViewById(R.id.tv_time);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		return convertView;
	}

	private class ViewHolder {
		private TextView tv_number, tv_source, tv_time;
	}

}
