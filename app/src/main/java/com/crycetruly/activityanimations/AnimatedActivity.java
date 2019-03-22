package com.crycetruly.activityanimations;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnimatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_animated);
        getSupportActionBar().setTitle("TO ACTIVITY");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(getBaseContext(),MainActivity.class);
               startActivity(mainIntent);
               finish();
            }
        }, 3000);
    }



    public void finish() {
        super.finish();

        overridePendingTransition(R.anim.activity_open_scale,R.anim.activity_close_translate);
    }



}