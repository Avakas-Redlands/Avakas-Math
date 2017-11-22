package com.quaap.primary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.quaap.primary.base.CommonBaseActivity;

import static com.quaap.primary.R.id.easyButton;

/**
 * Created by John on 11/3/2017.
 */

public class HomeActivity extends CommonBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home);

        Button btnGo = (Button) findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseDifficulty();
            }
        });
    }

    private void chooseDifficulty() {
        Intent intent = new Intent(HomeActivity.this, DifficultyActivity.class);
        startActivity(intent);
    }
}
