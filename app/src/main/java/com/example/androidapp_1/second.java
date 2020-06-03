package com.example.androidapp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class second extends AppCompatActivity {

    String tag = "Activity_State";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(tag,"Created 2");
    }
    public  void onStart(){
        super.onStart();
        Log.d(tag,"Started 2");
    }

    public void onResume(){
        super.onResume();
        Log.d(tag,"Resumed 2");
    }

    public void onRestart(){
        super.onRestart();
        Log.d(tag,"Restarted 2");
    }

    public void onPause(){
        super.onPause();
        Log.d(tag,"Paused 2");
    }

    public void onStop(){
        super.onStop();
        Log.d(tag,"Stopped 2");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(tag,"Destroyed 2");
    }
}