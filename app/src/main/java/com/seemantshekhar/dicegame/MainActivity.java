package com.seemantshekhar.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgDice;
    Button btnGenerate, btnToast, btnNext;
    int choice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDice = findViewById(R.id.imageView_dice);
        btnGenerate = findViewById(R.id.button_generate);
        btnToast = findViewById(R.id.button_toast);
        btnNext = findViewById(R.id.button_next);

        choice = generateRandomNumber();

        imgDice.setImageResource(getImageResource(choice));

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = generateRandomNumber();
                imgDice.setImageResource(getImageResource(choice));
            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Generated no. is " + choice;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity(choice);
            }
        });


    }

    private int generateRandomNumber(){
        return new Random().nextInt(6)+1;
    }

    private int getImageResource(int n){
        switch (n){
            case 1:
                return R.drawable.dice1;
            case 2:
                return R.drawable.dice2;
            case 3:
                return R.drawable.dice3;
            case 4:
                return R.drawable.dice4;
            case 5:
                return R.drawable.dice5;
            case 6:
                return R.drawable.dice6;
            default:
                return R.drawable.dice1;


        }
    }

    private void nextActivity(int n){
        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        intent.putExtra("choice", choice+"");
        startActivity(intent);

    }
}
