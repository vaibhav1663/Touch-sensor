package com.ahen.touchsensor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View root;
    private float x;
    private float y;
    private float p;
    private float s;
    TextView textView, textView1, textView2, textView3;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root = findViewById(R.id.root);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);
        textView3 = findViewById(R.id.textView8);
        img = findViewById(R.id.imageView);
        root.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                x = motionEvent.getX();
                y = motionEvent.getY();
                p = motionEvent.getPressure(motionEvent.getPointerId(motionEvent.getActionIndex()));
                s = motionEvent.getSize();
                img.setX(x);
                img.setY(y);
                textView.setText(String.valueOf(x));
                textView1.setText(String.valueOf(y));
                textView2.setText(String.valueOf(p));
                textView3.setText(String.valueOf(s));
                return true;
            }
        });
    }
}