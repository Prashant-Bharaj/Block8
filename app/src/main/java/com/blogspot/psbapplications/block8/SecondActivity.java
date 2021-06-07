package com.blogspot.psbapplications.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller = new Intent();
        float rating = caller.getFloatExtra("rating",0);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(String.format("%s\n%s%s", getString(R.string.welcome_to_second_activity),getString(R.string.rating) ,rating));
    }
}