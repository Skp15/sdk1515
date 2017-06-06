package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Panel1Fragment extends Fragment {


    public Panel1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    final View rootView = inflater.inflate(R.layout.fragment_panel1, container, false);
              final MainActivity activity = (MainActivity) getActivity();

                 rootView.findViewById(R.id.btnOne).setOnClickListener(new View.OnClickListener() {
                  @Override
                 public void onClick(View v) {
                      activity.loadFragment(First1Fragment.getInstance(R.drawable.ic_man));
                     }
              });

             rootView.findViewById(R.id.btnTwo).setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     //activity.loadFragment(new SecondFragment());
                     activity.loadFragment(First1Fragment.getInstance(R.drawable.ic_team));
                              }
           });

            rootView.findViewById(R.id.btnThree).setOnClickListener(new View.OnClickListener() {
               @Override
                   public void onClick(View v) {
                   //  activity.loadFragment(new ThirdFragment());
                     activity.loadFragment(First1Fragment.getInstance(R.drawable.ic_woman));
                      }
              });

              return rootView;
     }


}
