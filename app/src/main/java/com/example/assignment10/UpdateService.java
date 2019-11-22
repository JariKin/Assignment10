package com.example.assignment10;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

import androidx.recyclerview.widget.RecyclerView;

public abstract class UpdateService extends Service {

    private ModelScreen modelScreen;

    @Override
    public void onCreate() {
        super.onCreate();

        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        BroadcastReceiver mReceiver = new ScreenReceiver();
        registerReceiver(mReceiver, filter);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        boolean screenOn = intent.getBooleanExtra("screen_state", false);
        if(!screenOn) {
            // täällä varmaan pitäisi päivittää timestamppia databaseen
        } else {
            // samoin täällä
        }
    }
}
