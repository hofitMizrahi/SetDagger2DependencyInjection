package com.example.user.dagger2di;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.dagger2di.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponents().inject(this);

        //view treatment


    }
}
