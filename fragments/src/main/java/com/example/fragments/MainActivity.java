package com.example.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(First1Fragment.getInstance(R.drawable.ic_man));
    }

    public void loadFragment(Fragment frag) {

        String backstack=frag.getClass().getName();
          FragmentManager manager = getSupportFragmentManager();
          FragmentTransaction txn = manager.beginTransaction();
          txn.setCustomAnimations(R.anim.rotate, R.anim.mixed);
          txn.replace(R.id.frameSecond, frag);
          txn.addToBackStack(backstack);
          txn.commit();
           }

}
