package com.lab42.checklist.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lab42.checklist.R;

public class LandingPage extends AppCompatActivity {

   private Button emailButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        emailButton =  findViewById(R.id.btn_email_login);

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startActivity(new Intent(LandingPage.this, LoginActivity.class));
            }
        });

    }
}