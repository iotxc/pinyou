package com.xc.pinyou.weight;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.xc.pinyou.R;

/**
 * Created by xum19 on 2017/11/15.
 */

public class CustomProgressDialog extends ProgressDialog {
    private String message = "";

    public CustomProgressDialog(Context context, int theme) {
        super(context, theme);
    }

    public CustomProgressDialog(Context context) {
        super(context);
    }

    public CustomProgressDialog(Context context, int theme,
                                String message) {
        super(context, theme);
        this.message = message;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laod_progressbar_layout);
        //dialog弹出后点击物理返回键Dialog消失，但是点击屏幕不会消失
        this.setCanceledOnTouchOutside(false);

        //dialog弹出后点击屏幕或物理返回键，dialog都不消失
        //this.setCancelable(false);
        if (message != null){
            ((TextView)findViewById(R.id.progress_text)).setText(message);
        }
    }
}