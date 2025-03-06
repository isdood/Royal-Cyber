package com.example.instagram;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.instagram.ThemeEngine;

public class HomeActivity extends AppCompatActivity {
    private ThemeEngine themeEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        themeEngine = new ThemeEngine(this);
        themeEngine.applyTheme();
    }
}
