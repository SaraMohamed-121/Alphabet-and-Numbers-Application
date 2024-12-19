package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class alphabet_letter extends AppCompatActivity {
    ImageButton btn2tadrb;
    ImageButton img_ta;
    ImageButton btn3tadrb;
    Button back_ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_letter);

        //to tr4
        back_ch =findViewById(R.id.back_ch );
        back_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_ch =new Intent(alphabet_letter.this , chose_learning.class);
                startActivity(back_ch );
            }
        });
        //to tr4
        img_ta =findViewById(R.id.img_ta);
        final MediaPlayer med_t = MediaPlayer.create(this,R.raw.tadrb);
        img_ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med_t.start();
                Intent img_ta =new Intent(alphabet_letter.this , tr4.class);
                startActivity(img_ta);
            }
        });


        //All Image Button
        ImageButton img22 =findViewById(R.id.img_22);
        ImageButton img23 =findViewById(R.id.img_23);
        ImageButton img24 =findViewById(R.id.img_24);
        ImageButton img25 =findViewById(R.id.img_25);
        ImageButton img26 =findViewById(R.id.img_26);
        ImageButton img27 =findViewById(R.id.img_27);
        ImageButton img28 =findViewById(R.id.img_28);


        //All sound       final MediaPlayer Med9 = MediaPlayer.create(this ,R.raw.a9s);
        final MediaPlayer med22 = MediaPlayer.create(this,R.raw.a22);
        final MediaPlayer med23 = MediaPlayer.create(this,R.raw.a23);
        final MediaPlayer med24 = MediaPlayer.create(this,R.raw.a24);
        final MediaPlayer med25 = MediaPlayer.create(this,R.raw.a25);
        final MediaPlayer med26 = MediaPlayer.create(this,R.raw.a26);
        final MediaPlayer med27 = MediaPlayer.create(this,R.raw.a27);
        final MediaPlayer med28 = MediaPlayer.create(this,R.raw.a28);


        //All Action
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med22.start();
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med23.start();
            }
        });

        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med24.start();
            }
        });

        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med25.start();
            }
        });

        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med26.start();
            }
        });

        img27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med27.start();
            }
        });

        img28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med28.start();
            }
        });


        //to tr2
        btn2tadrb=(ImageButton)findViewById(R.id.btn2tadrb);
        final MediaPlayer MedTdrb = MediaPlayer.create(this ,R.raw.tdrb2);
        btn2tadrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MedTdrb.start();
                Intent btn2tadrb =new Intent(alphabet_letter.this , tr2.class);
                startActivity(btn2tadrb);
            }
        });


        /////////////////////aisha/////////////////////////////////////

        //All Image button
        ImageButton btn8 =findViewById(R.id.btn8);
        ImageButton btn9 =findViewById(R.id.btn9);
        ImageButton btn10 =findViewById(R.id.btn10);
        ImageButton btn11 =findViewById(R.id.btn11);
        ImageButton btn12 =findViewById(R.id.btn12);
        ImageButton btn13 =findViewById(R.id.btn13);
        ImageButton btn14 =findViewById(R.id.btn14);

        //All sound for this letter
        final MediaPlayer Med8 = MediaPlayer.create(this ,R.raw.a8s);
        final MediaPlayer Med9 = MediaPlayer.create(this ,R.raw.a9s);
        final MediaPlayer Med10 = MediaPlayer.create(this ,R.raw.a10s);
        final MediaPlayer Med11 = MediaPlayer.create(this ,R.raw.a11s);
        final MediaPlayer Med12 = MediaPlayer.create(this ,R.raw.a12s);
        final MediaPlayer Med13 = MediaPlayer.create(this ,R.raw.a13s);
        final MediaPlayer Med14 = MediaPlayer.create(this ,R.raw.a14s);

        //All Action
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med8.start();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med9.start();
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med10.start();
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med11.start();
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med12.start();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med13.start();
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Med14.start();
            }
        });


        //to tr3
        btn3tadrb =(ImageButton) findViewById(R.id.btn3tadrb);
        final MediaPlayer td = MediaPlayer.create(this,R.raw.tdrb2);
        btn3tadrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                td.start();
                Intent btn3tadrb=new Intent(alphabet_letter.this , tr3.class);
                startActivity(btn3tadrb);
            }
        });
        final   MediaPlayer med15 =MediaPlayer.create(this,R.raw.a15s);
        ImageButton btn15 =findViewById(R.id.btn15id);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med15.start();
            }
        });

        final   MediaPlayer med16 =MediaPlayer.create(this,R.raw.a16s);
        ImageButton btn16 =findViewById(R.id.btn16id);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med16.start();
            }
        });

        final   MediaPlayer med17 =MediaPlayer.create(this,R.raw.a17s);
        ImageButton btn17 =findViewById(R.id.btn17id);

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med17.start();
            }
        });

        final   MediaPlayer med18 =MediaPlayer.create(this,R.raw.a18s);
        ImageButton btn18 =findViewById(R.id.btn18id);

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med18.start();
            }
        });

        final   MediaPlayer med19 =MediaPlayer.create(this,R.raw.a19s);
        ImageButton btn19 =findViewById(R.id.btn19id);

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med19.start();
            }
        });

        final   MediaPlayer med20 =MediaPlayer.create(this,R.raw.a20s);
        ImageButton btn20 =findViewById(R.id.btn20id);

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med20.start();
            }
        });

        final   MediaPlayer med21 =MediaPlayer.create(this,R.raw.a21s);
        ImageButton btn21 =findViewById(R.id.btn21id);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                med21.start();
            }
        });






        //to tr1
        ImageButton btnL1 = (ImageButton) findViewById(R.id.btnLett1);
        ImageButton btnL2 = (ImageButton) findViewById(R.id.btnLett2);
        ImageButton btnL3 = (ImageButton) findViewById(R.id.btnLett3);
        ImageButton btnL4 = (ImageButton) findViewById(R.id.btnLett4);
        ImageButton btnL5 = (ImageButton) findViewById(R.id.btnLett5);
        ImageButton btnL6 = (ImageButton) findViewById(R.id.btnLett6);
        ImageButton btnL7 = (ImageButton) findViewById(R.id.btnLett7);
        ImageButton btnTadarab1 = (ImageButton) findViewById(R.id.tadarab1);


        final MediaPlayer mpL1 = MediaPlayer.create(this, R.raw.lett1sound);
        final MediaPlayer mpL2 = MediaPlayer.create(this, R.raw.lett2sound);
        final MediaPlayer mpL3 = MediaPlayer.create(this, R.raw.lett3sound);
        final MediaPlayer mpL4 = MediaPlayer.create(this,R.raw.lett4sound);
        final MediaPlayer mpL5 = MediaPlayer.create(this,R.raw.lett5sound);
        final MediaPlayer mpL6 = MediaPlayer.create(this,R.raw.lett6sound);
        final MediaPlayer mpL7 = MediaPlayer.create(this,R.raw.lett7sound);
        final MediaPlayer mpl8 = MediaPlayer.create(this,R.raw.lett8sound);


        btnL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // openAtivityL1();
                mpL1.start();

            }
        });


        btnL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpL2.start();

            }
        });
        btnL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpL3.start();

            }
        });
        btnL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpL4.start();

            }
        });
        btnL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpL5.start();

            }
        });
        btnL6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpL6.start();

            }
        });
        btnL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpL7.start();

            }
        });

        btnTadarab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpl8.start();
                openAtivityT1();
            }
        });
    }
    public void openAtivityT1() {
        Intent intentT1 = new Intent(alphabet_letter.this, tr1.class);
        startActivity(intentT1);

    }
}