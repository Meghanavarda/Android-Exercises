package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.layout);
    }

    public void onClick(View view){
        count++;
        TextView text = (TextView)findViewById(R.id.show_count);
        text.setText(""+count);// view in the text
    }

    public void onClick1(View view){
        count=0;
        TextView text = (TextView)findViewById(R.id.show_count);
        text.setText(""+count);// view in the text
    }
}
