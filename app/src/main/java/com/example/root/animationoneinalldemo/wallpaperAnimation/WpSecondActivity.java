package com.example.root.animationoneinalldemo.wallpaperAnimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.R;

public class WpSecondActivity extends Activity {

    //Views
    private Button wpSecondFirstActBut;
    private Button wpSecondThirdActBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wp_second);

        initViews();

        wpSecondFirstActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(WpFirstActivity.class);
            }
        });

        wpSecondThirdActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(WpThirdActivity.class);
            }
        });
    }

    //initilize views
    private void initViews() {
        wpSecondFirstActBut = (Button) findViewById(R.id.wallpaper_second_first_act_but);
        wpSecondThirdActBut = (Button) findViewById(R.id.wallpaper_second_third_act_but);
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(WpSecondActivity.this, classname);
        startActivity(intent);
    }
}
