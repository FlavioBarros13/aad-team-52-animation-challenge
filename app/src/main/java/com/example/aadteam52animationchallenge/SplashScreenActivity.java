package com.example.aadteam52animationchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aadteam52animationchallenge.Utilities.QuickHelp;


import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends AppCompatActivity {

    @BindView(R.id.SplashScreenLogIv)
    ImageView SplashScreenLogIv;

    @BindView(R.id.SplashScreenLogTv)
    TextView SplashScreenLogTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // Remove TitleBar for better UI/UX experience and splash Screen performance
        setContentView(R.layout.splash_screen_main);
        ButterKnife.bind(this);// ButterNife Library for Binding Views With java
        QuickHelp.EnterActivity(this);// Enter Activity with Slide animation
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); // Set Window/Screen to full sized


        QuickHelp.GotoActivityWithTimer(this, Login.class); //Go to SignIn activity after timer done!
        QuickHelp.startLogoAnimation(this,SplashScreenLogTv,SplashScreenLogIv);//Start Logo Animation


    }

}
