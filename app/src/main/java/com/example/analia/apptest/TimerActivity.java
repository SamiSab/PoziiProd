package com.example.analia.apptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Button;


public class TimerActivity extends AppCompatActivity {
    private Button goB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button goB = (Button) this.findViewById(R.id.button);
        goB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TimerActivity.this, CountDown.class));
            }
        });

    }

    public void doButtonClick(View e){
        TextView displayTime = (TextView) findViewById(R.id.textView2);
        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        displayTime.setText(timeToString(timePicker));
    }

    private String timeToString(TimePicker tp){
        int currHour = tp.getCurrentHour();
        int currMinute = tp.getCurrentMinute();
        if(currMinute < 40){
            currMinute += 20;
        }
        else{
            int diff = 60 - currMinute;
            currHour += 1;
            currMinute = 20 - diff;
        }
        String currMinuteS = Integer.toString(currMinute);
        if(currHour > 12){
            currHour -= 12;
        }
        if(currMinuteS.length() < 2){
            currMinuteS = "0" + currMinuteS;
        }
        return Integer.toString(currHour) + ":" + currMinuteS;
    }

}

