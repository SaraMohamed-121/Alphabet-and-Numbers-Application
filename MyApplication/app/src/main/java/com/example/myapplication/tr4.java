package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tr4 extends AppCompatActivity {
    Button backLetter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr4);

        backLetter=findViewById(R.id.backLetter);

        // action
        backLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLetter=new Intent(tr4.this , alphabet_letter.class);
                startActivity(backLetter);
            }
        });

        //All qustions (if answer is correct )
        ImageButton t1=findViewById(R.id.t1);
        ImageButton t2=findViewById(R.id.t2);
        ImageButton t3=findViewById(R.id.t3);
        ImageButton t4=findViewById(R.id.t4);
        ImageButton t5=findViewById(R.id.t5);

        //All qustions (if answer is not correct )
        ImageButton a1=findViewById(R.id.false1);
        ImageButton a2=findViewById(R.id.false2);
        ImageButton a3=findViewById(R.id.false3);
        ImageButton a4=findViewById(R.id.false4);
        ImageButton a5=findViewById(R.id.false5);
        ImageButton a6=findViewById(R.id.false6);
        ImageButton a7=findViewById(R.id.false7);
        ImageButton a8=findViewById(R.id.false8);
        ImageButton a9=findViewById(R.id.false9);
        ImageButton a10=findViewById(R.id.false10);

        //All sound for qustion
        final MediaPlayer ahsnt=MediaPlayer.create(this,R.raw.ahsant);
        final MediaPlayer mmtaz=MediaPlayer.create(this,R.raw.momtaz);
        final MediaPlayer hawelmraahra=MediaPlayer.create(this,R.raw.hawel);

        //All actions  if true

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
        });

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