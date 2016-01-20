package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;

public class EditUserInfoActivity extends BaseActivity {

	private ImageView mHeadImg;
	private RelativeLayout mPhone;
	private RelativeLayout mName;
	private RelativeLayout mPwd;
	private RelativeLayout mAddress;
	private TextView mPhoneNum;
	private TextView mNickname;
	private TextView mDetailAddress;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_people_details);

		mHeadImg = (ImageView) findViewById(R.id.edit_head_img);
		mPhone = (RelativeLayout) findViewById(R.id.edit_phone);
		mName = (RelativeLayout) findViewById(R.id.edit_name);
		mPwd = (RelativeLayout) findViewById(R.id.edit_pwd);
		mAddress = (RelativeLayout) findViewById(R.id.edit_address);

		mPhoneNum = (TextView) findViewById(R.id.phone_num);
		mNickname = (TextView) findViewById(R.id.nickname);
		mDetailAddress = (TextView) findViewById(R.id.detail_address);

		mHeadImg.setOnClickListener(this);
		mPhone.setOnClickListener(this);
		mName.setOnClickListener(this);
		mPwd.setOnClickListener(this);
		mAddress.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

	}

	@Override
	void setTopBar() {
		setTitle("个人资料");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
