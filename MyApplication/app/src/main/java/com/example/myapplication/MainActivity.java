package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn_login,btn_to_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login= (Button)findViewById(R.id.btn_login);
        btn_to_reg= (Button)findViewById(R.id.btn_to_reg);

        final  EditText Id_Text = (EditText) findViewById(R.id.Id_Text);
        final EditText Name_Text = (EditText) findViewById(R.id.Name_Text);
        final  DB_Lite DataBaseObject = new DB_Lite(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String idlvalue = Id_Text.getText().toString();
                String namevalue = Name_Text.getText().toString();

                if (idlvalue.equals("")|| namevalue.equals("") ){
                    Toast.makeText(MainActivity.this,"الرجاء تعبئة جميع البيانات",Toast.LENGTH_LONG).show();
                }
                else {
                    boolean found = DataBaseObject.loginCheck(idlvalue, namevalue);
                    Id_Text.getText().clear();
                    Name_Text.getText().clear();

                    if (found) {
                        Toast.makeText(MainActivity.this,"تم تسجيل الدخول",Toast.LENGTH_LONG).show();
                        //logged in successfully
                        //if(idlvalue.equals("1")||ageevalue.equals("1")){
                           // Intent intent = new Intent(getApplicationContext(), chose_learning.class);
                           // startActivity(intent);
                            Intent btn_login=new Intent(MainActivity.this , chose_learning.class);
                            startActivity(btn_login);

                        //}
                    }
                    else if (!found)
                    {
                        Toast.makeText(MainActivity.this,"الرجاء ادخال بياناتك بشكل صحيح ",Toast.LENGTH_LONG).show();
                    }

                }
            }
        });
        // moving to the registration page
        btn_to_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Register_.class);
                startActivity(intent);
            } });
    }
}


