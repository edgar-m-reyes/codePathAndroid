package com.example.edgarreyes.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.edgarreyes.helloworld.R.*;
import static com.example.edgarreyes.helloworld.R.color.colorPrimary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(color.darkBlue));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText= ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Edgar!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(color.orignalTextColor));
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(color.colorAccent));
                ((TextView) findViewById(R.id.textView)).setText("Hello from Edgar!");
            }
        });
    }
}
