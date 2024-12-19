package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TrainingNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_number);

        ImageButton c1,c2,c3,c4,c11,c12,c13,c14,c21,c22,c23,c24,c31,c32,c33,c34,c41,c42,c43,c44,
                c51,c52,c53,c54,c61,c62,c63,c64,c71,c72,c73,c74,c81,c82,c83,c84,c91,c92,c93,c94;
        c1 = (ImageButton) findViewById(R.id.ans1);
        c2 = (ImageButton) findViewById(R.id.ans2);
        c3 = (ImageButton) findViewById(R.id.ans3);
        c4 = (ImageButton) findViewById(R.id.ans4);

        c11 = (ImageButton) findViewById(R.id.ans11);
        c12 = (ImageButton) findViewById(R.id.ans12);
        c13 = (ImageButton) findViewById(R.id.ans13);
        c14 = (ImageButton) findViewById(R.id.ans14);

        c21 = (ImageButton) findViewById(R.id.ans21);
        c22 = (ImageButton) findViewById(R.id.ans22);
        c23 = (ImageButton) findViewById(R.id.ans23);
        c24 = (ImageButton) findViewById(R.id.ans24);

        c31 = (ImageButton) findViewById(R.id.ans31);
        c32 = (ImageButton) findViewById(R.id.ans32);
        c33 = (ImageButton) findViewById(R.id.ans33);
        c34 = (ImageButton) findViewById(R.id.ans34);

        c41 = (ImageButton) findViewById(R.id.ans41);
        c42 = (ImageButton) findViewById(R.id.ans42);
        c43 = (ImageButton) findViewById(R.id.ans43);
        c44 = (ImageButton) findViewById(R.id.ans44);

        c51 = (ImageButton) findViewById(R.id.ans51);
        c52 = (ImageButton) findViewById(R.id.ans52);
        c53 = (ImageButton) findViewById(R.id.ans53);
        c54 = (ImageButton) findViewById(R.id.ans54);

        c61 = (ImageButton) findViewById(R.id.ans61);
        c62 = (ImageButton) findViewById(R.id.ans62);
        c63 = (ImageButton) findViewById(R.id.ans63);
        c64 = (ImageButton) findViewById(R.id.ans64);

        c71 = (ImageButton) findViewById(R.id.ans71);
        c72 = (ImageButton) findViewById(R.id.ans72);
        c73 = (ImageButton) findViewById(R.id.ans73);
        c74 = (ImageButton) findViewById(R.id.ans74);

        c81 = (ImageButton) findViewById(R.id.ans81);
        c82 = (ImageButton) findViewById(R.id.ans82);
        c83 = (ImageButton) findViewById(R.id.ans83);
        c84 = (ImageButton) findViewById(R.id.ans84);

        c91 = (ImageButton) findViewById(R.id.ans91);
        c92 = (ImageButton) findViewById(R.id.ans92);
        c93 = (ImageButton) findViewById(R.id.ans93);
        c94 = (ImageButton) findViewById(R.id.ans94);

        final MediaPlayer qmp1 = MediaPlayer.create(this, R.raw.verygood);
        final MediaPlayer qmp2 = MediaPlayer.create(this, R.raw.tryagain);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });
        c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });
        c54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });
        c62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });
        c73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });

        //--------------------------------------------------------------------------------------
        c91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });
        c93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp1.start();
            }
        });
        c94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qmp2.start();
            }
        });

    }
}