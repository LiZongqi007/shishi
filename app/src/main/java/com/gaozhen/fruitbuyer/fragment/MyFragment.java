package com.gaozhen.fruitbuyer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.activity.AttentionFruitActivity;
import com.gaozhen.fruitbuyer.activity.AttentionFruiterActivity;
import com.gaozhen.fruitbuyer.activity.MyCouponActivity;
import com.gaozhen.fruitbuyer.activity.MyFruitFriendActivity;
import com.gaozhen.fruitbuyer.activity.MyIntegralActivity;
import com.gaozhen.fruitbuyer.activity.MyOrderActivity;
import com.gaozhen.fruitbuyer.activity.MySystemMessageActivity;
import com.gaozhen.fruitbuyer.activity.MyWalletActivity;
import com.gaozhen.fruitbuyer.activity.OpeGardenActivity;
import com.gaozhen.fruitbuyer.activity.SettingActivity;
import com.gaozhen.fruitbuyer.application.Constant.OrderState;
import com.gaozhen.fruitbuyer.utils.AppUtil;

public class MyFragment extends BaseFragment implements OnClickListener {

	private ImageView user_head;
	private TextView user_name;
	private LinearLayout ll_2, ll_3, ll_1, wait_pay, wait_delivery, has_deliveried,
			has_take_delivery;
	private RelativeLayout my_orders, my_msg, my_wallet, my_bill, rl_remind, setting,
			system_message;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = View.inflate(getActivity(), R.layout.fragment_personal_center, null);
		user_head = (ImageView) view.findViewById(R.id.user_head);
		user_head.setOnClickListener(this);
		ll_1 = (LinearLayout) view.findViewById(R.id.ll_1);
		ll_1.setOnClickListener(this);
		ll_2 = (LinearLayout) view.findViewById(R.id.ll_2);
		ll_2.setOnClickListener(this);
		ll_3 = (LinearLayout) view.findViewById(R.id.ll_3);
		ll_3.setOnClickListener(this);
		user_name = (TextView) view.findViewById(R.id.user_name);
		wait_pay = (LinearLayout) view.findViewById(R.id.wait_pay);
		wait_pay.setOnClickListener(this);
		wait_delivery = (LinearLayout) view.findViewById(R.id.wait_delivery);
		wait_delivery.setOnClickListener(this);
		has_deliveried = (LinearLayout) view.findViewById(R.id.has_deliveried);
		has_deliveried.setOnClickListener(this);
		has_take_delivery = (LinearLayout) view.findViewById(R.id.has_take_delivery);
		has_take_delivery.setOnClickListener(this);
		my_orders = (RelativeLayout) view.findViewById(R.id.my_orders);
		my_orders.setOnClickListener(this);
		my_msg = (RelativeLayout) view.findViewById(R.id.my_msg);
		my_msg.setOnClickListener(this);
		my_wallet = (RelativeLayout) view.findViewById(R.id.my_wallet);
		my_wallet.setOnClickListener(this);
		my_bill = (RelativeLayout) view.findViewById(R.id.my_bill);
		my_bill.setOnClickListener(this);
		rl_remind = (RelativeLayout) view.findViewById(R.id.rl_remind);
		rl_remind.setOnClickListener(this);
		system_message = (RelativeLayout) view.findViewById(R.id.system_message);
		system_message.setOnClickListener(this);
		setting = (RelativeLayout) view.findViewById(R.id.setting);
		setting.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.user_head:
			// 头像;
			break;
		case R.id.ll_1:
			// 关注的果农;
			AppUtil.startActivity(getActivity(), AttentionFruiterActivity.class, null);
			break;
		case R.id.ll_2:
			// 关注的水果;
			AppUtil.startActivity(getActivity(), AttentionFruitActivity.class, null);
			break;
		case R.id.ll_3:
			// 我的积分;
			AppUtil.startActivity(getActivity(),MyIntegralActivity.class, null);
			break;
		case R.id.my_orders:
			// 我的订单;
			AppUtil.startActivity(getActivity(), MyOrderActivity.class, null);
			break;
		case R.id.wait_pay:
			// 待付款;
			Bundle edit_order = new Bundle();
			edit_order.putInt(OrderState.ORDER_TYPE, OrderState.UNPAID);
			AppUtil.startActivity(getActivity(), MyOrderActivity.class, edit_order);
			break;
		case R.id.wait_delivery:
			// 待发货;
			Bundle wait_order = new Bundle();
			wait_order.putInt(OrderState.ORDER_TYPE, OrderState.PAID_UNSEND);
			AppUtil.startActivity(getActivity(), MyOrderActivity.class, wait_order);
			break;
		case R.id.has_deliveried:
			// 待收货;
			Bundle has_send = new Bundle();
			has_send.putInt(OrderState.ORDER_TYPE, OrderState.SEND);
			AppUtil.startActivity(getActivity(), MyOrderActivity.class, has_send);
			break;
		case R.id.has_take_delivery:
			// 待评价;
			Bundle has_get = new Bundle();
			has_get.putInt(OrderState.ORDER_TYPE, OrderState.RECEIVED_NO_COMMENT);
			AppUtil.startActivity(getActivity(), MyOrderActivity.class, has_get);
			break;
		case R.id.my_msg:
			// 果友圈;
			AppUtil.startActivity(getActivity(), MyFruitFriendActivity.class, null);
			break;
		case R.id.my_wallet:
			// 优惠券;
			AppUtil.startActivity(getActivity(), MyCouponActivity.class, null);
			break;
		case R.id.my_bill:
			// 我的钱包;
			AppUtil.startActivity(getActivity(), MyWalletActivity.class, null);
			break;
		case R.id.rl_remind:
			// 开园提醒;
			AppUtil.startActivity(getActivity(), OpeGardenActivity.class, null);
			break;
		case R.id.system_message:
			// 系统消息;
			AppUtil.startActivity(getActivity(), MySystemMessageActivity.class, null);
			break;
		case R.id.setting:
			// 设置;
			AppUtil.startActivity(getActivity(), SettingActivity.class, null);
			break;
		default:
			break;
		}
	}

	@Override
	void setTopBar() {
		setLogoVisible();
		setLeft("", -1, null);
		setRight("", -1, null);
	}

}
