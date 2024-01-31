package com.example.firstpro;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    AppCompatButton followButton, btn_call, btn_message;

    TextView tv_details;
    ImageView  btnFB;
    ImageView btnInsta;





    // TextView tv_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG", "ON Create");

        // Log.i(TAG,"on Create");

        followButton = findViewById(R.id.btn_follow);

        followButton.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, Activity2.class);

            String message = tv_details.getText().toString();
            intent.putExtra("msg", message);

            startActivity(intent);

        });


        btn_call = findViewById(R.id.btn_call);
        btn_call.setOnClickListener(v -> {

            String number="+880171542";
            Uri uri=Uri.fromParts("tel",number,null);
            Intent intent= new Intent(Intent.ACTION_DIAL);
            intent.setData(uri);


            startActivity(intent);
        });

        // sms button click and send message
        btn_message = findViewById(R.id.btn_message);

        btn_message.setOnClickListener(v -> {

            String number="+88012545545";
            Uri uri=Uri.fromParts("sms",number,"");
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.putExtra("sms_body","");
            intent.setData(uri);
            startActivity(intent);

        });




        tv_details= findViewById(R.id.tv_details);

        btnFB = findViewById(R.id.btnFB);
        btnInsta = findViewById(R.id.btnInsta);

        btnFB.setOnClickListener(v -> {

            launchurl("https://www.facebook.com/");
        });

        btnInsta.setOnClickListener(v -> {

            launchurl("https://www.instagram.com/");
        });




    }


    private void launchurl(final String url) {

        Uri uri= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("TAG", "ON Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("TAG", "ON Resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "ON Pause");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("TAG", "ON Stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("TAG", "ON Destroy");

    }
}

