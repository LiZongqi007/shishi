package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class GoodsDetailActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_good_detail);
	}

	@Override
	public void onClick(View v) {

	}

	@Override
	void setTopBar() {
		setTitle("水果详情");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
		setRight("分享", R.drawable.share, new OnClickListener() {
			@Override
			public void onClick(View v) {
				AppUtil.toast(mContext, "分享");

			}
		});
	}

}
