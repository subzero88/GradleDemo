package com.subzero.demo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.eversec.smart.common.utils.DesUtil;
import com.example.lib_demo.BaseActivity;
import com.subzero.demo.R;

public class MainActivity extends BaseActivity {

    static {
        System.loadLibrary("aaa");
    }

    public native String getString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String pass = "qqq";

        try {
            pass += DesUtil.decrypt("18538212237");
            Log.i("demo", pass);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("demo", "error");
        }

        ((TextView)findViewById(R.id.txt)).setText(getStr(" 在library中直接使用生成的.so文件，可直接调用方法")+pass);
    }
}
