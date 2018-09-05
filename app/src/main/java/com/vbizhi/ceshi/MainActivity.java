package com.vbizhi.ceshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vbizhi.ceshi.gridview.GridViewActivity;
import com.vbizhi.ceshi.listview.ListViewActivity;
import com.vbizhi.ceshi.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnListView = findViewById(R.id.btn_listview);
        mBtnGridView = findViewById(R.id.btn_gridview);
        mBtnRecyclerView =findViewById(R.id.btn_recyclerview);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        mBtnEditText.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mBtnListView.setOnClickListener(onclick);
        mBtnGridView.setOnClickListener(onclick);
        mBtnRecyclerView.setOnClickListener(onclick);
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
                case R.id.btn_listview:
                    //跳转到ListView页面
                    intent = new Intent(MainActivity.this,ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //跳转到ListView页面
                    intent = new Intent(MainActivity.this,GridViewActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    //跳转到RecyclerView页面
                    intent = new Intent(MainActivity.this,RecyclerViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
