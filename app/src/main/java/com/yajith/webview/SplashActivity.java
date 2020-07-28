package com.yajith.webview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        ImageView imageView=findViewById(R.id.imageView);
        TextView textView=findViewById(R.id.dept);
        imageView.startAnimation(animation);
        textView.startAnimation(animation);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    finish();
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
            }, 1500);
    }
}
