package com.aarongreen.mysoccerlive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;



public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcomeView = (TextView) findViewById(R.id.welcomeTextField);
        welcomeView.setText("Welcome to MySoccerLive!");

        Button scoresActivityButton = (Button) findViewById(R.id.scoresActivityButton);
        scoresActivityButton.setText("Click to See BPL Scores");
        scoresActivityButton.setOnClickListener(this);

    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.scoresActivityButton:
                Intent intent = new Intent(getApplicationContext(), ScoresActivity.class);
                startActivity(intent);
            default: break;
        }
    }
}