package com.example.administrator.mybutton;

import  android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final MyButton btn=(MyButton)findViewById(R.id.btn);
        BtnBean mBean=new BtnBean();
        mBean.setMtext("我的按钮");

        btn.setmBean(mBean);

        btn.setClickMyButtonListener(new MyButton.ClickMyButtonListener() {
            @Override
            public void onClick(BtnBean mBean) {

                Toast.makeText(MainActivity.this, mBean.getMtext()+"被点击了", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
