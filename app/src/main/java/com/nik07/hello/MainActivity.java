package com.nik07.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbtn = (Button) findViewById(R.id.rollbtn);
        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                
                TextView result = (TextView) findViewById(R.id.result);

                double n1 = Double.parseDouble( num1.getText().toString());
                double n2 = Double.parseDouble( num2.getText().toString());
                double r1 = n1+ n2;
                result.setText(r1 + "");

            }
        });

        Button mulbtn = (Button) findViewById(R.id.mulbtn);
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.result);

                double n1 = Double.parseDouble( num1.getText().toString());
                double n2 = Double.parseDouble( num2.getText().toString());
                double r1 = n1*n2;
                result.setText(r1 + "");

            }
        });

        Button subbtn = (Button) findViewById(R.id.subbtn);
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.result);

                double n1 = Double.parseDouble( num1.getText().toString());
                double n2 = Double.parseDouble( num2.getText().toString());
                double r1= n1- n2;
                result.setText(r1 + "");

            }
        });

        Button divbtn = (Button) findViewById(R.id.divbtn );
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.result);

                double n1 = Double.parseDouble( num1.getText().toString());
                double n2 = Double.parseDouble( num2.getText().toString());
                double r1 = n1/n2;
                result.setText(r1 + "");

            }
        });


        }
    }


