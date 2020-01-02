package com.nillsimon.firemyfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentOne extends Fragment {

    Button btn1, btn2;
    TextView textView;
    Fragment fragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        return v;
    }


    }

        /*
        textView = v.findViewById(R.id.textView);

        Button btn1 = v.findViewById(R.id.btn1);
        Button btn2 = v.findViewById(R.id.btn2);
         //return inflater.inflate(R.layout.fragment_fragment_one, container, false);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        return v;

    }


    @Override
    public void onClick(View view) {
        changeText(view);
    }

    private void changeText(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                textView.setText("Hello");
                break;
            case R.id.btn2:
                textView.setText("No Hello");
                break;
        }
    }
}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.testclassfragment, container, false);
        ImageView imageView = (ImageView)v.findViewById(R.id.my_image);
        return v;
}
*/