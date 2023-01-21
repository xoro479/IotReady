package com.souradip.iotready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     @Override

     public void onConfigurationChanged (Configuration newConfig) {

        // TODO Auto-generated method stub
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

            Toast.makeText(getApplicationContext(), "Portrait mode", Toast.LENGTH_SHORT).show();

        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            Toast.makeText(getApplicationContext(), "Landscape mode", Toast.LENGTH_SHORT).show();
        }
    }