package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;


public class AboutActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Display developer information and version number
        TextView tvDeveloperInfo = findViewById(R.id.tvDeveloperInfo);
        tvDeveloperInfo.setText("Developed by: ARMI AFIQ NAJMI BIN AZMI");




        Button btnBackToMain = findViewById(R.id.btnBackToMain);
        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: Finish the SettingsActivity if you don't want to keep it in the back stack
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selected = item.getItemId();

        if (selected == R.id.menuAbout) {
            Intent intent = new Intent(AboutActivity.this, AboutActivity.class);
            startActivity(intent);
        } else if (selected == R.id.menuGuide) {
            Intent intent = new Intent(AboutActivity.this, GuideActivity.class);
            startActivity(intent);
        } else if (selected == R.id.menuSettings) {
            Intent intent = new Intent(AboutActivity.this, SettingsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);


    }
}
