package com.compet.bpdiaryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingGoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_goal);

        ImageView imageButton = (ImageView)findViewById(R.id.btn_navi_back);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("목표설정");
    }
}