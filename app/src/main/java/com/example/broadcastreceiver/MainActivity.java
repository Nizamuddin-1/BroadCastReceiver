package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dynamic Method for register
        IntentFilter intentFilter=new IntentFilter("android.intent.action.AIRPLANE_MODE");
        AirPlaneMode planeMode=new AirPlaneMode();
        registerReceiver(planeMode,intentFilter);
    }
}