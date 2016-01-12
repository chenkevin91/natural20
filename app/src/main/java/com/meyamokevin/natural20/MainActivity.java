package com.meyamokevin.natural20;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;
import android.support.v4.view.ViewPager;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

//    TextView mainTextView;
    TextView resultView;
    Button d20Button;
    Button d12Button;
    Button d10Button;
    Button d8Button;
    Button d6Button;
    Button d4Button;
    Button clearButton;
    Button charButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Access the TextView defined in layout XML
        // and then set its text
        //mainTextView = (TextView) findViewById(R.id.main_textview);
        resultView = (TextView) findViewById(R.id.result_textview);

        // 2. Access the Button defined in layout XML
        // and listen for it here
        d20Button = (Button) findViewById(R.id.d20_button);
        d20Button.setOnClickListener(this);

        d12Button = (Button) findViewById(R.id.d12_button);
        d12Button.setOnClickListener(this);

        d10Button = (Button) findViewById(R.id.d10_button);
        d10Button.setOnClickListener(this);

        d8Button = (Button) findViewById(R.id.d8_button);
        d8Button.setOnClickListener(this);

        d6Button = (Button) findViewById(R.id.d6_button);
        d6Button.setOnClickListener(this);

        d4Button = (Button) findViewById(R.id.d4_button);
        d4Button.setOnClickListener(this);

        clearButton = (Button) findViewById(R.id.clear_button);
        clearButton.setOnClickListener(this);

        charButton = (Button) findViewById(R.id.char_button);
        charButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {


        switch(v.getId()) {
            case R.id.d20_button:
                resultView.append(" " + String.valueOf(randInt(1, 20)));
                //resultView.setText(String.valueOf(randInt(1, 20)));
                break;
            case R.id.d12_button:
                resultView.append(" " + String.valueOf(randInt(1, 12)));
                //resultView.setText(String.valueOf(randInt(1, 12)));
                break;
            case R.id.d10_button:
                resultView.append(" " + String.valueOf(randInt(1, 10)));
                //resultView.setText(String.valueOf(randInt(1, 10)));
                break;
            case R.id.d8_button:
                resultView.append(" " + String.valueOf(randInt(1, 8)));
                //resultView.setText(String.valueOf(randInt(1, 8)));
                break;
            case R.id.d6_button:
                resultView.append(" "+String.valueOf(randInt(1, 6)));
                //resultView.setText(String.valueOf(randInt(1, 6)));
                break;
            case R.id.d4_button:
                resultView.append(" "+String.valueOf(randInt(1, 4)));
                //resultView.setText(String.valueOf(randInt(1, 4)));
                break;
            case R.id.clear_button:
                resultView.setText("");
                break;

            case R.id.char_button:
                Intent intent = new Intent(this, CharActivity.class);
                startActivity(intent);
        }
    }

    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }


}
