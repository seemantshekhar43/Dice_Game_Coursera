package com.seemantshekhar.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView textView_choice;
    Button btn_previous;
    String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        if(getIntent().getExtras() != null){
            choice = getIntent().getExtras().getString("choice");
        }

        textView_choice = findViewById(R.id.textView_choice);
        btn_previous = findViewById(R.id.button_previous);

        textView_choice.setText(choice);
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
