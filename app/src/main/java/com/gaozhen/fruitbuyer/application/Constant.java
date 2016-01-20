package com.gaozhen.fruitbuyer.application;

public class Constant {

	public static final String TAG = "劲果";
	
	// public static final String SERVER =
	// "http://192.168.1.129:8080/jgpro_impl/";
	public static final String SERVER = "http://192.168.1.120:8080/jgproject/";
	
	public static final class DB {
		public static final String NAME = "fruitdb";
		public static final int VERSION = 1;
	}

	public static final class ForcedOffline{
//		public static final String FORCED_OFFLINE = "{\"attributes\":null,\"msg\":\"无此用户或用户未登录!\",\"obj\":null,\"success\":\"false\"}";
		public static final String FORCED_OFFLINE1 = "帐号已被其他人";
		public static final String FORCED_OFFLINE2 = "用户未登录";
		public static final String ACTION = "com.gaozhen.forcedofflinebroadcast";
	}


	public static final class VerifyCodeType {
		public static final String TYPE = "verify_code_type";
		public static final int EDIT_PWD = 0;
		public static final int RIGERSTER = 1;
//		public static final int CHANGE_PHONE = 2;
		public static final int FORGET_PWD = 3;
	}

	public static final class AddressInfo {
		public static final String DATE = "bj_date";
		public static final String CODE = "p_region_code";
		public static final String REGION_CODE = "region_code";
		public static final String REGION_LEVEL = "region_level";
		public static final String REGION_NAME = "region_name";
	}

	public static final class UserInfo {
		public static final String TOKEN = "user_token";
		public static final String NAME = "user_name";
		public static final String PHONE = "user_phone";
		public static final String PWD = "user_pwd";
		public static final String HEAD = "user_head";
		public static final String ADDRESS_CODE = "user_address_code";
		public static final String ADDRESS_DETAIL = "user_address_detail";
	}


	public static final class OrderState {
		public static final String ORDER_TYPE = "order_type";
		/** 未知 */
		public static final int UNKNOWN = 0;
		/** 未付款 */
		public static final int UNPAID = 1;
		/** 已付款，未发货 */
		public static final int PAID_UNSEND = 2;
		/** 已发货 */
		public static final int SEND = 3;
		/** 已收货，待评论 */
		public static final int RECEIVED_NO_COMMENT = 4;
		/** 已评论（已完成） */
		public static final int COMMENTED = 5;
		/** 已取消 */
		public static final int CANCLED = 6;
		/** 异常订单 */
		public static final int EXCEPTION = 7;
	}

	public static final class SNSellRegister {
		public static final String SERVICE = Constant.SERVER + "services/SNSellRegister";
		/** 登录 */
		public static final String SELL_LOGIN = "sellLogin";
		/** 注册 */
		public static final String SELL_REGISTER = "sell_register";
		/** 获取验证码 */
		public static final String SELL_CODE = "getVerfi_code";
		/** 验证验证码 */
		public static final String SELL_CODE_IF = "yzVerfi_code";
		/** 编辑果铺信息 */
		public static final String EDIT_FRUIT_SHOP = "EditFruitShop";
		/** 获取果铺信息 */
		public static final String OBTAIN_FRUIT_SHOP = "getAllSellREgisterByUserToken";
		/** 申请开店 */
		public static final String APPAY_FRUIT_SHOP = "yzsqShop";
		/** 修改用户信息 */
		public static final String EDIT_USER_INFO = "update_sell_register";

	}


	public static final class SNSysRegion {
		public static final String SERVICE = Constant.SERVER + "services/SNSysRegion";
		/** 获取省市区 */
		public static final String SELL_PROVINCE = "getRegionName";
		/** 上传图片*/
		public static final String UPLOAD_PIC = "getSelect";
	}

	/**
	 * 水果分类
	 */
	public static final class SNSysFruitClass {
		public static final String SERVICE = Constant.SERVER + "services/SNSysFruitsClass";
		/** 获取所有水果分类 */
		public static final String GET_ALL_FRUTI_CLASS = "listAllFruit";
	}
}
