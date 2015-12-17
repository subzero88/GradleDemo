package com.example.lib_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends Activity {

    static {
        System.loadLibrary("aaa");
    }

    public native String getString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }
    
    public String getStr(String msg) {
        String str = getString() + msg;
    	Log.i(this.getClass().getName(), str);
        return str;
    }
}
