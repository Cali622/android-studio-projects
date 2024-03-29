package com.edureka.training.intentactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initial Intent service.
        /*Intent intent = new Intent(this, MyIntentServices.class);
        startService(intent);*/
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void onclick(View view) {
        // Intents are used to switch from one activity to another and passes data from one activity to the next
        Intent i = new Intent(this, ActivityTwo.class);
        final EditText firstInput = (EditText) findViewById(R.id.firstInput);
        String usermessage = firstInput.getText().toString();
        i.putExtra("firstMessage", usermessage);

        startActivity(i);
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
}
