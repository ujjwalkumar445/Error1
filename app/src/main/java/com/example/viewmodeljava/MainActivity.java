package com.example.viewmodeljava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {

    private int myRandomColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final viewModel viewModel1 = ViewModelProviders.of(this).get(viewModel.class);
        viewModel1.GetColor().observe(this,new Observer(){
            @Override
            public void onChanged(Object o) {
                o = findViewById(R.id.layout_view).setBackgroundColor(Color.parseColor(Integer.parseInt(o)));

            }
        });

        findViewById(R.id.change_color).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Random random = new Random();
                myRandomColor =(random.nextInt(100000-999999)+1);
                viewModel1.setColor(myRandomColor);

            }
        });
    }
}
