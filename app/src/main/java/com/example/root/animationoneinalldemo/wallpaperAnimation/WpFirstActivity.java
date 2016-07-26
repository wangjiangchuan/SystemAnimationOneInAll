package com.example.root.animationoneinalldemo.wallpaperAnimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.R;

public class WpFirstActivity extends Activity {

    //views
    private Button wpFirstSecondActBut;
    private Button wpReturnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wp_first);

        initViews();

        wpFirstSecondActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(WpSecondActivity.class);
            }
        });

        wpReturnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //initilize views
    private void initViews() {
        wpFirstSecondActBut = (Button) findViewById(R.id.wallpaper_first_second_act_but);
        wpReturnMenu = (Button) findViewById(R.id.wallpaper_return_menu);
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(WpFirstActivity.this, classname);
        startActivity(intent);
    }
}
