package com.example.broadcastreceiver;

import static android.widget.Toast.LENGTH_LONG;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirPlaneMode extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction()!=null&&intent.getAction().equals(intent.ACTION_AIRPLANE_MODE_CHANGED))
        {
            boolean isAirplaneModeOn=intent.getBooleanExtra("states",false);
            String msg=isAirplaneModeOn ? "AirPlane Mode is NO": "AirPlane Mode is Not OFF";
            Toast.makeText(context,""+msg,LENGTH_LONG).show();
        }
    }
}
