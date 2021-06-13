package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;
    ImageView celebrity1;

    private Celebrity celebrity=new Celebrity();
    private String answer;
    private int celebrityLength =celebrity.celebrities.length;
    Random random;
    private int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        //find views by ids
        celebrity1=(ImageView) findViewById(R.id.imageView);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);

        //set on click listener per button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "You Are Correct, Your scrore is " + score, Toast.LENGTH_SHORT).show();
                    NextCelebrity(random.nextInt(celebrityLength));
                }
                else
                    Toast.makeText(MainActivity.this, "Wrong, Try again", Toast.LENGTH_SHORT).show();
                    NextCelebrity(random.nextInt(celebrityLength));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "You Are Correct, Your scrore is " + score, Toast.LENGTH_SHORT).show();
                    NextCelebrity(random.nextInt(celebrityLength));
                }
                else
                    Toast.makeText(MainActivity.this, "Wrong, Try again", Toast.LENGTH_SHORT).show();
                    NextCelebrity(random.nextInt(celebrityLength));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "You Are Correct, Your scrore is " + score, Toast.LENGTH_SHORT).show();
                    NextCelebrity(random.nextInt(celebrityLength));
                }
                else
                    Toast.makeText(MainActivity.this, "Wrong, Try again", Toast.LENGTH_SHORT).show();
                    NextCelebrity(random.nextInt(celebrityLength));
            }
        });

        NextCelebrity(random.nextInt(celebrityLength)); //method to move to next celebrity
    }

    private void NextCelebrity(int num){
        celebrity1.setImageResource(celebrity.getCelebrity(num));

        button1.setText(celebrity.getoption1(num));
        button2.setText(celebrity.getoption2(num));
        button3.setText(celebrity.getoption3(num));

        answer = celebrity.getCorrectAnswer(num);
    }

}