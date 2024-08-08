package com.tech.clinickservice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;


public class AccountActivity extends AppCompatActivity {

    AppCompatEditText edt_password,edt_email,edt_name;
    AppCompatImageView img_show_pass;

    AppCompatButton  btn_submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        edt_password=findViewById(R.id.edt_password);
        img_show_pass=findViewById(R.id.img_show_pass);
        btn_submit=findViewById(R.id.btn_submit);
        edt_email=findViewById(R.id.edt_email);
        edt_name=findViewById(R.id.edt_name);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidation()){
                    Intent intent=new Intent(AccountActivity.this,HomeActivity.class);
                    startActivity(intent);

                }

            }
        });



        img_show_pass.setOnClickListener(new View.OnClickListener() {
            boolean flag = false;
            @Override
            public void onClick(View v) {
                if (flag == false) {
                    edt_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    img_show_pass.setImageResource(R.drawable.resize_icon_hide);
                    flag = true;

                } else {
                    edt_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    img_show_pass.setImageResource(R.drawable.resize_icon_view);
                    flag = false;
                }

            }
        });

    }














    private boolean isValidation(){
        if(edt_name.getText().toString().trim().isEmpty()){
            edt_name.setError("Required");
            return false;
        }else {
            edt_name.setError(null);
        }
        if(edt_email.getText().toString().trim().isEmpty()){
            edt_email.setError("Required");
            return false;
        }else {
            edt_email.setError(null);
        }
        if(edt_password.getText().toString().trim().isEmpty()){
            edt_password.setError("Required");
            return false;
        }else {
            edt_password.setError(null);
        }



        return true;
    }




}