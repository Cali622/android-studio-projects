package com.edureka.training.myworkouts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {

    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickFindWorkout (View view) {
        TextView workouts = (TextView) findViewById(R.id.workout);
        Spinner workoutType = (Spinner) findViewById(R.id.workouttype);
        String workout = String.valueOf(workoutType.getSelectedItem());
       // workouts.setText(workout);
        List<String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutsFormatted = new StringBuilder();
        for (String work : workoutList) {
            workoutsFormatted.append(work).append('\n');
        }
        workouts.setText(workoutsFormatted);
    }
}
