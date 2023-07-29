package com.enrike.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask splash = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ActividadPrincipal.class);
                startActivity(intent);
                finish();
            }
        };

        Timer time = new Timer();
        time.schedule(splash, 4000);
        }
    }