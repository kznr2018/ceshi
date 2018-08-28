package com.vbizhi.ceshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnEditText;
    private Button mBtnRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到EditText页面
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.tx_1:
                    //跳转到EditText页面
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditText页面
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到EditText页面
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
