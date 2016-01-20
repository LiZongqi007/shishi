package com.gaozhen.fruitbuyer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.activity.LocationActivity;
import com.gaozhen.fruitbuyer.utils.AppUtil;


public class HomeFragment extends BaseFragment implements OnClickListener{

	private ImageView my_system_message;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view =  inflater.inflate(R.layout.fragment_home, null);
		my_system_message=(ImageView)view.findViewById(R.id.my_system_message);
		my_system_message.setOnClickListener(this);
		return view;
	}

	@Override
	void setTopBar() {
		setLogoVisible();
		setLeft("定位", R.drawable.ic_launcher, new OnClickListener() {
			@Override
			public void onClick(View v) {
               AppUtil.startActivity(getActivity(),LocationActivity.class,null);           
			}
		});

		setRight("分享", R.drawable.ic_launcher, new OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.my_system_message:
//			AppUtil.startActivity(getActivity(),MySystemMessageActivity.class, null);
			break;

		default:
			break;
		}
	}
}
