package com.nillsimon.firemyfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    Button btn1, btn2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void change(View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.btn1:
                fragment = new FragmentOne();
                break;
            case R.id.btn2:
                fragment = new FragmentTwo();
                break;

        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_place, fragment);
        ft.commit();


    }

    public void changeText(View view) {

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