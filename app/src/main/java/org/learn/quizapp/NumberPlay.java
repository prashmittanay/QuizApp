package org.learn.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumberPlay extends AppCompatActivity {

    private int mNumber;
    private Button mIncrementButton;
    private Button mDecrementButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIncrementButton = findViewById(R.id.button_main_increment);
        mDecrementButton = findViewById(R.id.button_main_decrement);
        mTextView = findViewById(R.id.text_main_number);

        mNumber = 0;

        drawValue();
        bindListeners();
    }


    private void bindListeners() {
        mIncrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumber++;
                drawValue();
            }
        });

        mDecrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNumber--;
                drawValue();
            }
        });
    }

    private void drawValue() {
        mTextView.setText(String.valueOf(mNumber));
    }
}