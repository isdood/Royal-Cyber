package com.example.instagram;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.instagram.ThemeEngine;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private ThemeEngine themeEngine;
    private Button storybookButton;
    private Button aiSettingsButton;
    private Button schedulePostButton; // New button for scheduling posts
    private PostScheduler postScheduler; // New PostScheduler instance

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

        schedulePostButton = findViewById(R.id.schedulePostButton);
        schedulePostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schedulePost();
            }
        });

        postScheduler = new PostScheduler(); // Initialize PostScheduler
    }

    private void schedulePost() {
        // Placeholder implementation for scheduling a post
        Post post = new Post("imageUrl", "caption", "location");
        long scheduledTime = System.currentTimeMillis() + 60000; // Schedule for 1 minute later
        postScheduler.schedulePost(post, scheduledTime);
        Toast.makeText(this, "Post scheduled", Toast.LENGTH_SHORT).show();
    }
}
