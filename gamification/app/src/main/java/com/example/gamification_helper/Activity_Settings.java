package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button GotoMainAct3 = (Button) findViewById(R.id.GoToMainAct3);

        View.OnClickListener oclBtnGotoMainAct3 = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_Settings.this, MainActivity.class);
                startActivity(intent);

            }
        };

        GotoMainAct3.setOnClickListener(oclBtnGotoMainAct3);
    }
}