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

public class Gratitude extends AppCompatActivity {


    public void doneButton(View view){
        //Grabbing table from entry_screen
        /*TableLayout table = (TableLayout)findViewById(R.id.Table1);

        TableRow entry = new TableRow(this);
        entry.setGravity(Gravity.LEFT);

        //Grabbing text from gratitudeText
        EditText editTextName = (EditText)findViewById(R.id.gratitudeText);
        TextView input = (TextView)editTextName.getText();

        entry.addView(input); //Added text field to table row
        table.addView(entry); //Added row to Table1


        RelativeLayout rlayout = (RelativeLayout)findViewById(R.id.entryScreenRL);
        /*RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT,
                RelativeLayout.LayoutParams.FILL_PARENT);*/
        /*rlayout.addView(table);
        setContentView(rlayout);*/

        //Need to add table back to layout

        //Storing gratitudeText in a text variable
        //TextView input = (TextView)editTextName.getText();
        /*TextView entryLabel = new TextView(this);
        entryLabel.setText(editTextName.getText().toString());
        entryLabel.setTextSize(18);*/
        //Text userInput = (Text) editTextName.getText();
        //Context input = (Context)userInput;

        //TableRow entry = new TableRow(test);

        //TableLayout table = (TableLayout) findViewById(R.id.Table1); //Current table layout in EntryScreen

        //Parameters enforced on table rows
        /*TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);*/

        /*TableRow entry = new TableRow(this); //creating the TableRow
        entry.setGravity(Gravity.LEFT); //Want to appear on left
        entry.addView(entryLabel);*/
        //entry.setLayoutParams(layoutParams); //Setting the parameters of the TableRow

        /*entry.addView(input); //Adding the userInput into the table row*/
        //table.addView(entry); //Adding the table row into the table*/

        //Activity should not be switched until user inputted has been stored
        //setContentView(table);
        startActivity(new Intent(Gratitude.this, EntryScreen.class));
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
