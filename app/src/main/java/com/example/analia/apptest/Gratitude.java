package com.example.analia.apptest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Gratitude extends AppCompatActivity {


    public void doneButton(View view){
        /*
        Need to create TableRow object
        Place in Grid Layout
         */

        //Get EditText gratitudeText by id
        EditText editTextName = (EditText)findViewById(R.id.gratitudeText);

        //Storing gratitudeText in a text variable
        TextView input = (TextView)editTextName.getText();
        //Text userInput = (Text) editTextName.getText();
        //Context test = (Context) userInput;

        //TableRow entry = new TableRow(test);

        TableLayout table = (TableLayout) findViewById(R.id.Table1); //Current table layout in EntryScreen

        //Parameters enforced on table rows
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);

        TableRow entry = new TableRow(this);
        entry.setLayoutParams(layoutParams);

        entry.addView(input);
        table.addView(entry);

        //Activity should not be switched until user inputted has been stored
        startActivity(new Intent(Gratitude.this, EntryScreen.class));

    }


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
