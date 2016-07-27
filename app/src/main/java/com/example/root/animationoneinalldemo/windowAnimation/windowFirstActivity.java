package com.example.root.animationoneinalldemo.windowAnimation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.root.animationoneinalldemo.R;

public class windowFirstActivity extends AppCompatActivity {

    //views
    private Button windowFirstNewWind;
    private Button windowReturnMenu;
    private Button windowReturnHome;

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_first);

        initViews();

        windowFirstNewWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newDialog();
            }
        });

        windowReturnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
            }
        });

        windowReturnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //initilize views
    private void initViews() {
        windowFirstNewWind = (Button) findViewById(R.id.window_first_new_window);
        windowReturnMenu = (Button) findViewById(R.id.window_return_menu_but);
        windowReturnHome = (Button) findViewById(R.id.window_return_home_but);

    }

    //button click events
    private void butClick(Class classname) {
        Intent intent = new Intent(windowFirstActivity.this, classname);
        startActivity(intent);
    }

    private void Dialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_layout);
        dialog.create();
        dialog.getWindow().setWindowAnimations(R.style.windowFirstAnimation);

        (dialog.findViewById(R.id.dialog_hide)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == true) {
                    windowFirstActivity.this.setVisible(false);
                    flag = false;
                } else  {
                    windowFirstActivity.this.setVisible(true);
                    flag = true;
                }

            }
        });
        dialog.show();
    }

    private void newDialog() {
        AlertDialog.Builder builder =new AlertDialog.Builder(windowFirstActivity.this);
        builder.setMessage("This is a Dialog");
        builder.setTitle("Dialog");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        final Dialog dia = builder.create();
        dia.getWindow().setWindowAnimations(R.style.dialogAnimation);
        dia.show();
    }
}
