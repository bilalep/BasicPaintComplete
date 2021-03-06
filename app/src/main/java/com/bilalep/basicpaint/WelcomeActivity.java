package com.bilalep.basicpaint;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class WelcomeActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIMEOUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(homeIntent);
                finish();

            }
        },SPLASH_SCREEN_TIMEOUT);
    }
}
