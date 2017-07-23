package com.example.administrator.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().isRegistered(this);//eventbus注册
        setContentView(R.layout.activity_main);
        //测试asdqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
        //服务器修改代码，客户端进行更新

    }
}

