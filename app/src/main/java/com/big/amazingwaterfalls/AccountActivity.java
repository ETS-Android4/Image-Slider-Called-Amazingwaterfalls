package com.big.amazingwaterfalls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AccountActivity extends AppCompatActivity {

    ImageButton go;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        go = findViewById(R.id.button);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this,WaterfallsActivity.class);
                startActivity(intent);
            }
        });
    }

    public void go(View view)
    {
        intent = new Intent(this, CreateActivity.class);
        startActivity(intent);
    }
}