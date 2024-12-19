package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class tr1 extends AppCompatActivity {
    RadioGroup T1Q1;
    RadioGroup T1Q2;
    RadioGroup T1Q3;
    RadioGroup T1Q4;
    RadioGroup T1Q5;
    RadioGroup T1Q6;
    RadioGroup T1Q7;
    Button backLetter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr1);
        backLetter=findViewById(R.id.backLetter);

        // action
        backLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLetter=new Intent(tr1.this , alphabet_letter.class);
                startActivity(backLetter);
            }
        });
        T1Q1 = (RadioGroup) findViewById(R.id.T1Q1);
        T1Q2 = (RadioGroup) findViewById(R.id.T1Q2);
        T1Q3 = (RadioGroup) findViewById(R.id.T1Q3);
        T1Q4 = (RadioGroup) findViewById(R.id.T1Q4);
        T1Q5 = (RadioGroup) findViewById(R.id.T1Q5);
        T1Q6 = (RadioGroup) findViewById(R.id.T1Q6);
        T1Q7 = (RadioGroup) findViewById(R.id.T1Q7);


    }

    public void checkBtnT1Q1(View view) {
        int ansTQ1 = T1Q1.getCheckedRadioButtonId();
        //int ansTQ2 = T1Q2.getCheckedRadioButtonId();
        if (ansTQ1 == R.id.T1Q1A1) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    }
    public void checkBtnT1Q2(View view) {
        int ansTQ2 = T1Q2.getCheckedRadioButtonId();
        if (ansTQ2 == R.id.T1Q2A2) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    } public void checkBtnT1Q3(View view) {
        int ansTQ3 = T1Q3.getCheckedRadioButtonId();
        if (ansTQ3 == R.id.T1Q3A3) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    } public void checkBtnT1Q4(View view) {
        int ansTQ4 = T1Q4.getCheckedRadioButtonId();
        if (ansTQ4 == R.id.T1Q4A1) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    } public void checkBtnT1Q5(View view) {
        int ansTQ5 = T1Q5.getCheckedRadioButtonId();
        if (ansTQ5 == R.id.T1Q5A3) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    } public void checkBtnT1Q6(View view) {
        int ansTQ6 = T1Q6.getCheckedRadioButtonId();
        if (ansTQ6 == R.id.T1Q6A1) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    } public void checkBtnT1Q7(View view) {
        int ansTQ7 = T1Q7.getCheckedRadioButtonId();
        if (ansTQ7 == R.id.T1Q7A2) {
            final MediaPlayer mpTrue = MediaPlayer.create(this, R.raw.true1);
            mpTrue.start();
        } else {
            final MediaPlayer mpFalse = MediaPlayer.create(this, R.raw.false1);
            mpFalse.start();
        }
    }
}