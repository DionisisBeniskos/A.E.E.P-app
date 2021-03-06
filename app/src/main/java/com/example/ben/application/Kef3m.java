package com.example.ben.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Kef3m extends AppCompatActivity {

    Button b1, b2, b3, b4;
    TextView questions, scores;
    private QuestionLibrary3 mQuestionLibrary3 = new QuestionLibrary3();
    private QuestionBook3 mQuestionBook3 = new QuestionBook3();

    private int mScore = 0;
    private String mAnswer;
    private ImageView sImageView;
    private int fscore = 0;

    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kef3m);

        Bundle bundle = getIntent().getExtras();
        int slScore = bundle.getInt("finalScore");
        mScore = (slScore + mScore);

        fscore = mQuestionLibrary3.getLength() + mQuestionBook3.getLength();




        sImageView = (ImageView)findViewById(R.id.imageView2);
        b1 = (Button) findViewById(R.id.choice1);
        b2 = (Button) findViewById(R.id.choice2);
        b3 = (Button) findViewById(R.id.choice3);
        b4 = (Button) findViewById(R.id.choice4);
        questions = (TextView) findViewById(R.id.question);
        scores = (TextView) findViewById(R.id.score);

        updateQuestion();
        updateScore(mScore);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(Kef3m.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }else {

                    cAnswer();
                    updateQuestion();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(Kef3m.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }else {
                    cAnswer();
                    updateQuestion();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(Kef3m.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }else {

                    cAnswer();
                    updateQuestion();
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText() == mAnswer) {
                    mScore = (mScore + 1 );
                    updateScore(mScore);
                    Toast.makeText(Kef3m.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }else {

                    cAnswer();
                    updateQuestion();
                }

            }
        });






    }

    private void updateScore(int point) {
        scores.setText("" +mScore);
    }

    private  void updateQuestion() {
        if (mQuestionNumber < mQuestionLibrary3.getLength()) {
            questions.setText(mQuestionLibrary3.getQuestions(mQuestionNumber));
            sImageView.setImageResource(QuestionLibrary3.images[mQuestionNumber]);
            b1.setText(mQuestionLibrary3.getChoice1(mQuestionNumber));
            b2.setText(mQuestionLibrary3.getChoice2(mQuestionNumber));
            b3.setText(mQuestionLibrary3.getChoice3(mQuestionNumber));
            b4.setText(mQuestionLibrary3.getChoice4(mQuestionNumber));
            mAnswer = mQuestionLibrary3.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {

            Intent i = new Intent(Kef3m.this, ResultsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("telikoScore", mScore);
            i.putExtras(bundle);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("gScore", fscore);
            i.putExtras(bundle1);
            startActivity(i);

        }

    }








    private void cAnswer(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Kef3m.this);
        alertDialogBuilder
                .setMessage("?????????? ????????????????:    " + mAnswer )
                .setCancelable(false)
                .setPositiveButton("????",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {

                            }
                        });



        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }



    public void clickExit(View view) {
        askToClose();
    }




    @Override
    public void onBackPressed() {
        askToClose();
    }



    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(Kef3m.this);
        builder.setMessage("Are you sure you want to quit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}


