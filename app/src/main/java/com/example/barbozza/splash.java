package com.example.barbozza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.barbozza.Buyers.MainActivity;

public class splash extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;

    Animation topAnim, botomAnim;
    ImageView img;
    TextView logo, slogan;

   // Thread th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
//        th = new Thread() {
//            public void run() {
//                try {
//                    sleep(2800);
//                    Intent intent = new Intent(splash.this, MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//        th.start();


        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        img = findViewById(R.id.img1);
        logo= findViewById(R.id.tv1);
        slogan = findViewById(R.id.tv2);

        img.setAnimation(topAnim);
        logo.setAnimation(botomAnim);
        slogan.setAnimation(botomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}
