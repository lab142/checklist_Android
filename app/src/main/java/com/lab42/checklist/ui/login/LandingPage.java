package com.lab42.checklist.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lab42.checklist.R;
import com.lab42.checklist.ui.checklistOptions.ChecklistOptions;

public class LandingPage extends AppCompatActivity {

   private Button emailButton,googleButton,facebookButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        emailButton =  findViewById(R.id.btn_email_login);
        googleButton = findViewById(R.id.btn_google_login);
        facebookButton = findViewById(R.id.btn_facebook_login);

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startActivity(new Intent(LandingPage.this, LoginActivity.class));
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingPage.this, ChecklistOptions.class));
            }
        });

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingPage.this, ChecklistOptions.class));
            }
        });

    }
}