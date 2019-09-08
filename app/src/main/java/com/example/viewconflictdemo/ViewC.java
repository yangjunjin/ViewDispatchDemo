package com.example.viewconflictdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class ViewC extends TextView {

	public ViewC(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		System.out.println(Utils.getActionName(ev) + ", ViewC.dispatch");
		boolean result = super.dispatchTouchEvent(ev);
		System.out.println(Utils.getActionName(ev) + ", ViewC.dispatch = " + result);
		return result;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean result = false;
		System.out.println(Utils.getActionName(event) + ", ViewC.touch = " + result);
		return result;
	}

}
