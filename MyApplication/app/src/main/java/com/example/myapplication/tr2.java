package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tr2 extends AppCompatActivity {
    Button backLetter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr2);
        //back
        backLetter1=findViewById(R.id.backLetter1);

        // action
        backLetter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLetter1=new Intent(tr2.this , alphabet_letter.class);
                startActivity(backLetter1);
            }
        });


        //All qustions (if answer is correct )
        ImageButton t1=findViewById(R.id.True1);
        ImageButton t2=findViewById(R.id.True2);
        ImageButton t3=findViewById(R.id.True3);
        ImageButton t4=findViewById(R.id.True4);
        ImageButton t5=findViewById(R.id.True5);

        //All qustions (if answer is not correct )
        ImageButton a1=findViewById(R.id.False1);
        ImageButton a2=findViewById(R.id.False2);
        ImageButton a3=findViewById(R.id.False3);
        ImageButton a4=findViewById(R.id.False4);
        ImageButton a5=findViewById(R.id.False5);
        ImageButton a6=findViewById(R.id.False6);
        ImageButton a7=findViewById(R.id.False7);
        ImageButton a8=findViewById(R.id.False8);
        ImageButton a9=findViewById(R.id.False9);
        ImageButton a10=findViewById(R.id.False10);

        //All sound for qustion
        final MediaPlayer ahsnt=MediaPlayer.create(this,R.raw.ahsnt);
        final MediaPlayer mmtaz=MediaPlayer.create(this,R.raw.mmtaz);
        final MediaPlayer hawelmraahra=MediaPlayer.create(this,R.raw.hawelmraahra);

        //All actions if true
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahsnt.start();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahsnt.start();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahsnt.start();
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahsnt.start();
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahsnt.start();
            }
        });

        //All Actions if false
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });/*19:12*/

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });

        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hawelmraahra.start();
            }
        });
    }
}