package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Achievments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievments);

        Button GotoMainAct2 = (Button) findViewById(R.id.GoToMainAct2);

        View.OnClickListener oclBtnGotoMainAct2 = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_Achievments.this, MainActivity.class);
                startActivity(intent);

            }
        };

        GotoMainAct2.setOnClickListener(oclBtnGotoMainAct2);
    }
}