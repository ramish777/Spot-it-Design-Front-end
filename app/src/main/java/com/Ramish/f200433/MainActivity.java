package com.Ramish.f200433;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenForgotPassword(View view){
        Intent intent=new Intent(
                MainActivity.this,
                ForgotPasswordActivity.class);
        startActivity(intent);
    }
    public void OpenSignUp(View view){
        Intent intent=new Intent(
                MainActivity.this,
                RegistrationActivity.class);
        startActivity(intent);
    }
    public void dashboard_func(View view){
        Intent intent=new Intent(
                MainActivity.this,
                dashboard.class);
        startActivity(intent);
    }
}