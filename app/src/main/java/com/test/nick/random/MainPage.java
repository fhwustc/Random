package com.test.nick.random;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainPage extends AppCompatActivity implements View.OnClickListener{

    private TextView custom_random_btn;
    private TextView default_random_btn;
    private TextView search_around_btn;
    private TextView almanac_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_main_page);
/*
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
*/
        custom_random_btn = (TextView)findViewById(R.id.custom_random);
        default_random_btn = (TextView)findViewById(R.id.default_random);
        search_around_btn = (TextView)findViewById(R.id.search_around);
        almanac_btn = (TextView)findViewById(R.id.almanac);

        custom_random_btn.setOnClickListener(this);
        default_random_btn.setOnClickListener(this);
        search_around_btn.setOnClickListener(this);
        almanac_btn.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.custom_random:
                Intent intent = new Intent(MainPage.this,Custom_random.class);
                startActivity(intent);
        }
    }

}
