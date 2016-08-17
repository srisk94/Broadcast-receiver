package com.example.srima.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

/**
 * Created by srima on 08-08-2016.
 */
public class BatteryLevelReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        float batteryPct = level / (float)scale;
        //return  batteryPct;
    }
}
