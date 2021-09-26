package com.mad.vaccinatelocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CentralProvinceOption extends AppCompatActivity {

    Button gampola,girls,herare,mpilo,zahira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_province_option);
        gampola=findViewById(R.id.gam);
        girls=findViewById(R.id.girl);
        herare=findViewById(R.id.harare);
        mpilo=findViewById(R.id.mpilo);
        zahira=findViewById(R.id.zahira);

        gampola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(CentralProvinceOption.this,DetailsActivity.class);
                startActivity(in);
            }
        });
    }
}