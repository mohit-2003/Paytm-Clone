package com.paytm.clone.paytmclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paytm.clone.paytmclone.BottomNavigationBar.MainActivity;

public class LoadingActivity extends AppCompatActivity {

    //Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        /* timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }); */
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}