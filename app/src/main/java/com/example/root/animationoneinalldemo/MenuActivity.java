package com.example.root.animationoneinalldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.taskAnimation.taskFirstActivity;
import com.example.root.animationoneinalldemo.wallpaperAnimation.WpFirstActivity;

public class MenuActivity extends AppCompatActivity {

    //Button View
    private Button wallPaperAnimBut;
    private Button taskAnimBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initView();

        wallPaperAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wallpaperButClick(WpFirstActivity.class);
            }
        });

        taskAnimBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wallpaperButClick(taskFirstActivity.class);
            }
        });
    }

    //initilize the view widgets
    private void initView() {
        wallPaperAnimBut = (Button) findViewById(R.id.menu_wallpaper_anim_but);
        taskAnimBut = (Button) findViewById(R.id.menu_task_anim_but);
    }

    //WallPaper Animation Button Click
    private void wallpaperButClick(Class classname) {
        Intent intent = new Intent(MenuActivity.this, classname);
        startActivity(intent);
    }
}
