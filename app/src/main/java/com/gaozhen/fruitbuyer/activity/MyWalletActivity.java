package com.gaozhen.fruitbuyer.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;

public class MyWalletActivity extends BaseActivity {

	private RelativeLayout mRecharge;
	private TextView mRemain;
	private TextView mWithdrawCash;
	private RelativeLayout pay_type_layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_wallet);

		mRemain = (TextView) findViewById(R.id.remaining_sum);
		mWithdrawCash = (TextView) findViewById(R.id.withdraw_cash);
		mRecharge = (RelativeLayout) findViewById(R.id.recharge_layout);
		pay_type_layout = (RelativeLayout) findViewById(R.id.pay_type_layout);

		mWithdrawCash.setOnClickListener(this);
		mRecharge.setOnClickListener(this);
		pay_type_layout.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		// case R.id.withdraw_cash:
		// AppUtil.startActivity(this, MyBankCardActivity.class, null);
		// break;
		// case R.id.recharge_layout:
		//
		// break;
		// case R.id.pay_type_layout:
		// AppUtil.startActivity(this, PayTypeActivity.class, null);
		// break;
		// case R.id.bank_card_layout:
		// AppUtil.startActivity(this, MyBankCardActivity.class, null);
		// break;

		default:
			break;
		}
	}

	@Override
	void setTopBar() {

		setTitle("我的钱包");
		setLeft("返回", R.drawable.back, new OnClickListener() {

			@Override
			public void onClick(View v) {

				finish();
			}
		});
	}

}
