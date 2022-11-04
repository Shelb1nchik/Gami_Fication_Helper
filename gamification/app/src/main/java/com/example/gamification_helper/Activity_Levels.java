package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Levels extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        Button GotoMainAct = (Button) findViewById(R.id.GoToMainAct);

        View.OnClickListener oclBtnGotoMainAct = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_Levels.this, MainActivity.class);
                startActivity(intent);

            }
        };

        GotoMainAct.setOnClickListener(oclBtnGotoMainAct);
    }
}