package com.edureka.training.intentactivities;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentServices extends IntentService {

    private static final String TAG = "com.edureka.training.intentactivities";

    public MyIntentServices() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "The service has started");

    }
}