package com.its.blockdev.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.its.blockdev.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogIn;

    private EditText edtUsername;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogIn    = findViewById(R.id.li_btn_log_in);
        edtUsername = findViewById(R.id.li_edt_username);
        edtPassword = findViewById(R.id.li_edt_password);


        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();

                if(username.equals("dara") && password.equals("123")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent); }
                else{
                    Toast.makeText(LoginActivity.this,"Username and Password Incorrect!",Toast.LENGTH_LONG).show();
                }


            }
        });

    }

}
