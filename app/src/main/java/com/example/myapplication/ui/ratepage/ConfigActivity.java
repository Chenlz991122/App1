package com.example.myapplication.ui.ratepage;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ConfigActivity extends AppCompatActivity {
    private final String TAG = "ConfigActivity";

    EditText dollarText;
    EditText euroText;
    EditText wonText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_config);
        Intent intent = getIntent();
        float dollar2 = intent.getFloatExtra("dollar_rate_key",0.0f);
        float euro2 = intent.getFloatExtra("euro_rate_key",0.0f);
        float won2 = intent.getFloatExtra("won_rate_key",0.0f);

        Log.i(TAG, "onCreate: dollar2=" + dollar2);
        Log.i(TAG, "onCreate: euro2=" + euro2);
        Log.i(TAG, "onCreate: won2=" + won2);
    }
}
