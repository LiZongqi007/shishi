package com.gaozhen.fruitbuyer.manager;

import java.util.ArrayList;

import android.app.Activity;

public class ActivityManager {

	private ActivityManager() {
	}

	private static ActivityManager instance = new ActivityManager();

	public static ActivityManager getInstance() {
		return instance;
	}

	private static ArrayList<Activity> mActivity = new ArrayList<Activity>();

	public void add(Activity activity) {
		if (!mActivity.contains(activity)) {
			mActivity.add(activity);
		}

	}

	public void remove(Activity activity) {
		if (mActivity.contains(activity)) {
			mActivity.remove(activity);
		}
	}

	public void finishAll() {
		if (mActivity.size() != 0) {
			for (int i = 0; i < mActivity.size(); i++) {
				mActivity.get(i).finish();
			}
		}
	}

	public void finishAll(Class<Activity> clazz) {
		if (mActivity.size() != 0) {
			for (int i = 0; i < mActivity.size(); i++) {
				if (clazz != mActivity.get(i).getClass()) {
					mActivity.get(i).finish();
				}
			}
		}
	}
}
