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
		System.out.println(Utils.getActionName(ev) + ", ViewGroupB.dispatch");
		boolean result = super.dispatchTouchEvent(ev);
		System.out.println(Utils.getActionName(ev) + ", ViewGroupB.dispatch = " + result);
		return result;
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		boolean result = false;
		System.out.println(Utils.getActionName(ev) + ", ViewGroupB.intercept = " + result);
		return result;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean result = false;
		System.out.println(Utils.getActionName(event) + ", ViewGroupB.touch = " + result);
		return result;
	}

}
