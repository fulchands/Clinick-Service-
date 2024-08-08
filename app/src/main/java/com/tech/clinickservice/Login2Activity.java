package com.tech.clinickservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login2Activity extends AppCompatActivity {
    private TextView text1;
    private EditText edt_userId,edt_password;
    private AppCompatButton btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login2);
        text1 =this.findViewById(R.id.text_top);
        edt_userId =this.findViewById(R.id.edt_name);
        edt_password =this.findViewById(R.id.edt_password);
        btn1 =this.findViewById(R.id.btn_login);
        btn2 =this.findViewById(R.id.btn_cancel);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidate()){
                    String s1=edt_userId.getText().toString();
                    String s2=edt_password.getText().toString();
                    GlobalVariable.userId=s1;
                    GlobalVariable.password=s2;
                    Intent intent=new Intent(Login2Activity.this, CalclatorActivity.class);
                    startActivity(intent);
                    Toast.makeText(Login2Activity.this, s1+s2, Toast.LENGTH_LONG).show();
                }
            }



        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finishAffinity();
            }



        });


    }
    private boolean isValidate() {
        if (edt_userId.getText().toString().isEmpty()){
            edt_userId.setError("required");
            edt_userId.requestFocus();
            return false;
        } else {
            edt_userId.setError(null);
        } if (edt_password.getText().toString().isEmpty()){
            edt_password.setError("required");
            edt_password.requestFocus();
            return false;
        } else {
            edt_password.setError(null);
        }
        return true;

    }





}

