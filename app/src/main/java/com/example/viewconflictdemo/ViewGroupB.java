package com.example.viewconflictdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ViewGroupB extends LinearLayout {

	public ViewGroupB(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		System.out.println(Utils.getActionName(ev) + ", ViewGroupB.dispatchTouchEvent");
		boolean result = super.dispatchTouchEvent(ev);
		System.out.println(Utils.getActionName(ev) + ", ViewGroupB.dispatchTouchEvent = " + result);
		return result;
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		boolean result = false;
		System.out.println(Utils.getActionName(ev) + ", ViewGroupB.onInterceptTouchEvent = " + result);
		return result;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean result = false;
		System.out.println(Utils.getActionName(event) + ", ViewGroupB.onTouchEvent = " + result);
		return result;
	}

}
