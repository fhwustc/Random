package com.test.nick.random;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Custom_random extends AppCompatActivity implements View.OnClickListener{

    private TextView n_pick_1;
    private TextView n_pick_m;
    private TextView random_sort;
    private TextView n_give_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_custom_random);

        n_pick_1 = (TextView)findViewById(R.id.n_pick_1);
        n_pick_m = (TextView)findViewById(R.id.n_pick_m);
        random_sort = (TextView)findViewById(R.id.random_sort);
        n_give_m = (TextView)findViewById(R.id.n_give_m);

        n_pick_1.setOnClickListener(this);
        n_pick_m.setOnClickListener(this);
        random_sort.setOnClickListener(this);
        n_give_m.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.n_pick_1:
                Intent intent = new Intent(Custom_random.this,N_pick_1.class);
                startActivity(intent);
                break;
            case R.id.n_pick_m:
                Intent intent1 = new Intent(Custom_random.this,N_pick_m.class);
                startActivity(intent1);
                break;
            case R.id.random_sort:
                Intent intent2 = new Intent(Custom_random.this,Random_sort.class);
                startActivity(intent2);
                break;
            case R.id.n_give_m:
                Intent intent3 = new Intent(Custom_random.this,N_give_m.class);
                startActivity(intent3);
                break;
        }
    }
}
