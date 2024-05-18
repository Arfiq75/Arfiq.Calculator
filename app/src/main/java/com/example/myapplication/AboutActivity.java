package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;


public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Display developer information and version number
        TextView tvDeveloperInfo = findViewById(R.id.tvDeveloperInfo);
        tvDeveloperInfo.setText("Developed by: ARMI AFIQ NAJMI BIN AZMI");


        // Set click listener for the website link
        TextView tvWebsite = findViewById(R.id.tvWebsite);
        tvWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "https://example.com" with your actual website URL
                String url = "https://example.com";
                // Open the website in a browser
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });
    }
}
