package com.android.test.customviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CustomView2 extends FrameLayout {

    private final TextView mTextView;
    private final Button mButton;

    public CustomView2(Context context, AttributeSet attrs) {
        super(context, attrs);

        // XMLレイアウトをインフレートしてアタッチ
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.custom_view_layout_2, this, true);

        mTextView = (TextView) findViewById(R.id.text);
        mTextView.setText("CustomView 2");

        mButton = (Button) findViewById(R.id.button);
        mButton.setText("Button 2");
    }
}
