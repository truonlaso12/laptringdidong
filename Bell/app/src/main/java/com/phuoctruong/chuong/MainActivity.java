
package com.phuoctruong.chuong;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ImageButton btn1,btn2;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        btn1 = (ImageButton) findViewById(R.id.btnlogo);
        btn2 = (ImageButton) findViewById(R.id.btnadd);

        //Tab Selector
        setSupportActionBar(toolbar);
        addTabSelector();

        //Button
        button1();

        button2();
    }

    private void button2() {
    }

    private void button1() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Chạy được",Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void addTabSelector() {
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("THÔNG BÁO");
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("t2");
        tab2.setIndicator("TIN NHẮN");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);
        

        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).getBackground().setColorFilter(Color.parseColor("#FF5722"), PorterDuff.Mode.MULTIPLY);

        
    }
}