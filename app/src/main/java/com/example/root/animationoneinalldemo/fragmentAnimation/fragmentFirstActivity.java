package com.example.root.animationoneinalldemo.fragmentAnimation;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.root.animationoneinalldemo.R;

public class fragmentFirstActivity extends AppCompatActivity {

    //fragment
    private FragmentManager manager;
    //private FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_first);
        manager = getSupportFragmentManager();

        addFragment();

        findViewById(R.id.fragment_add_fragment_but).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment();
            }
        });

    }

    private void addFragment() {
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.fragment_open_enter_animation, R.anim.fragment_open_exit_animation,
                                                R.anim.fragment_close_enter_animation, R.anim.fragment_close_exit_animation);
        fragmentTransaction.replace(R.id.fragment_container, new BlankFragment());
        fragmentTransaction.addToBackStack(null); //commit之前哦！
        fragmentTransaction.commit();
    }
}
