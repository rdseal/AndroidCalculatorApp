package com.seal.myapplicationforapril4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double currentTopValue = 0.0;
    private double nextTopValue = 0.0;
    private boolean add = false;
    private boolean subtract = false;
    private boolean multiply = false;
    private boolean divide = false;
    private boolean decimal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //
    public void clickedZero(View view) {
        currentTopValue = (currentTopValue * 10.0) + 0.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedOne(View view) {
        currentTopValue = (currentTopValue * 10.0) + 1.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedTwo(View view) {
        currentTopValue = (currentTopValue * 10.0) + 2.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedThree(View view) {
        currentTopValue = (currentTopValue * 10.0) + 3.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedFour(View view) {
        currentTopValue = (currentTopValue * 10.0) + 4.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedFive(View view) {
        currentTopValue = (currentTopValue * 10.0) + 5.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedSix(View view) {
        currentTopValue = (currentTopValue * 10.0) + 6.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedSeven(View view) {
        currentTopValue = (currentTopValue * 10.0) + 7.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedEight(View view) {
        currentTopValue = (currentTopValue * 10.0) + 8.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedNine(View view) {
        currentTopValue = (currentTopValue * 10.0) + 9.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedDecimal(View view) {
        nextTopValue = currentTopValue;
        currentTopValue = 0.0;
        decimal = true;
    }

    public void clickedNegative(View view) {
        currentTopValue = currentTopValue * -1;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedPlus(View view) {
        nextTopValue = currentTopValue;
        currentTopValue = 0.0;
        add = true;
    }

    public void clickedMinus(View view) {
        nextTopValue = currentTopValue;
        currentTopValue = 0.0;
        subtract = true;
    }

    public void clickedMultiply(View view) {
        nextTopValue = currentTopValue;
        currentTopValue = 0.0;
        multiply = true;
    }

    public void clickedDivide(View view) {
        nextTopValue = currentTopValue;
        currentTopValue = 0.0;
        divide = true;
    }

    public void clickedSquare(View view) {
        currentTopValue = currentTopValue * currentTopValue;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedSquareRoot(View view) {
        currentTopValue = Math.sqrt(currentTopValue);
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }

    public void clickedEquals(View view) {

        if (add == true) {
            currentTopValue = currentTopValue + nextTopValue;
        }

        else if (subtract == true) {
            currentTopValue = nextTopValue - currentTopValue;
        }

        else if (multiply == true) {
            currentTopValue = currentTopValue * nextTopValue;
        }

        else if (divide == true) {
            currentTopValue = nextTopValue / currentTopValue;
        }

        else if (decimal == true) {
            currentTopValue = nextTopValue + (currentTopValue * 0.1);
        }

        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
        add = false;
        subtract = false;
        multiply = false;
        divide = false;
        decimal = false;
    }


    public void clickedClear(View view) {
        currentTopValue = 0.0;
        EditText topText = (EditText) findViewById(R.id.topText);
        topText.setText("" + currentTopValue);
    }
}
