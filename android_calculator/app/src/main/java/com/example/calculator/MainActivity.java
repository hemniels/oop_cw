package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int INT_1 = 0;
    int INT_2 = 0;

    boolean add = true;
    boolean sub = true;
    boolean mult = true;
    boolean div = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = findViewById(R.id.b1);
        final Button b2 = findViewById(R.id.b2);
        final Button b3 = findViewById(R.id.b3);
        final Button b4 = findViewById(R.id.b4);
        final Button b5 = findViewById(R.id.b5);
        final Button b6 = findViewById(R.id.b6);
        final Button b7 = findViewById(R.id.b7);
        final Button b8 = findViewById(R.id.b8);
        final Button b9 = findViewById(R.id.b9);
        final Button b0 = findViewById(R.id.b0);

        final Button bAdd = findViewById(R.id.addition);
        final Button bMult = findViewById(R.id.multiply);
        final Button bCE = findViewById(R.id.CE);
        final Button bDiv = findViewById(R.id.div);
        final Button bEQ = findViewById(R.id.equals);
        final Button bSub = findViewById(R.id.sub);

        final TextView display = findViewById(R.id.display);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    INT_1 = Integer.parseInt(display.getText() + "");
                    add = true;
                    display.setText(null);
                }
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    INT_1 = Integer.parseInt(display.getText() + "");
                    div = true;
                    display.setText(null);
                }
            }
        });

        bMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    INT_1 = Integer.parseInt(display.getText() + "");
                    mult = true;
                    display.setText(null);
                }
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    INT_1 = Integer.parseInt(display.getText() + "");
                    sub = true;
                    display.setText(null);
                }
            }
        });


        bEQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add || sub || mult || div) {
                    INT_2 = Integer.parseInt(display.getText() + "");
                }

                if (add) {

                    display.setText(INT_1 + INT_2 + "");
                    add = false;
                }

                if (sub) {

                    display.setText(INT_1 - INT_2 + "");
                    sub = false;
                }

                if (mult) {
                    display.setText(INT_1 * INT_2 + "");
                    mult = false;
                }

                if (div) {
                    display.setText(INT_1 / INT_2 + "");
                    div = false;
                }
            }
        });

        bCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                INT_1 = 0;
                INT_2 = 0;
                add = false;
                sub = false;
                mult = false;
                div = false;
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}