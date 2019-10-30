package com.edureka.training.myworkouts;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String> getWorkouts (String workouttypes){
      List <String> workout = new ArrayList<String>();

      if(workouttypes.equals("Chest")) {
          workout.add("Bench Press");
          workout.add("Cable Flys");
      }
      else if (workouttypes.equals("Triceps")) {
          workout.add("Tricep Ext");
          workout.add("Tricep Push Downs");
      }
      else if (workouttypes.equals("Shoulder")) {
          workout.add("Shoulder press");
      }
      else if (workouttypes.equals(("Biceps"))) {
          workout.add("Bicep Curls");
      }
      return workout;
    }
}

