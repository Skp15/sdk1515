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
        loadFragment(First1Fragment.getInstance(R.mipmap.ic_launcher_round));
    }

    public void loadFragment(Fragment frag) {
          FragmentManager manager = getSupportFragmentManager();
          FragmentTransaction txn = manager.beginTransaction();
          txn.setCustomAnimations(R.anim.rotate, R.anim.mixed);
        //txn.replace(R.id.fragFirst,frag);
          txn.replace(R.id.frameSecond, frag);
          txn.commit();
           }

}
