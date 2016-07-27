package com.example.root.animationoneinalldemo.activityAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.R;

public class actSecondActivity extends AppCompatActivity {

    //views
    private Button actSecondFirstActBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_second);

        initViews();

        actSecondFirstActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }

    //initilize views
    private void initViews() {
        actSecondFirstActBut = (Button) findViewById(R.id.act_second_first_act_but);
    }


    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(actSecondActivity.this, classname);
        startActivity(intent);
    }
}
