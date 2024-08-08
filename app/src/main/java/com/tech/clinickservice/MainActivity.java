package com.tech.clinickservice;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText edtMobile, edtPassword;
    AppCompatButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        edtMobile = findViewById(R.id.edt_mobile);

        edtPassword = findViewById(R.id.edt_password);

        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(isValidation()){
                    String mobile = edtMobile.getText().toString();
                    String password = edtPassword.getText().toString();
                    Log.d("7407402097", " true " + mobile + " " + password);


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


        return true;
    }

}