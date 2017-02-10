package com.example.xitom.myh51;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by XiTom on 2016/12/19.
 */

public class Splash extends Activity{


    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            Intent intent = new Intent(Splash.this, ListActivity.class);
            startActivity(intent);
            finish();
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        intiView();

    }

    private void intiView(){
        timer.schedule(timerTask,3000);
    }

    //
}
