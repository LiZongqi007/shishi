package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class SettingActivity extends BaseActivity {

	private RelativeLayout mUserInfo;
	private RelativeLayout mCheckUpdate;
	private RelativeLayout mHelp;
	private RelativeLayout mAbout;
	private RelativeLayout individuation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);

		mUserInfo = (RelativeLayout) findViewById(R.id.user_info_layout);
		mCheckUpdate = (RelativeLayout) findViewById(R.id.check_update_layout);
		mHelp = (RelativeLayout) findViewById(R.id.help_layout);
		mAbout = (RelativeLayout) findViewById(R.id.about_layout);
		individuation = (RelativeLayout) findViewById(R.id.individuation);

		mUserInfo.setOnClickListener(this);
		mCheckUpdate.setOnClickListener(this);
		mHelp.setOnClickListener(this);
		mAbout.setOnClickListener(this);
		individuation.setOnClickListener(this);
	}

	@Override
	void setTopBar() {

		setTitle("设置");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.user_info_layout:
			AppUtil.startActivity(this, EditUserInfoActivity.class, null);
			break;
		case R.id.check_update_layout:
			// AppUtil.startActivity(this, EditUserInfoActivity.class,null);
			break;
		case R.id.help_layout:
			// AppUtil.startActivity(this, EditUserInfoActivity.class,null);
			break;
		case R.id.about_layout:
			// AppUtil.startActivity(this, AboutActivity.class, null);
			break;
		case R.id.individuation:
			AppUtil.startActivity(this, IndividuationActivity.class, null);
			break;
		default:
			break;
		}

	}

}
