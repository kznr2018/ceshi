package com.vbizhi.ceshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_imageview);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        mBtnEditText.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
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
                    //跳转到RadioButton页面
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    //跳转到EditText页面
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    //跳转到ImageView页面
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
