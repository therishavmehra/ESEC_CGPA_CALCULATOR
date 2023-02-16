package com.rishav.eseccgpagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eseccgpagenerator.R;

public class startpage extends AppCompatActivity {
    Button gpacalc,cgpacalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
    gpacalc=findViewById(R.id.gpacalc);
    gpacalc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(startpage.this,MainActivity.class));
        }
    });

    cgpacalc=findViewById(R.id.cgpacalc);
    cgpacalc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(startpage.this,cgpacalc.class));
        }
    });

    }
}