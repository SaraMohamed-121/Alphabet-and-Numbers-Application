package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class chose_learning extends AppCompatActivity {
    ImageButton letter,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_learning);

        // to alphabet letter
        letter=findViewById(R.id.letter);
        letter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent letter=new Intent(chose_learning.this , alphabet_letter.class);
                startActivity(letter);
            }
        });
        // to number
        number=findViewById(R.id.number);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent number=new Intent(chose_learning.this , number.class);
                startActivity(number);
            }
        });
    }
}