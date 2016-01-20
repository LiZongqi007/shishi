package com.gaozhen.fruitbuyer.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.manager.ActivityManager;

abstract class BaseActivity extends FragmentActivity implements OnClickListener {

	private TextView leftBtn;
	private TextView title;
	private ImageView logo;
	private TextView rightBtn;
	protected Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setWindowAnimations(R.style.activity_anim);
		mContext = this;
		ActivityManager.getInstance().add(this);
	}

	@Override
	protected void onStart() {
		super.onStart();
		initTopBar();
		setTopBar();
	}

	private void initTopBar() {
		leftBtn = (TextView) findViewById(R.id.left_btn);
		title = (TextView) findViewById(R.id.title);
		logo = (ImageView) findViewById(R.id.logo);
		rightBtn = (TextView) findViewById(R.id.right_btn);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityManager.getInstance().remove(this);
	}

	/**
	 * 设置TopBar
	 */
	abstract void setTopBar();

	/**
	 * 显示logo
	 */
	protected void setLogoVisible() {
		logo.setVisibility(View.VISIBLE);
		title.setVisibility(View.GONE);
	}

	/**
	 * 设置title
	 */
	protected void setTitle(String text) {
		title.setVisibility(View.VISIBLE);
		title.setText(text);
		logo.setVisibility(View.GONE);
	}

	/**
	 * 设置leftBtn
	 */
	protected void setLeft(String leftTxt, int imgId, OnClickListener leftOnClick) {
		leftBtn.setVisibility(View.VISIBLE);
		leftBtn.setText(leftTxt);

		if (imgId != -1) {
			Drawable drawable = getResources().getDrawable(imgId);
			leftBtn.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
			leftBtn.setCompoundDrawablePadding(4);
		}

		if (leftOnClick != null) {
			leftBtn.setOnClickListener(leftOnClick);
		}
		
		if(TextUtils.isEmpty(leftTxt)&&imgId==-1&&leftOnClick==null){
			leftBtn.setVisibility(View.GONE);
		}
	}

	/**
	 * 设置RightBtn
	 */
	protected void setRight(String rightTxt, int imgId, OnClickListener rightOnClick) {
		rightBtn.setVisibility(View.VISIBLE);
		rightBtn.setText(rightTxt);

		if (imgId != -1) {
			Drawable drawable = getResources().getDrawable(imgId);
			rightBtn.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
			rightBtn.setCompoundDrawablePadding(4);
		}

		if (rightOnClick != null) {
			rightBtn.setOnClickListener(rightOnClick);
		}
		
		if(TextUtils.isEmpty(rightTxt)&&imgId==-1&&rightOnClick==null){
			rightBtn.setVisibility(View.GONE);
		}
	}
}
