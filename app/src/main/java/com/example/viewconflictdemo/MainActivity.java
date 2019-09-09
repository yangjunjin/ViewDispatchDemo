package com.example.viewconflictdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("---------------------------------------------");
        System.out.println(Utils.getActionName(ev) + ", Activity.dispatchTouchEvent");
        boolean result = super.dispatchTouchEvent(ev);
        System.out.println(Utils.getActionName(ev) + ", Activity.dispatchTouchEvent = " + result);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = false;
        System.out.println(Utils.getActionName(event) + ", Activity.onTouchEvent = " + result);
        return result;
    }
}
