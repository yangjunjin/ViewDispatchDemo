package com.example.viewconflictdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;


/**
 * Created by ${YangJunJin}
 * on 2019/9/7
 */
public class MyLinearLayout extends LinearLayout {
    private final String TAG = "MyLinearLayout=============";

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyLinearLayout setListener(onDispatchTouchEventListener listener) {
        this.listener = listener;
        return this;
    }

    onDispatchTouchEventListener listener;

    public interface onDispatchTouchEventListener {
        void onTouchEvent(boolean vertical);
    }

    public int mLastXIntercept = 0;
    public int mLastYIntercept = 0;

    /**
     * 外部拦截法
     *
     * @param event
     * @return
     */
    @SuppressLint("LongLogTag")
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean intercepted = false;
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                intercepted = false;
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = x - mLastXIntercept;
                int deltaY = y - mLastYIntercept;
                Log.e(TAG, "onInterceptTouchEvent1=dX=" + Math.abs(deltaX) + ",dY=" + Math.abs(deltaY) + "==" + (Math.abs(deltaY) > Math.abs(deltaX)));
                if (Math.abs(deltaY) > Math.abs(deltaX)) {//上下滑动
                    intercepted = true;
                    listener.onTouchEvent(true);
                } else {
                    intercepted = false;
                }
                break;
            case MotionEvent.ACTION_UP:
                intercepted = false;
                break;
        }
        mLastXIntercept = x;
        mLastYIntercept = y;
        Log.e(TAG, "onInterceptTouchEvent = " + intercepted + ",getAction=" + event.getAction());
        return intercepted;
    }
}
