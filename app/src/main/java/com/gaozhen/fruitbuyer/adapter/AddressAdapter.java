package com.gaozhen.fruitbuyer.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.bean.AddressBean;

public class AddressAdapter extends BaseAdapter {
	private Context mContext;
	private List<AddressBean> adressbean = new ArrayList<AddressBean>();
	public AddressAdapter(Context mContexts) {
		mContext = mContexts;
		// mItemList = itemList;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
//		return adressbean.size();
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
			convertView = inflater.inflate(R.layout.item_province_list, null);
			holder = new ViewHolder();
			holder.nameView = (TextView) convertView.findViewById(R.id.province);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		return convertView;
	}

	private class ViewHolder {
		private TextView nameView;
	}
	

}
