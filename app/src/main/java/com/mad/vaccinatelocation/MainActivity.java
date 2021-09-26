package com.mad.vaccinatelocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    DatabaseHelper myDb;
    Button cp1,ep1,np1,ncp1,nwp1,swp1,sp1,uvp1,wp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        myDb=new DatabaseHelper(this);

        cp1=findViewById(R.id.cp);
        ep1=findViewById(R.id.ep);
        np1=findViewById(R.id.nop);
        ncp1=findViewById(R.id.ncp);
        nwp1=findViewById(R.id.nwp);
        swp1=findViewById(R.id.sbp);
        sp1=findViewById(R.id.sp);
        uvp1=findViewById(R.id.uvp);
        wp1=findViewById(R.id.wp);

        cp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,CentralProvinceOption.class);
                startActivity(in);
            }
        });
    }
}