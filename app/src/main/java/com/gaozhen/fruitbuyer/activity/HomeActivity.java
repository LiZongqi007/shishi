package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.fragment.BasketFragment;
import com.gaozhen.fruitbuyer.fragment.CategoryFragment;
import com.gaozhen.fruitbuyer.fragment.HomeFragment;
import com.gaozhen.fruitbuyer.fragment.MyFragment;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class HomeActivity extends BaseActivity {

	private LinearLayout mHomeLayout;
	private LinearLayout mCategoryLayout;
	private LinearLayout mBasketLayout;
	private LinearLayout mMyLayout;
	private Fragment currentFragment;
	private Fragment mHomeFragment = new HomeFragment();
	private Fragment mCategoryFragment = new CategoryFragment();
	private Fragment mBasketFragment = new BasketFragment();
	private Fragment mMyFragment = new MyFragment();

	private long exitTime = 0;

	public LinearLayout getmHomeLayout() {
		return mHomeLayout;
	}

	public LinearLayout getmCategoryLayout() {
		return mCategoryLayout;
	}

	public LinearLayout getmMyLayout() {
		return mMyLayout;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		mHomeLayout = (LinearLayout) findViewById(R.id.home_layout);
		mCategoryLayout = (LinearLayout) findViewById(R.id.category_layout);
		mBasketLayout = (LinearLayout) findViewById(R.id.basket_layout);
		mMyLayout = (LinearLayout) findViewById(R.id.my_layout);

		mHomeLayout.setOnClickListener(this);
		mCategoryLayout.setOnClickListener(this);
		mBasketLayout.setOnClickListener(this);
		mMyLayout.setOnClickListener(this);
		mHomeLayout.performClick();
	}

	@Override
	void setTopBar() {
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.home_layout:
			initTab();
			mHomeLayout.setBackgroundResource(R.color.green_dark);
			switchFragment(mHomeFragment);
			currentFragment = mHomeFragment;
			break;
		case R.id.category_layout:
			initTab();
			mCategoryLayout.setBackgroundResource(R.color.green_dark);
			switchFragment(mCategoryFragment);
			currentFragment = mCategoryFragment;
			break;
		case R.id.basket_layout:
			initTab();
			setLogoVisible();
			mBasketLayout.setBackgroundResource(R.color.green_dark);
			switchFragment(mBasketFragment);
			currentFragment = mBasketFragment;
			break;
		case R.id.my_layout:
			initTab();
			mMyLayout.setBackgroundResource(R.color.green_dark);
			switchFragment(mMyFragment);
			currentFragment = mMyFragment;
			break;

		default:
			break;
		}
	}

	void initTab() {
		mHomeLayout.setBackgroundResource(R.color.theme_green);
		mCategoryLayout.setBackgroundResource(R.color.theme_green);
		mBasketLayout.setBackgroundResource(R.color.theme_green);
		mMyLayout.setBackgroundResource(R.color.theme_green);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
			if ((System.currentTimeMillis() - exitTime) > 2000) {
				AppUtil.toast(this, "再按一次返回键退出程序");
				exitTime = System.currentTimeMillis();
			} else {
				android.os.Process.killProcess(android.os.Process.myPid());
				System.exit(0);
			}
			return true;
		}
		return false;
	}

	private void switchFragment(Fragment fragment) {
		if (currentFragment != fragment) {
			FragmentManager fragmentManager = getSupportFragmentManager();
			FragmentTransaction transaction = fragmentManager.beginTransaction();
			if (fragment.isAdded()) {
				transaction.show(fragment);
			} else {
				transaction.add(R.id.fragment_content, fragment);
			}
			if (currentFragment != null) {
				transaction.hide(currentFragment);
			}
			transaction.commit();
		}
	}

}