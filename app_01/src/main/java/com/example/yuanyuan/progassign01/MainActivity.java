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

        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);

        final EditText edit_text = (EditText) findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView1);
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
                TextView iv = (TextView) findViewById(R.id.textView3);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 26 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView4);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / (float) 12.5 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView5);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 8 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView8);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = ((float) Integer.parseInt(edit_text.getText().toString())) / (float) 19 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView9);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 22 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView10);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / (float) 12.5 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView11);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / (float) 10 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView iv = (TextView) findViewById(R.id.textView12);
                System.out.println(Integer.parseInt(edit_text.getText().toString()));
                Float integer = (float) Integer.parseInt(edit_text.getText().toString()) / 15 * 60;
                System.out.println(integer);
                iv.setText(integer.toString());
            }
        });


    }
}
