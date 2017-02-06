package com.example.csaper6.listviewandsorting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        if(fm.findFragmentByTag("SuperheroFragment")== null)
            fm.beginTransaction()
                    .add(R.id.hero_list_container, new SuperheroFragment(), "SuperheroFragment")
                    .commit();
    }
}