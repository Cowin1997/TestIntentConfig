package com.example.admin.testintentconfig;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button=new Button(this);
        button.setText("Activity2");
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.addView(button);
        setContentView(linearLayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("ActionTest");
                intent.addCategory("Category");
                intent.addCategory("Category1");
                startActivity(intent);
            }
        });
    }
}
