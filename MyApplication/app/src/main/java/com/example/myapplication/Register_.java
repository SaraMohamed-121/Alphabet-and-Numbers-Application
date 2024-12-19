package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;

public class Register_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_register;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        SQLiteDatabase AppDataBase;
        btn_register = (Button)findViewById(R.id.btn_register);
        final  EditText Id_Text = (EditText) findViewById(R.id.Id_Text);
        final EditText Name_Text = (EditText) findViewById(R.id.Name_Text);
        final EditText Age_Text = (EditText) findViewById(R.id.Age_Text);
        final EditText Country_Text = (EditText) findViewById(R.id.Country_Text);
        final  DB_Lite DataBaseObject = new DB_Lite(this);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idlvalue = Id_Text.getText().toString();
                String namevalue = Name_Text.getText().toString();
                String ageevalue = Age_Text.getText().toString();
                String countryvalue = Country_Text.getText().toString();
                if (idlvalue.equals("")||  namevalue.equals("")||ageevalue.equals("")||countryvalue.equals("") )
                {
                    Toast.makeText(Register_.this,"الرجاء تعبئة جميع البيانات",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (DataBaseObject.exist(idlvalue))
                    {
                        Toast.makeText(Register_.this, "هذا الرقم بالفعل موجود", Toast.LENGTH_LONG).show();
                    }
                    else if ( !DataBaseObject.exist(idlvalue))
                    {
                        DataBaseObject.AddNewUser(idlvalue,namevalue,ageevalue);
                        Toast.makeText(Register_.this, "تم التسجيل بنجاح", Toast.LENGTH_LONG).show();

                        Intent btn_register=new Intent(Register_.this , MainActivity.class);
                        startActivity(btn_register);
                    }

                }  }});



    }
}
/*

*/