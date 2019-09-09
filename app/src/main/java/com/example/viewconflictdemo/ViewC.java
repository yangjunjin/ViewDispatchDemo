package com.example.viewconflictdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class ViewC extends TextView {
    private String TAG = "TAG=";

    public ViewC(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, Utils.getActionName(ev) + ", ViewC.dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, Utils.getActionName(event) + ", ViewC.onTouchEvent");
//        return super.onTouchEvent(event);
        return false;
    }
}
