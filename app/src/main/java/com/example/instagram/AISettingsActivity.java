package com.example.instagram;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AISettingsActivity extends AppCompatActivity {

    private EditText apiKeyEditText;
    private Button saveApiKeyButton;
    private Button payForAIAccessButton;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_settings);

        apiKeyEditText = findViewById(R.id.apiKeyEditText);
        saveApiKeyButton = findViewById(R.id.saveApiKeyButton);
        payForAIAccessButton = findViewById(R.id.payForAIAccessButton);
        sharedPreferences = getSharedPreferences("AISettings", MODE_PRIVATE);

        saveApiKeyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveApiKey();
            }
        });

        payForAIAccessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payForAIAccess();
            }
        });

        loadApiKey();
    }

    private void saveApiKey() {
        String apiKey = apiKeyEditText.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("API_KEY", apiKey);
        editor.apply();
        Toast.makeText(this, "API Key saved", Toast.LENGTH_SHORT).show();
    }

    private void loadApiKey() {
        String apiKey = sharedPreferences.getString("API_KEY", "");
        apiKeyEditText.setText(apiKey);
    }

    private void payForAIAccess() {
        // Implement payment logic here
        Toast.makeText(this, "Payment for AI access successful", Toast.LENGTH_SHORT).show();
    }
}
