package com.vbizhi.ceshi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv4 = findViewById(R.id.iv_4);
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1535899594106&di=d8ddf45e0cd1bd51d0827c051fcc6854&imgtype=0&src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farchive%2F6f8022fda9e7138c731ea986e75e14478906f739.jpg").into(mIv4);
    }
}
