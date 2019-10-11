package com.moringaschool.fragmentation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        MoodDialogFragment moodDialogFragment = new MoodDialogFragment ();
        moodDialogFragment.show(fm, "Sample Fragment");
    }
}
