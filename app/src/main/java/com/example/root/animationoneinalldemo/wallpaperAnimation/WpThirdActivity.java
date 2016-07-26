package com.example.root.animationoneinalldemo.wallpaperAnimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.R;

public class WpThirdActivity extends Activity {

    //views
    private Button wpThirdSecondActBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wp_third);

        initViews();

        wpThirdSecondActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(WpSecondActivity.class);
            }
        });
    }

    //initilize views
    private void initViews() {
        wpThirdSecondActBut = (Button) findViewById(R.id.wallpaper_third_second_act_but);
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(WpThirdActivity.this, classname);
        startActivity(intent);
    }
}
