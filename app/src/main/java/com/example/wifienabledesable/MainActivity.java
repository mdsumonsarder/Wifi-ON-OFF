package com.example.wifienabledesable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }

    public void enableWifi(View view) {

        wifiManager.setWifiEnabled(true);

    }

    public void disableWifi(View view) {

        wifiManager.setWifiEnabled(false);

    }
}
