package com.alc.phaseonechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(this);
        Button btnProfile = findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAbout:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                break;
            case R.id.btnProfile:
                intent = new Intent(MainActivity.this, MyProfileActivity.class);
                break;
        }
        startActivity(intent);
    }
}
