package com.example.gamification_helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button GotoLevels = (Button) findViewById(R.id.GoToLevels);

        View.OnClickListener oclBtnGotoLevels = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Activity_Levels.class);
                startActivity(intent);

            }
        };

        GotoLevels.setOnClickListener(oclBtnGotoLevels);

        Button GotoAchievments = (Button) findViewById(R.id.GoToAchievments);

        View.OnClickListener oclBtnGotoAchievments = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Activity_Achievments.class);
                startActivity(intent);

            }
        };

        GotoAchievments.setOnClickListener(oclBtnGotoAchievments);

        Button GotoSettings = (Button) findViewById(R.id.GoToSettings);

        View.OnClickListener oclBtnGotoSettings = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Activity_Settings.class);
                startActivity(intent);

            }
        };

        GotoSettings.setOnClickListener(oclBtnGotoSettings);


        Button GotoRegister = (Button) findViewById(R.id.GoToRegister);

        View.OnClickListener oclBtnGotoRegister = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Register_Activity.class);
                startActivity(intent);

            }
        };

        GotoRegister.setOnClickListener(oclBtnGotoRegister);
    }
}