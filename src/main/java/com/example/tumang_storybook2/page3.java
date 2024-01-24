package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("MainCharacter");
        hello.setText("when " + pangalan + " came out of the trees. She wasn't scared because she didn't know that " + pangalan + " is dangerous.");
    }

    public void GoPage2(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.tumang_storybook2.page2.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void GoPage4(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page4.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}