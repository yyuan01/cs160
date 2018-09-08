package com.example.yuanyuan.progassign01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        final EditText edit_text = (EditText) findViewById(R.id.editText2);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView2);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = ((float) Integer.parseInt(edit_text.getText().toString())) / (float) 3.1 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView2);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 18 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView2);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 26 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView2);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / (float) 12.5 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView2);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 8 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });


    }
}
