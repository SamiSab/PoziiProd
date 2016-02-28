package com.example.analia.apptest;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class CountDown extends AppCompatActivity {
    private boolean timerStart = false;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button stop = (Button) this.findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CountDown.this, TimerActivity.class));
                if (timerStart) {
                    timer.cancel();
                }
            }
        });
        final CountDownTimer timer = new myCountDownTimer(1200000, 1000);
        if (!timerStart) {
            timer.start();
            timerStart = true;
        } else {
            timer.cancel();
            timerStart = false;
        }
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CountDown.this, TimerActivity.class));
                if (timerStart) {
                    timer.cancel();
                }
            }
        });

    }

    public class myCountDownTimer extends CountDownTimer {
        public myCountDownTimer(long start, long interval){
            super(start, interval);
        }
        @Override
        public void onTick(long millisUntilFinished) {

            TextView countDown = (TextView) findViewById(R.id.countDown);
            if((millisUntilFinished / 1000) <= 10){
                countDown.setTextColor(Color.parseColor("red"));
            }
            String ans = displayTime(millisUntilFinished);
            countDown.setText(ans);
        }

        @Override
        public void onFinish() {
            TextView countDown = (TextView) findViewById(R.id.countDown);
            countDown.setText("Done!");
            Button goBack = (Button) findViewById(R.id.goBack);
            goBack.setVisibility(View.VISIBLE);
            goBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(CountDown.this, TimerActivity.class));
                }
            });
        }

        private String displayTime(long milli){
            long sec = milli / 1000;
            int min = 0;
            if((sec < 60) && (sec > 0)){
                return Long.toString(sec);
            }
            while(sec >= 60){
                min++;
                sec -= 60;
            }
            int hr = 0;
            while(min >= 60){
                hr++;
                min -= 60;
            }

            if((hr != 0) || (min != 0)){
                if(sec == 0){
                    sec = 59;
                    min -= 1;
                }
                else{
                    sec -= 1;
                }
            }
            String second = Long.toString(sec);
            if(second.length() == 1){
                second = "0" + second;
            }
            return Integer.toString(hr) + ":" + Integer.toString(min) + ":" + second;
        }

    }

}
