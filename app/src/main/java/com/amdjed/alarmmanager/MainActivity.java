package com.amdjed.alarmmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        // Explicit Intent
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        //you may not expect to get any data back—you're just activating that Activity (startActivity)

    }
}
