package com.mad.vaccinatelocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    EditText name,age,nic,gender,dob,tpno;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name=findViewById(R.id.name);
        age=findViewById(R.id.Age);
        nic=findViewById(R.id.NIC);
        gender=findViewById(R.id.gender);
        dob=findViewById(R.id.dob);
        tpno=findViewById(R.id.telephoneno);
        submit=findViewById(R.id.cyp);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String person_name=name.getText().toString().trim();
                String person_age=age.getText().toString().trim();
                String person_nic =nic.getText().toString().trim();
                String person_gender=gender.getText().toString().trim();
                String person_dob=dob.getText().toString().trim();
                String person_tpno=tpno.getText().toString().trim();

                if(person_name.equals("") && person_age.equals("") && person_dob.equals("") && person_nic.equals("") && person_gender.equals("") && person_tpno.equals("") )
                {
                    Toast.makeText(DetailsActivity.this, "every field must be filled", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
//apple