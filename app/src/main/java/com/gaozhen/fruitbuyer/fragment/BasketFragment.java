package com.gaozhen.fruitbuyer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;


public class BasketFragment extends BaseFragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_basket, null);
		ListView lv = (ListView) view.findViewById(R.id.list);
		
		TextView toSettle = (TextView) view.findViewById(R.id.to_settle);
		toSettle.setOnClickListener(this);
		return view;
	}

	@Override
	void setTopBar() {
		setLogoVisible();
		setLeft("", -1, null);
		setRight("编辑全部", -1, null);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.to_settle:
			
			break;

		default:
			break;
		}
	}
}
