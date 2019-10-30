package com.edureka.training.lists;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] fruits = {"Apple", "Orange", "Peach", "Mango"};

        ListAdapter myAdapter = new CustomAdapter(this, fruits);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       String fruit = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, fruit, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
