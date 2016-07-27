package com.example.root.animationoneinalldemo.taskAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.root.animationoneinalldemo.R;

public class taskThirdActivity extends AppCompatActivity {

    //task info
    private TextView taskThirdTaskID;

    //button
    private Button taskThirdBringFront;
    private Button taskThirdBringBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_third);

        initViews();

        taskThirdBringFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(taskFirstActivity.class);
            }
        });

        taskThirdBringBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }

    //initilize views
    private void initViews() {

        taskThirdTaskID = (TextView) findViewById(R.id.task_third_taskid);
        taskThirdBringFront = (Button) findViewById(R.id.task_third_taskfront_but);
        taskThirdBringBack = (Button) findViewById(R.id.task_third_taskback_but);

        taskIDShow(taskThirdActivity.this.getTaskId());
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(taskThirdActivity.this, classname);
        startActivity(intent);
    }

    //show the task id
    private void taskIDShow(int id) {
        taskThirdTaskID.setText(taskThirdTaskID.getText().toString() + String.valueOf(id));
    }
}
