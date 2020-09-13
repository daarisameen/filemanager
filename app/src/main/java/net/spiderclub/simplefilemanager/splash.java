package net.spiderclub.simplefilemanager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class splash extends AppCompatActivity
{
    private static int SPLASH_TIME_OUT=1400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent homeIntent = new Intent(splash.this,MainActivity.class);
            startActivity(homeIntent);
            finish();
            }
        },SPLASH_TIME_OUT);


    }

}
