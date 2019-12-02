package com.its.blockdev.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.its.blockdev.R;
import com.its.blockdev.fragment.FirstFragment;
import com.its.blockdev.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnFragment1;
    private Button btnFragment2;
    private LinearLayout llMain;

    private FirstFragment firstFragment = new FirstFragment();
    private SecondFragment secondFragment = new SecondFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnFragment1 = findViewById(R.id.btn_fragment_1);
        btnFragment2 = findViewById(R.id.btn_fragment_2);
        llMain = findViewById(R.id.ll_main_layout);


        btnFragment1.setOnClickListener(this);
        btnFragment2.setOnClickListener(this);

        setFragment(firstFragment);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == btnFragment1.getId()){
            setFragment(firstFragment);
        }else if( id == btnFragment2.getId()){
            setFragment(secondFragment);
        }
    }

    private void setFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .replace(R.id.ll_main_layout,fragment)
                .commit();

    }

}
