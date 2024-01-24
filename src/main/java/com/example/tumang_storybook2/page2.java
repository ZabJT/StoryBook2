package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void GoPage1(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page1.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage3(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page3.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}