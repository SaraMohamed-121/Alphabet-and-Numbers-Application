package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
//import android.widgetImageButton;
import android.widget.ImageView;

public class number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ImageButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
        Button btnTrain;

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.two);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.three);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.four);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.five);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.six);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.seven);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.eight);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.nine);
        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.ten);

        btnTrain = (Button)findViewById(R.id.trainbtn);
        btnTrain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openTrainActivity();
            }
        });

//-------------------------------------------------------------------

        c1 = (ImageButton) findViewById(R.id.one_card);
        c2 = (ImageButton) findViewById(R.id.two_card);
        c3 = (ImageButton) findViewById(R.id.three_card);
        c4 = (ImageButton) findViewById(R.id.four_card);
        c5 = (ImageButton) findViewById(R.id.five_card);
        c6 = (ImageButton) findViewById(R.id.six_card);
        c7 = (ImageButton) findViewById(R.id.seven_card);
        c8 = (ImageButton) findViewById(R.id.eight_card);
        c9 = (ImageButton) findViewById(R.id.nine_card);
        c10 = (ImageButton) findViewById(R.id.ten_card);



        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                showDialog1();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                showDialog2();

            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                showDialog3();

            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
                showDialog4();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
                showDialog5();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
                showDialog6();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
                showDialog7();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
                showDialog8();
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
                showDialog9();
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.start();
                showDialog10();
            }
        });

    }

    public void openTrainActivity(){
        Intent intent = new Intent(this,TrainingNumberActivity.class);
        startActivity(intent);
    }

    private void showDialog1(){
        Dialog dialog1 = new Dialog(this);
        dialog1.setContentView(R.layout.pop1);
        ImageView btnclose1 = dialog1.findViewById(R.id.close1);
        btnclose1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog1.dismiss();
            }
        });
        dialog1.show();
    }

    private void showDialog2(){
        Dialog dialog2 = new Dialog(this);
        dialog2.setContentView(R.layout.pop2);
        ImageView btnclose2 = dialog2.findViewById(R.id.close2);
        btnclose2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog2.dismiss();
            }
        });
        dialog2.show();
    }
    private void showDialog3(){
        Dialog dialog3 = new Dialog(this);
        dialog3.setContentView(R.layout.pop3);
        ImageView btnclose3 = dialog3.findViewById(R.id.close3);
        btnclose3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog3.dismiss();
            }
        });
        dialog3.show();
    }
    private void showDialog4(){
        Dialog dialog4 = new Dialog(this);
        dialog4.setContentView(R.layout.pop4);
        ImageView btnclose4 = dialog4.findViewById(R.id.close4);
        btnclose4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog4.dismiss();
            }
        });
        dialog4.show();
    }
    private void showDialog5(){
        Dialog dialog5 = new Dialog(this);
        dialog5.setContentView(R.layout.pop5);
        ImageView btnclose5 = dialog5.findViewById(R.id.close5);
        btnclose5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog5.dismiss();
            }
        });
        dialog5.show();
    }
    private void showDialog6(){
        Dialog dialog6 = new Dialog(this);
        dialog6.setContentView(R.layout.pop6);
        ImageView btnclose6 = dialog6.findViewById(R.id.close6);
        btnclose6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog6.dismiss();
            }
        });
        dialog6.show();
    }
    private void showDialog7(){
        Dialog dialog7 = new Dialog(this);
        dialog7.setContentView(R.layout.pop7);
        ImageView btnclose7 = dialog7.findViewById(R.id.close7);
        btnclose7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog7.dismiss();
            }
        });
        dialog7.show();
    }
    private void showDialog8(){
        Dialog dialog8 = new Dialog(this);
        dialog8.setContentView(R.layout.pop8);
        ImageView btnclose8 = dialog8.findViewById(R.id.close8);
        btnclose8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog8.dismiss();
            }
        });
        dialog8.show();
    }
    private void showDialog9(){
        Dialog dialog9 = new Dialog(this);
        dialog9.setContentView(R.layout.pop9);
        ImageView btnclose9 = dialog9.findViewById(R.id.close9);
        btnclose9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog9.dismiss();
            }
        });
        dialog9.show();
    }
    private void showDialog10(){
        Dialog dialog10 = new Dialog(this);
        dialog10.setContentView(R.layout.pop10);
        ImageView btnclose10 = dialog10.findViewById(R.id.close10);
        btnclose10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog10.dismiss();
            }
        });
        dialog10.show();
    }

}