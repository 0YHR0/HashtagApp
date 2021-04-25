package com.example.hashtag;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView tv;
    public Button btn_1;
    public Button btn_login;
    public Onclick onclick = new Onclick();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.view_1);
//        tv.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        tv.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        tv.getPaint().setAntiAlias(true);//抗锯齿
        btn_1 = findViewById(R.id.btn_1);
        btn_login = findViewById(R.id.btn_login);
        setOnclink();
    }

    public void setOnclink(){
        btn_1.setOnClickListener(onclick);
        btn_login.setOnClickListener(onclick);
    }
    //this class is used to encapsulate the onclick function
    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent= new Intent();
            switch (v.getId()){
                case R.id.btn_login:
                    Toast.makeText(MainActivity.this,"go to text view",Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_1:
                    Toast.makeText(MainActivity.this,"pressed",Toast.LENGTH_SHORT).show();
                    //跳转
                    intent  = new Intent(MainActivity.this,ButtonActivity.class);
                    startActivity(intent);
                    break;

            }

        }
    }
}

