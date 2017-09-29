package com.example.hsport.assingment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    public static int score = 0;
    public static int count = 0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);








       Questions qstn = new Questions();
        final TextView q = (TextView) findViewById(R.id.qtext);
        final String ans = qstn.getAnswer();
        q.setText(qstn.getQuestion());
        Button restart = (Button) findViewById(R.id.btn1);
        restart.setVisibility(View.INVISIBLE);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Quiz.this,MainActivity.class);
                startActivity(i1);
            }
        });
//*****************************************************************
        Button op1 = (Button) findViewById(R.id.opA);

        op1.setText(qstn.getOptionA());
        op1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans.equals("oA")){


                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",1);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }
                else {

                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",0);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }
            }
        });

//******************************************************************
        Button op2 = (Button) findViewById(R.id.opB);
        op2.setText(qstn.getOptionB());
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans.equals("oB")){


                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",1);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }
                else {

                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",0);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }

            }
        });
//*******************************************************************
        Button op3 = (Button) findViewById(R.id.opC);
        op3.setText(qstn.getOptionC());
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans.equals("oC")){


                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",1);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }
                else {

                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",0);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }

            }
        });
        Button op4 = (Button) findViewById(R.id.opD);
        op4.setText(qstn.getOptionD());
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans.equals("oD")){


                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",1);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }
                else {

                    Intent intn = new Intent(Quiz.this, Quiz.class);
                    intn.putExtra("result",0);
                    intn.putExtra("qucount",1);
                    startActivity(intn);
                }

            }
        });


        Intent intent = getIntent();
        score+= intent.getIntExtra("result",0);

        count+= intent.getIntExtra("qucount",0);
        if(count == 5){

            count = 0;
            qstn.clearRandomnum();
            op2.setVisibility(View.INVISIBLE);
            op3.setVisibility(View.INVISIBLE);
            op4.setVisibility(View.INVISIBLE);
            if(score == 0 || score <3){


                q.setText("Score =  "+ score +"\nPlease try again" );
                op1.setText("RETRY!!!");
                score=0;

            }
            else if(score==3){


                q.setText("You have scored "+ score +"\nGood Job!!");
                op1.setVisibility(View.INVISIBLE);
                restart.setVisibility(View.VISIBLE);
                score = 0;
            }
            else if(score==4){

                q.setText("Your score is "+ score +"\nExcellent work!");
                op1.setVisibility(View.INVISIBLE);
                restart.setVisibility(View.VISIBLE);
                score = 0;

            }
            else{

                q.setText("Your score is "+ score +"\nYou are a genius");
                op1.setVisibility(View.INVISIBLE);
                restart.setVisibility(View.VISIBLE);
                score = 0 ;

            }
        }

    }


}
