package com.example.root.animationoneinalldemo.activityAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.R;

public class actFirstActivity extends AppCompatActivity {

    //views
    private Button actFirstSecondActBut;
    private Button actReturnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_first);

        initViews();

        actFirstSecondActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(actSecondActivity.class);
            }
        });
        actReturnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //initilize views
    private void initViews() {
        actFirstSecondActBut = (Button) findViewById(R.id.act_first_second_act_but);
        actReturnMenu = (Button) findViewById(R.id.act_return_menu_but);
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(actFirstActivity.this, classname);
        startActivity(intent);
    }

}
