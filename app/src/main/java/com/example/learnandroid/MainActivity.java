package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

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
        button.setOnClickListener(this);
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

}
