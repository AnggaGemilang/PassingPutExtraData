package com.example.passingputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton goMart, goRide, goFood, goBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goMart = (ImageButton) findViewById(R.id.menu1);
        goMart.setOnClickListener(this);
        goRide = (ImageButton) findViewById(R.id.menu2);
        goRide.setOnClickListener(this);
        goFood = (ImageButton) findViewById(R.id.menu3);
        goFood.setOnClickListener(this);
        goBox = (ImageButton) findViewById(R.id.menu4);
        goBox.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.menu1:
                Toast.makeText(this, "GO Mart Sedang Dalam Maintenance", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(this, "GO Ride Sedang Dalam Maintenance", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                Intent intent = new Intent(MainActivity.this, IsiData.class);
                startActivity(intent);
                break;
            case R.id.menu4:
                Toast.makeText(this, "GO Box Sedang Dalam Maintenance", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
