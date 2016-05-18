package com.fs_studio.www.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    /** Called when the user touches the button1 **/
    public void displayToast1(View view){

        Context context = getApplicationContext();
        CharSequence text = "This button will launch Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /** Called when the user touches the button2 **/
    public void displayToast2(View view){

        Context context = getApplicationContext();
        CharSequence text = "This button will launch Stock Hawk app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /** Called when the user touches the button3 **/
    public void displayToast3(View view){

        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /** Called when the user touches the button4 **/
    public void displayToast4(View view){

        Context context = getApplicationContext();
        CharSequence text = "This button will launch Make Your APP Material app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /** Called when the user touches the button5 **/
    public void displayToast5(View view){

        Context context = getApplicationContext();
        CharSequence text = "This button will launch Go Ubiquitous app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /** Called when the user touches the button6 **/
    public void displayToast6(View view){

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

}

