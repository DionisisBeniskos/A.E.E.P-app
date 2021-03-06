package com.example.ben.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Progr3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progr3);

        final EditText S1 = (EditText) findViewById(R.id.s1);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S3 = (EditText) findViewById(R.id.s3);
        final EditText S4 = (EditText) findViewById(R.id.s4);
        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText A7 = (EditText) findViewById(R.id.a7);
        final EditText A8 = (EditText) findViewById(R.id.a8);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText S10 = (EditText) findViewById(R.id.s10);
        final EditText S11 = (EditText) findViewById(R.id.s11);
        final EditText S12 = (EditText) findViewById(R.id.s12);
        final EditText S13 = (EditText) findViewById(R.id.s13);
        final EditText S14 = (EditText) findViewById(R.id.s14);
        final EditText S15 = (EditText) findViewById(R.id.s15);
        final EditText S16 = (EditText) findViewById(R.id.s16);

        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);

        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A5 = (EditText) findViewById(R.id.a5);
        final EditText A6 = (EditText) findViewById(R.id.a6);

        Button B1 = (Button) findViewById(R.id.config);
        Button B2 = (Button) findViewById(R.id.show);
        Button B3 = (Button) findViewById(R.id.next);

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext();

            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Progr3.this);

                View view = LayoutInflater.from(Progr3.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.p3);

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setView(view);
                builder.show();

            }
        });


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A1.getText().toString().equals("?????????????????? ??3")) {
                } else {
                    A1.setError("?????????????????? ??3");

                }

                if (A2.getText().toString().equals("????????????????????")) {
                } else {
                    A2.setError("????????????????????");
                }

                if (S1.getText().toString().equals("??????????????????????")) {
                } else {
                    S1.setError("?????? i ?????? 1 ?????????? 10");
                }

                if (S2.getText().toString().equals("?????? i ?????? 1 ?????????? 10")) {
                } else {
                    S2.setError("?????? i ?????? 1 ?????????? 10");
                }

                if (S3.getText().toString().equals("?????????????? ??????????????")) {
                } else {
                    S3.setError("?????????????? ??????????????");
                }
                if (S4.getText().toString().equals("??{i]<-??????????????")) {
                } else {
                    S4.setError("??[i]<-??????????????");
                }

                if (S5.getText().toString().equals("????????_????????????????????")) {
                } else {
                    S5.setError("??????????_????????????????????");
                }


                if (A4.getText().toString().equals("????????")) {
                } else {
                    A4.setError("????????");
                }

                if (A5.getText().toString().equals("?????????? '???????? ????????????'")) {
                } else {
                    A5.setError("?????????? '???????? ????????????'");
                }

                if (A6.getText().toString().equals("??????????_????????????????????????")) {
                } else {
                    A6.setError("??????????_????????????????????????");
                }

                if (A7.getText().toString().equals("min<-??[1]")) {
                } else {
                    A7.setError("min<-??[1]");
                }


                if (A8.getText().toString().equals("max<-??[1]")) {
                } else {
                    A8.setError("max<-??[1]");
                }

                if (S8.getText().toString().equals("?????? i ?????? 1 ?????????? 10")) {
                } else {
                    S8.setError("?????? i ?????? 1 ?????????? 10");
                }

                if (S9.getText().toString().equals("???? ??[i]<min ????????")) {
                } else {
                    S9.setError("???? ??[i]<min ????????");
                }

                if (S10.getText().toString().equals("min<-??[i]")) {
                } else {
                    S10.setError("min<-??[i]");
                }

                if (S11.getText().toString().equals("??????????_????")) {
                } else {
                    S11.setError("??????????_????");
                }

                if (S12.getText().toString().equals("???? ??[i]>max ????????")) {
                } else {
                    S12.setError("???? ??[i]>max ????????");
                }

                if (S13.getText().toString().equals("max<-??[i]")) {
                } else {
                    S13.setError("max<-??[i]");
                }

                if (S14.getText().toString().equals("??????????_????")) {
                } else {
                    S14.setError("??????????_????");
                }

                if (S15.getText().toString().equals("??????????_????????????????????")) {
                } else {
                    S15.setError("??????????_????????????????????");
                }

                if (S16.getText().toString().equals("?????????? min,max")) {
                } else {
                    S16.setError("?????????? min,max");
                }


            }

        });

    }
    public void openNext () {
        Intent intent = new Intent(this, Progr3.class);
        startActivity(intent);
    }




}






