package com.example.greenguardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuardianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardian);

        Button testbtn = findViewById(R.id.testbtn);

        testbtn.setOnClickListener(v -> {
            System.out.println("hello");
            System.out.println("hello2");

            Intent myIntent = new Intent(GuardianActivity.this, MainActivity2.class);
            GuardianActivity.this.startActivity(myIntent);
        });


    }
}