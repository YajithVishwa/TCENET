package com.yajith.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class CustomProgress {
    private Activity activity;
    private AlertDialog alertDialog;
    CustomProgress(Activity activity)
    {
        this.activity=activity;
    }
    void startload()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(activity);
        LayoutInflater layoutInflater=activity.getLayoutInflater();
        builder.setView(layoutInflater.inflate(R.layout.custom_progress,null));
        builder.setCancelable(false);
        alertDialog=builder.create();
        alertDialog.show();
    }
    void stop()
    {
        if(alertDialog.isShowing())
        {
            alertDialog.dismiss();
        }
    }
}
