package com.example.masters.fingerfutronic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startfinger;
    ImageView FingerImage;
    TextView Message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FingerImage = (ImageView) findViewById(R.id.imageView);
        startfinger = (Button) findViewById(R.id.finger);
        Message = (TextView) findViewById(R.id.status);


    }
}
