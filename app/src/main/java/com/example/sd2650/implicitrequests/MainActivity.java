package com.example.sd2650.implicitrequests;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void phoneNumberHandler(View view) {
        //TODO: create intent object for dial
        //TODO: set the data for hte phone number object by parsing the phone id
        //TODO: start the dial activity and pass it the phone number object
    }


    public void emailHandler(View view) {
        //TODO: use sample from http://developer.android.com/guide/components/intents-common.html#Email
        // to create the email method

    }

    //TODO: create the method for the website handler
    //TODO: create a URI object with the web address
    //TODO: create a new Intent object
    //TODO: start the website activity
}
