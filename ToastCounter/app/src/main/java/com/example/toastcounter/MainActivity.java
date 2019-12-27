package com.example.toastcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button toastButton, countButton, resetButton;
    private TextView displayCount;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastButton = findViewById(R.id.main_activity_toast);
        countButton = findViewById(R.id.main_activity_count_increase);
        resetButton = findViewById(R.id.main_activity_reset);
        displayCount = findViewById(R.id.main_activity_display);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, displayCount.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                displayCount.setText(Integer.toString(count));
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                displayCount.setText(Integer.toString(count));
            }
        });


    }
}
