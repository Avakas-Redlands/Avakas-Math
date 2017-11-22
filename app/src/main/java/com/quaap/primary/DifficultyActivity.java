package com.quaap.primary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.quaap.primary.base.CommonBaseActivity;

/**
 * Created by John on 11/3/2017.
 */

public class DifficultyActivity extends CommonBaseActivity {

    private static final String LEVELTYPECODE = "leveltypecode";
    public static String difficultyLevel = "EASY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_difficulty);

        Button easyButton = (Button) findViewById(R.id.easyButton);
        Button normalButton = (Button) findViewById(R.id.normalButton);
        Button hardButton = (Button) findViewById(R.id.hardButton);
        Button expertButton = (Button) findViewById(R.id.expertButton);

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startEasyLevel();
            }
        });

        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNormalLevel();
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHardLevel();
            }
        });

        expertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startExpertLevel();
            }
        });
    }

    private void startEasyLevel() {

        difficultyLevel = "EASY";
        Intent intent = new Intent(DifficultyActivity.this, MainActivity.class);
        intent.putExtra(LEVELTYPECODE, "easy");

        startActivity(intent);
    }

    private void startNormalLevel() {

        difficultyLevel = "NORMAL";
        Intent intent = new Intent(DifficultyActivity.this, MainActivity.class);
        intent.putExtra(LEVELTYPECODE, "normal");

        startActivity(intent);
    }

    private void startHardLevel() {

        difficultyLevel = "HARD";
        Intent intent = new Intent(DifficultyActivity.this, MainActivity.class);
        intent.putExtra(LEVELTYPECODE, "hard");

        startActivity(intent);
    }

    private void startExpertLevel() {

        difficultyLevel = "EXPERT";
        Intent intent = new Intent(DifficultyActivity.this, MainActivity.class);
        intent.putExtra(LEVELTYPECODE, "expert");

        startActivity(intent);
    }
}
