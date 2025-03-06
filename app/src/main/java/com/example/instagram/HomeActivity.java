package com.example.instagram;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.instagram.ThemeEngine;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private ThemeEngine themeEngine;
    private Button storybookButton;
    private Button aiSettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        themeEngine = new ThemeEngine(this);
        themeEngine.applyTheme();

        storybookButton = findViewById(R.id.storybookButton);
        storybookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StorybookActivity.class);
                startActivity(intent);
            }
        });

        aiSettingsButton = findViewById(R.id.aiSettingsButton);
        aiSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AISettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
