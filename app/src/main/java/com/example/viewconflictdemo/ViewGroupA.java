package com.example.viewconflictdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ViewGroupA extends LinearLayout {
	private String TAG = "TAG=";
	
	public ViewGroupA(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e(TAG,Utils.getActionName(ev) + ", ViewGroupA.dispatchTouchEvent");
		return super.dispatchTouchEvent(ev);
//		return false;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.e(TAG,Utils.getActionName(ev) + ", ViewGroupA.onInterceptTouchEvent");
		return super.onInterceptTouchEvent(ev);
//		return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.e(TAG,Utils.getActionName(event) + ", ViewGroupA.onTouchEvent");
		return super.onTouchEvent(event);
//		return true;

	}
}
