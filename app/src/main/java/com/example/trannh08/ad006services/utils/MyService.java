package com.example.trannh08.ad006services.utils;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by trannh08 on 8/25/2016.
 */
public class MyService extends Service {
    //@Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // let the service keep running until it is stopped
        Toast.makeText(MyService.this, "Service started", Toast.LENGTH_SHORT).show();
        return START_STICKY;
        //return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Service destroyed", Toast.LENGTH_SHORT).show();
    }
}
