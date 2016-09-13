package com.recursion.thilina.sleepypassenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void startapp(View view) {
        Intent ads = new Intent(this, admoblayout.class);
        startActivity(ads);
    }
}
