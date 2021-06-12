package com.safayet.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        Thread thread = new Thread(){

            public void run(){

              try {
                  sleep(1000);
              }catch (Exception e) {

                  e.printStackTrace();

                }finally {
                    Intent intent = new Intent(Splash_activity.this, MainActivity.class);
                   startActivity(intent);
              }
            }

        };thread.start();

    }

}