package com.example.xitom.myh51;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by XiTom on 2017/1/12.
 */

public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }
}
