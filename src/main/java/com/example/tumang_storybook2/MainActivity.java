package com.example.tumang_storybook2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText MainCharacter;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainCharacter = findViewById(R.id.MainCharacter);

    }

    public void Gocoverpage(View v) {
        name = MainCharacter.getText().toString();
        Intent i = new Intent(this, coverpage.class);
        i.putExtra("name", name);
        startActivity(i);
        finish();
    }


    int j = 1;

    public void onBackPressed() {
        super.onBackPressed();
        if (j == 1) {
            j++;
            Toast.makeText(this, "Press the back button again to exit.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
        }
    }
}