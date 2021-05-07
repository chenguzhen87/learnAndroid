package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button dialTel = findViewById(R.id.dialTel);
        Button dialTel2 = findViewById(R.id.dialTel2);
        Button openBaidu = findViewById(R.id.openBaidu);
        Button webview = findViewById(R.id.webview);
        button.setOnClickListener(this);
        dialTel.setOnClickListener(this);
        dialTel2.setOnClickListener(this);
        openBaidu.setOnClickListener(this);
        webview.setOnClickListener(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "按钮2",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                //里面写点击后想要实现的效果
                Toast.makeText(MainActivity.this,
                        "按钮被点击", Toast.LENGTH_SHORT).show();
                break;
                //这里是弹出一个消息---"按钮被点击"
            case R.id.dialTel:
                dial();
                break;
            case R.id.dialTel2:
                dial2();
                break;
            case R.id.openBaidu:
                openBaidu();
                break;
            case R.id.webview:
                webview();
                break;
        }
    }


    public void dial(){
        // 调用拨打电话，给10010拨打电话
        Uri uri = Uri.parse("tel:10010");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    public void dial2(){
        // 直接拨打电话，需要加上权限 <uses-permission  android:name="android.permission.CALL_PHONE"/>
        Uri callUri = Uri.parse("tel:10010");
        Intent intent = new Intent(Intent.ACTION_CALL, callUri);
    }

    public void openBaidu(){
        // 打开百度主页
        Uri uri = Uri.parse("https://www.baidu.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void webview(){
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }


    public  void onButtonClick(View view){
        Toast.makeText(this, "按钮1",Toast.LENGTH_LONG).show();
    }

    public void skip(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,RelativeLayout.class);
        startActivity(intent);
    }

}
