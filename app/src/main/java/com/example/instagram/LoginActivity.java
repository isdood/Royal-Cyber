package com.example.instagram;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.instagram.ThemeEngine;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private ThemeEngine themeEngine;
    private Button web3LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        themeEngine = new ThemeEngine(this);
        themeEngine.applyTheme();

        web3LoginButton = findViewById(R.id.web3_login_button);
        web3LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onWeb3LoginButtonClick(v);
            }
        });
    }

    public void onWeb3LoginButtonClick(View view) {
        Intent intent = new Intent(LoginActivity.this, Web3LoginActivity.class);
        startActivity(intent);
    }
}
