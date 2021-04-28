package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        button.setOnClickListener(this);
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
                //这里是弹出一个消息---"按钮被点击"
        }
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
