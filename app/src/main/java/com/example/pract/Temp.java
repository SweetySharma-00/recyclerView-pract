package com.example.pract;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Temp extends AppCompatActivity {
    ImageView img;
    TextView t1,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        getSupportActionBar().hide();

        img=(ImageView) findViewById(R.id.image1);
        t1=(TextView) findViewById(R.id.mainTextView);
        t3=(TextView) findViewById(R.id.textView);

        img.setImageResource(getIntent().getIntExtra("image1",0));
        t1.setText(getIntent().getStringExtra("main"));
        t3.setText(getIntent().getStringExtra("name"));
    }
}