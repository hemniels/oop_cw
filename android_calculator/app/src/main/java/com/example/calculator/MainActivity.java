package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b0 = findViewById(R.id.b0);

        Button bAdd = findViewById(R.id.add);
        Button bMult = findViewById(R.id.multiply);
        Button bCE = findViewById(R.id.CE);
        Button bDiv = findViewById(R.id.div);
        Button bEQ = findViewById(R.id.equals);
        Button bSub = findViewById(R.id.sub);

        TextView display = findViewById(R.id.display);




    }
}