package com.tech.clinickservice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignActivity extends AppCompatActivity {
   private AppCompatButton btn_login;
    private EditText edt_userId,edt_password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        btn_login=this.findViewById(R.id.btn_login);
        edt_userId=this.findViewById(R.id.edt_text1);
        edt_password=this.findViewById(R.id.edt_text2);




        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidate()){
                    String s1=edt_userId.getText().toString();
                    String s2=edt_password.getText().toString();


                   Intent nextPage=new Intent(SignActivity.this,CalclatorActivity.class);
                 //  nextPage.putExtra("first",s1);
                 //  nextPage.putExtra("second",s2);

                   startActivity(nextPage);

                }

            }


        });


    }


    private boolean isValidate() {
       if (edt_userId.getText().toString().isEmpty()){
           edt_userId.setError("required");
           edt_userId.requestFocus();
           return false;

       }else {
           edt_userId.setError(null);

       }
        if (edt_password.getText().toString().isEmpty()){
            edt_password.setError("required");
            edt_password.requestFocus();
            return false;
        }else {
            edt_password.setError(null);


        }

        return true;
    }
}