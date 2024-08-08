package com.tech.clinickservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalclatorActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_text1, edt_text2;
    private Button button1, button2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calclator);
        edt_text1= (EditText)    findViewById(R.id.edt_text1);
        edt_text2= (EditText)    findViewById(R.id.edt_text2);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        result= (TextView) findViewById(R.id.result);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        edt_text1.setText(GlobalVariable.userId);
        edt_text2.setText(GlobalVariable.password);
   /*   *//*  Intent intent=getIntent();
      = intent.getStringExtra("first");*//*
        String getValue=  getIntent().getStringExtra("first");
       edt_text1.setText(getValue);*/


    }

    @Override
    public void onClick(View v) {
        String Number1 = edt_text1.getText().toString();
        String Number2 = edt_text2.getText().toString();

        double num1 = Double.parseDouble(Number1);
        double num2 = Double.parseDouble(Number2);

        if (v.getId() == R.id.button1) {
            double sum= num1+num2;
            result.setText("Result:"+sum);


        }


        if (v.getId() == R.id.button2) {
            double sub= num1-num2;
            result.setText("Result:"+sub);


        }


        }
    }
