package com.tech.clinickservice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    AppCompatEditText edtMobile,edtPassword,edtComfirmpassword;
    AppCompatButton edtSubmit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

         edtMobile = findViewById(R.id.edt_mobile);

         edtPassword = findViewById(R.id.edt_password);

        edtComfirmpassword = findViewById(R.id.edt_comfirmpassword);

        edtSubmit = findViewById(R.id.edt_submit);
        edtSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isValidation()){
                    String mobile = edtMobile.getText().toString().trim();
                    String password = edtPassword.getText().toString().trim();
                    String confirm = edtComfirmpassword.getText().toString().trim();
                    if (password.equals(confirm)){
                       Intent i=new Intent(LoginActivity.this, MainActivity.class);
                       startActivity(i);
                    }else {
                        Toast.makeText(LoginActivity.this, "Do not match your password and confirm password!", Toast.LENGTH_SHORT).show();

                        Log.d("12032001", " true "+password + " " + confirm);
                    }

                    Log.d("12032001", password + " " + confirm);
                }

            }



        });









    }




    private boolean isValidation(){
        if(edtMobile.getText().toString().trim().isEmpty()){
            edtMobile.setError("Required");
            return false;
        }else {
            edtMobile.setError(null);
        }
        if(edtPassword.getText().toString().trim().isEmpty()){
            edtPassword.setError("Required");
            return false;
        }else {
            edtPassword.setError(null);
        }
        if(edtComfirmpassword.getText().toString().trim().isEmpty()){
            edtComfirmpassword.setError("Required");
            return false;
        }else {
            edtComfirmpassword.setError(null);
        }



        return true;
    }





}