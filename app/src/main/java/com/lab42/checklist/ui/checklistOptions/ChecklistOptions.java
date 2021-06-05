package com.lab42.checklist.ui.checklistOptions;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.lab42.checklist.R;
import com.lab42.checklist.ui.cheklists.RV_TrailerChecklist;
import com.lab42.checklist.ui.cheklists.TravelTrailerChecklist;

public class ChecklistOptions extends AppCompatActivity {

    private AlertDialog.Builder builder;
    LinearLayout travelTrailer;
    LinearLayout rvTrailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist_options);

        travelTrailer =  findViewById(R.id.ll_trailer_option);
        rvTrailer = findViewById(R.id.ll_rv_option);
        builder = new AlertDialog.Builder(this);

        travelTrailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travelTrailerOption();
            }
        });

        rvTrailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvTrailerOption();
            }
        });
    }

    private void travelTrailerOption(){

                builder.setMessage("Disclaimer: Checklists are a starting point for you to build your own list. This is not an inclusive or exclusive list")
                        .setTitle("Travel Trailer")
                        .setIcon(R.drawable.default_user_img)
                        .setCancelable(true)
                        .setPositiveButton("Agree", (dialog, which) -> {
                        startActivity(new Intent(this, TravelTrailerChecklist.class));
                        });
                builder.create().show();
    }

    private void rvTrailerOption(){

        builder.setMessage("Disclaimer: Checklists are a starting point for you to build your own list. This is not an inclusive or exclusive list")
                .setTitle("RV Trailer")
                .setIcon(R.drawable.default_user_img)
                .setCancelable(true)
                .setPositiveButton("Agree", (dialog, which) -> {
                startActivity(new Intent(this, RV_TrailerChecklist.class));
                });
        builder.create().show();
    }
}