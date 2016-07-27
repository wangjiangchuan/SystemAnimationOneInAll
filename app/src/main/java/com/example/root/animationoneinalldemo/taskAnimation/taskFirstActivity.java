package com.example.root.animationoneinalldemo.taskAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.root.animationoneinalldemo.R;

public class taskFirstActivity extends AppCompatActivity {

    //views
    private Button taskFirstSecondActBut;
    private Button taskReturnMenu;
    private Button taskFirstThirdBut;

    //id info
    private TextView taskFirstTaskID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_first);

        initViews();

        taskFirstSecondActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(taskSecondActivity.class);
            }
        });

        taskReturnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        taskFirstThirdBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(taskThirdActivity.class);
            }
        });
    }

    //initilize views
    private void initViews() {
        taskFirstSecondActBut = (Button) findViewById(R.id.task_first_second_act_but);
        taskReturnMenu = (Button) findViewById(R.id.task_return_menu_but);
        taskFirstTaskID = (TextView) findViewById(R.id.task_first_taskid);
        taskFirstThirdBut = (Button) findViewById(R.id.task_first_third_act_but);

        taskIDShow(taskFirstActivity.this.getTaskId());
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(taskFirstActivity.this, classname);
        startActivity(intent);
    }

    //show the task id
    private void taskIDShow(int id) {
        taskFirstTaskID.setText(taskFirstTaskID.getText().toString() + String.valueOf(id));
    }
}
