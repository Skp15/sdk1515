package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.example.fragments.R.drawable.ic_man;


/**
 * A simple {@link Fragment} subclass.
 */
public class First1Fragment extends Fragment {


    public static final java.lang.String KEY_FRAG_NUM ="fragNum" ;


    public First1Fragment() {
        // Required empty public constructor
    }
    public static First1Fragment getInstance(int image) {

                Bundle bundle = new Bundle();
                bundle.putInt(KEY_FRAG_NUM, image);
                First1Fragment fragment = new First1Fragment();
                fragment.setArguments(bundle);
                return fragment;
          }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View rootView = inflater.inflate(R.layout.fragment_first1, container, false);
        Bundle bundle = getArguments();
        int img = bundle.getInt(KEY_FRAG_NUM);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView2);
        imageView.setImageResource(img);
        return rootView;

    }

}
