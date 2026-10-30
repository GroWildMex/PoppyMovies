package com.poppymovies.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean isFireTv = "firetv".equals(BuildConfig.FLAVOR);
        setContentView(isFireTv ? R.layout.activity_welcome_firetv : R.layout.activity_welcome);

        Button btn = findViewById(R.id.btnContinue);
        btn.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
        btn.requestFocus();
    }
}
