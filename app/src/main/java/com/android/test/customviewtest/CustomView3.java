package com.android.test.customviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomView3 extends LinearLayout {

    private final TextView mTextView;
    private final Button mButton;

    public CustomView3(Context context, AttributeSet attrs) {
        super(context, attrs);

        // XMLレイアウトをインフレートしてアタッチ
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.custom_view_layout_3, this, true);

        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText("CustomView 3");

        mButton = (Button) findViewById(R.id.button);
        mButton.setText("Button 3");
    }
}
