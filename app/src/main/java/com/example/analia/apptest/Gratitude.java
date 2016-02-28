package com.example.analia.apptest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Gratitude extends AppCompatActivity {
//pls
public static String [] text;
    public EditText input;
    public TextView output;
    public static ArrayList<String> messages = new ArrayList<String>();

    public void doneButton(View view){
        EditText edit = (EditText)findViewById(R.id.gratitudeText);
        String s = edit.getText().toString();
        messages.add(s);
        Intent intent = new Intent(Gratitude.this, EntryScreen.class);
        for (String st:messages) {
            intent.putExtra("hello", st);
        }
            startActivity(intent);
    }
    //okay what


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gratitude);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
