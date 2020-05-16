package io.esper.testbgservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by varun on 27-01-2018.
 */

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent launchActivity = new Intent(context, MainActivity.class);
        launchActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(launchActivity);
        Log.e("ANKIT", "launchMainActivity: done from boot");
    }
}
