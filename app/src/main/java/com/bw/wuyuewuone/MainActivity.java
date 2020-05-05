package com.bw.wuyuewuone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.img);
        String a="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1577442815232&di=49d50a07a4760c0ec89ddc3651e2b2e2&imgtype=0&src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fwallpaper%2F1301%2F14%2Fc1%2F17389236_1358146562800.jpg";
        Glide.with(this).load(a).into(img);
    }
}
