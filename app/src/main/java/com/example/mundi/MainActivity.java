package com.example.mundi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button srt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srt = findViewById(R.id.be_gin);
        srt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloadIntent =new Intent(MainActivity.this, MapsActivity.class);
                startActivity(downloadIntent);
            }
        });
    }
}
