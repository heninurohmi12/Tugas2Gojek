package com.heninurohmi.tugas2gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btngosend, btngoride, btngofood, btngomart, btnhistori, btnorder, btnwallet, btnsetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btngosend = findViewById(R.id.gosend);
        btngoride = findViewById(R.id.goride);
        btngofood = findViewById(R.id.gofood);
        btngomart = findViewById(R.id.gomart);

        btngosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gosend.class);
                startActivity(i);
            }
        });

        btngoride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, goride.class);
                startActivity(i);
            }
        });
        btngomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gomart.class);
                startActivity(i);
            }
        });
        btngofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gofood.class);
            }
        });

        btnhistori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini adalah histori", Toast.LENGTH_SHORT).show();
            }
        });
        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini adalah order", Toast.LENGTH_SHORT).show();
            }
        });
        btnwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini adalah wallet", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini adalah setting", Toast.LENGTH_SHORT).show();
            }
        });

    }

}