package com.example.instagram;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.instagram.ThemeEngine;
import android.content.Intent;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    private ThemeEngine themeEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        themeEngine = new ThemeEngine(this);
        themeEngine.applyTheme();
    }

    public void onWeb3LoginButtonClick(View view) {
        Intent intent = new Intent(LoginActivity.this, Web3LoginActivity.class);
        startActivity(intent);
    }
}
