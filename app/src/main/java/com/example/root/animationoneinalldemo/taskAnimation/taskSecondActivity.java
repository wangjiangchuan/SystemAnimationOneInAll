package com.example.root.animationoneinalldemo.taskAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.root.animationoneinalldemo.R;

public class taskSecondActivity extends AppCompatActivity {

    //views
    private Button taskSecondFirstActBut;

    //task info
    private TextView taskSecondTaskID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_second);

        initViews();

        taskSecondFirstActBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //butClick(taskFirstActivity.class);
                finish();
            }
        });
    }

    //initilize views
    private void initViews() {
        taskSecondFirstActBut = (Button) findViewById(R.id.task_second_first_act_but);
        taskSecondTaskID = (TextView) findViewById(R.id.task_second_taskid);

        taskIDShow(taskSecondActivity.this.getTaskId());
    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(taskSecondActivity.this, classname);
        startActivity(intent);
    }

    //show the task id
    private void taskIDShow(int id) {
        taskSecondTaskID.setText(taskSecondTaskID.getText().toString() + String.valueOf(id));
    }
}
