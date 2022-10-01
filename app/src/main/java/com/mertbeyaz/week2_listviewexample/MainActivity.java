package com.mertbeyaz.week2_listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ArrayAdapter;
    Button CostumAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter = findViewById(R.id.ArrayAdapter);
        ArrayAdapter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });

        CostumAdapter = findViewById(R.id.CostumAdapter);
        CostumAdapter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CostumAdapterActivity.class);
                startActivity(intent);
            }
        });

    }
}