package com.example.administrator.mybutton;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.util.AttributeSet;


/**
 * Created by Administrator on 2015/12/3 0003.
 */
public class MyButton extends TextView implements View.OnClickListener {
    public MyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        /* TODO Auto-generated constructor stub */
        this.setOnClickListener(this);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        this.setOnClickListener(this);
    }

    public MyButton(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        this.setOnClickListener(this);
    }

    private BtnBean mBean;

    public BtnBean getmBean() {
        return mBean;
    }

    public void setmBean(BtnBean mBean) {
        this.mBean = mBean;

        this.setText(mBean.getMtext());
    }
    private ClickMyButtonListener mListener;
    //点击回调接口
    public interface ClickMyButtonListener{
        public void onClick(BtnBean mBean);
    }
    //设置会调接口
    public void setClickMyButtonListener(ClickMyButtonListener mListener){
        this.mListener=mListener;
    }
    private static int count=0;
    @Override
    public void onClick(View v) {
        mBean.setCheck(true);
        count++;
        this.setBackgroundColor(Color.WHITE);
        if (count==2){
            count=0;
            mBean.setCheck(false);
            this.setBackgroundColor(Color.BLUE);

            if (mListener!=null){
                mListener.onClick(mBean);
            }
        }
    }
}
