package com.blogspot.psbapplications.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void forwardResult(View view) {
        RatingBar ratingBar = findViewById(R.id.rating_bar);
        float rating = ratingBar.getRating();
        Intent gotoSecondActivity = new Intent();
        gotoSecondActivity.setClass(this, SecondActivity.class);
        gotoSecondActivity.putExtra("rating",rating);
        startActivity(gotoSecondActivity);
    }
}