package com.example.hotelapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tvUser;
    String st;
    Button conroy;
    Button opal;
    Button ritz;
    Button royal;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);


        tvUser = findViewById(R.id.tvUser);

        ritz = findViewById(R.id.btnRitz);
        opal = findViewById(R.id.btnOpal);
        conroy = findViewById(R.id.btnConroy);
        royal = findViewById(R.id.btnRoyal);

        ritz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ritz = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ritzcarlton.com/"));
                startActivity(ritz);
            }
        });

        opal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opal = new Intent("android.intent.action.VIEW", Uri.parse("https://www.booking.com/hotel/jo/opal-amman.ar.html?aid=1958168&label=gog235jc-1DCAsodEIKb3BhbC1hbW1hbkgJWANodIgBAZgBCbgBF8gBDNgBA-gBAfgBBogCAagCA7gCrZCfmAbAAgHSAiQ1NTA4YzYyNy03ZGFkLTQyOTItOTA3MS0wYjJmMGNkMzYyYTTYAgTgAgE&sid=65216c3e3602adf1ac3ecc9f319bdb05&dist=0&group_adults=2&keep_landing=1&no_rooms=1&sb_price_type=total&type=total&"));
                startActivity(opal);
            }
        });

        conroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conroy = new Intent("android.intent.action.VIEW", Uri.parse("https://theconroyboutiquehotel.com/?page_id=12"));
                startActivity(conroy);
            }
        });

        royal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent royal = new Intent("android.intent.action.VIEW", Uri.parse("https://be.synxis.com/?__utma=81097098.702721229.1661454320.1661454320.1661454320.1&__utmb=81097098.1.10.1661454320&__utmc=81097098&__utmk=218984016&__utmv=-&__utmx=-&__utmz=81097098.1661454320.1.1.utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided)&adult=1&arrive=2022-08-25&chain=25474&child=0&currency=JOD&depart=2022-08-26&hotel=8610&level=hotel&locale=en-US&rooms=1"));
                startActivity(royal);
            }
        });


        st = getIntent().getExtras().getString("Value");
        tvUser.setText(st);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.logOut) {
            Intent i = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(i);
            return false;
        }
        if (id == R.id.help){
            Intent t = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(t);
            return false;
        }
        return super.onOptionsItemSelected(item);



    }



}








