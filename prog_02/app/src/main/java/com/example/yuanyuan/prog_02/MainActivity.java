package com.example.yuanyuan.prog_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button search = findViewById(R.id.search);
        Button curr = findViewById(R.id.curr);

        final EditText edit_text = (EditText) findViewById(R.id.editText);

        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v);
            }
        });
        curr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage1(v);
            }
        });
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, cong_1.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra("zipcode", message);
        startActivity(intent);
    }
    public void sendMessage1(View view) {
        Intent intent = new Intent(this, cong_1.class);

        intent.putExtra("zipcode", "94720");
        startActivity(intent);
    }
}
