package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {
    Button btnMvToSecond;
    EditText userText;
    String st;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        userText= findViewById(R.id.edUser);
        btnMvToSecond = findViewById(R.id.btn);

        btnMvToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                st=userText.getText().toString();
                intent.putExtra("Value",st);
                startActivity(intent);


            }
        }); {


            }
        }
    }
