package com.example.root.animationoneinalldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.activityAnimation.actFirstActivity;
import com.example.root.animationoneinalldemo.fragmentAnimation.fragmentFirstActivity;
import com.example.root.animationoneinalldemo.taskAnimation.taskFirstActivity;
import com.example.root.animationoneinalldemo.wallpaperAnimation.WpFirstActivity;
import com.example.root.animationoneinalldemo.windowAnimation.windowFirstActivity;

public class MenuActivity extends AppCompatActivity {

    //Button View
    private Button wallPaperAnimBut;
    private Button taskAnimBut;
    private Button actAnimBut;
    private Button windAnimBut;
    private Button fragmentAnimBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initView();

        wallPaperAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButClick(WpFirstActivity.class);
            }
        });

        taskAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButClick(taskFirstActivity.class);
            }
        });

        actAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButClick(actFirstActivity.class);
            }
        });

        windAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButClick(windowFirstActivity.class);
            }
        });

        fragmentAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButClick(fragmentFirstActivity.class);
            }
        });
    }

    //initilize the view widgets
    private void initView() {
        wallPaperAnimBut = (Button) findViewById(R.id.menu_wallpaper_anim_but);
        taskAnimBut = (Button) findViewById(R.id.menu_task_anim_but);
        actAnimBut = (Button) findViewById(R.id.menu_act_anim_but);
        windAnimBut = (Button) findViewById(R.id.menu_wind_anim_but);
        fragmentAnimBut = (Button)findViewById(R.id.menu_fragment_anim_but);
    }

    //WallPaper Animation Button Click
    private void ButClick(Class classname) {
        Intent intent = new Intent(MenuActivity.this, classname);
        startActivity(intent);
    }
}
