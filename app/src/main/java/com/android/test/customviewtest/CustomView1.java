package com.android.test.customviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomView1 extends LinearLayout {

    private TextView mTextView;
    private Button mButton;

    public CustomView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText("CustomView 1");

        mButton = (Button) findViewById(R.id.button);
        mButton.setText("Button 1");
    }
}

