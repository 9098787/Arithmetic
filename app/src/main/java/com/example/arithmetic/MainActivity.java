package com.example.arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arithmetic.LoseActivity;
import com.example.arithmetic.WinActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edit = editText.getText().toString();
                if (edit.isEmpty()){
                    Toast.makeText(MainActivity.this, "Поле пустое", Toast.LENGTH_SHORT).show();
                } else {
                    if (Integer.parseInt(edit) == 4) {
                        startActivity(new Intent(MainActivity.this, WinActivity.class));
                        finish();
                    } else {
                        startActivity(new Intent(MainActivity.this, LoseActivity.class));
                        finish();
                    }
                }
            }
        });
    }
}