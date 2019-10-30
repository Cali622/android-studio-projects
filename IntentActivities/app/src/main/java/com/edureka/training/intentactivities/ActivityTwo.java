package com.edureka.training.intentactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle firstData = getIntent().getExtras();

        if (firstData == null) {
            return;
        }

        String firstMessage = firstData.getString("firstMessage");
        final TextView secondtext = (TextView) findViewById(R.id.SecondText);
        secondtext.setText(firstMessage);
    }

}
