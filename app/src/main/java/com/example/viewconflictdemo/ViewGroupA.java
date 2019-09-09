package com.example.viewconflictdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ViewGroupA extends LinearLayout {
	
	public ViewGroupA(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		System.out.println(Utils.getActionName(ev) + ", ViewGroupA.dispatchTouchEvent");
		boolean result = super.dispatchTouchEvent(ev);
		System.out.println(Utils.getActionName(ev) + ", ViewGroupA.dispatchTouchEvent = " + result);
		return result;
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		boolean result = false;
		System.out.println(Utils.getActionName(ev) + ", ViewGroupA.onInterceptTouchEvent = " + result);
		return result;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean result = false;
		System.out.println(Utils.getActionName(event) + ", ViewGroupA.onTouchEvent = " + result);
		return result;
	}
}
