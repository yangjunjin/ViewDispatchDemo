package com.example.viewconflictdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ViewGroupB extends LinearLayout {
	private String TAG = "TAG=";
	public ViewGroupB(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e(TAG,Utils.getActionName(ev) + ", ViewGroupB.dispatchTouchEvent");
		return super.dispatchTouchEvent(ev);
	}
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.e(TAG,Utils.getActionName(ev) + ", ViewGroupB.onInterceptTouchEvent");
		return super.onInterceptTouchEvent(ev);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.e(TAG,Utils.getActionName(event) + ", ViewGroupB.onTouchEvent");
		return super.onTouchEvent(event);
	}
}
