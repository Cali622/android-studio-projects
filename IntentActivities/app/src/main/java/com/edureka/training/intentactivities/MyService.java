package com.edureka.training.intentactivities;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "com.edureka.training.intentactivities";

    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStart called");
        // Creates our own Thread for the myService class. Intent Service class automatically creates this for you.
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i ++ ) {
                    long futuretime = System.currentTimeMillis() + 5000;
                    while (System.currentTimeMillis() < futuretime) {
                        synchronized (this){
                            try {
                                wait(futuretime - System.currentTimeMillis());
                                Log.i (TAG, "Service is running");
                            } catch (Exception e) {}
                        }
                    }
                }
            }
        };

        Thread myThread = new Thread(r);
        myThread.start();
        // START_STICKY Restarts service if the service crashes in some cases!
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy called");

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
