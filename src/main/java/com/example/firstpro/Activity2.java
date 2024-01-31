package com.example.firstpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {

    // final String TAG= "TAG Page 2";

    Intent intent;
    String message;
    TextView tv_details;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
     //   Log.i(TAG,"on Create");

        intent=getIntent();
        message= intent.getStringExtra("msg");
        tv_details= findViewById(R.id.tv_details);
        tv_details.setText(message);




    }

}