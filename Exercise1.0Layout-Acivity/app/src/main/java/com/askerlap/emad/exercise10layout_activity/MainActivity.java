package com.askerlap.emad.exercise10layout_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //TODO (7) : Create a reference to your UI Components

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO (8): Link the reference to java ( use findViewByID method)

        //TODO (11): handel the OnClick listener for the Button
        //TODO (12: within the interface listener call passData if the text is not null or empty

    }



    //TODO (9): Create a method called passData to start a new Activity
    //TODO (10): within the method
             // a- TODO (10.a): create a variable string to hold the text from the editText
            //  b- TODO (10.b): pass the string to the next activity (use putExtra method )

}
