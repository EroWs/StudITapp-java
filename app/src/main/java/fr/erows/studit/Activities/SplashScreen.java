package fr.erows.studit.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import fr.erows.studit.R;

import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(),WelcomActivity.class);
                startActivity(intent);
                finish();

            }
        };

        //handler post delayed
        new Handler().postDelayed(runnable, 3000);

    }
}
