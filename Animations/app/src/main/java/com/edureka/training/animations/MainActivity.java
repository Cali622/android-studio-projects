package com.edureka.training.animations;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    ViewGroup myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout = (ViewGroup) findViewById(R.id.myLayout);
        myLayout.setOnTouchListener {
            new ConstraintLayout.OnTouchListener() {
                public boolean onTouch (View v, MotionEvent event) {
                    moveButton();
                    return true;
                }
            };
        }
    }

    public void moveButton() {
        TransitionManager.beginDelayedTransition(myLayout);
        View myButton = findViewById(R.id.myButton);
        ConstraintLayout.LayoutParams positionRules = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(ConstraintLayout.ALIGN_PARENT_BOTTOM, ConstraintLayout.TRUE);
        myButton.setLayoutParams(positionRules);

        // Code for expanding the button
        ViewGroup.LayoutParams sizeRules = myButton.getLayoutParams();
        sizeRules.width=450;
        sizeRules.height=300;
        myButton.setLayoutParams(sizeRules);
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
