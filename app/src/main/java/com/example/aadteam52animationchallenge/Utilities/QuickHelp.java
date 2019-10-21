package com.example.aadteam52animationchallenge.Utilities;

import android.app.Activity;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aadteam52animationchallenge.R;

public abstract class QuickHelp extends AppCompatActivity
{

    QuickHelp(){}

    public static void EnterActivity(Activity activity)
    {

        activity.overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);

    }

    public static void GotoActivityWithTimer(final Activity activity, Class<?>OtherClass)
    {
        final Intent StartViaAmgolana =new Intent(activity, OtherClass);


        Thread timer =new Thread() {

            public void run ()
            {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e)

                {
                    e.printStackTrace();

                }
                finally {

                    activity.startActivity(StartViaAmgolana);
                    activity.finish();

                }

            }

        };

        timer.start();


    }

    public static void startLogoAnimation(Activity activity, TextView tv, ImageView iv)
    {

        Animation Bounce = AnimationUtils.loadAnimation(activity,R.anim.bounce);
        iv.startAnimation(Bounce);
        tv.startAnimation(Bounce);

    }
}
