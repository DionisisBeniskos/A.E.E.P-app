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

public class Algor5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algor5);
        final EditText S1 = (EditText) findViewById(R.id.s1);
        final EditText S2 = (EditText) findViewById(R.id.s2);
        final EditText S3 = (EditText) findViewById(R.id.s3);
        final EditText S4 = (EditText) findViewById(R.id.s4);
        final EditText S5 = (EditText) findViewById(R.id.s5);
        final EditText S6 = (EditText) findViewById(R.id.s6);
        final EditText S7 = (EditText) findViewById(R.id.s7);
        final EditText S8 = (EditText) findViewById(R.id.s8);
        final EditText S9 = (EditText) findViewById(R.id.s9);
        final EditText S10 = (EditText) findViewById(R.id.s10);
        final EditText S11 = (EditText) findViewById(R.id.s11);
        final EditText S12 = (EditText) findViewById(R.id.s12);
        final EditText S13 = (EditText) findViewById(R.id.s13);

        final EditText A1 = (EditText) findViewById(R.id.a1);
        final EditText A2 = (EditText) findViewById(R.id.a2);
        final EditText A3 = (EditText) findViewById(R.id.a3);
        final EditText A4 = (EditText) findViewById(R.id.a4);
        final EditText A7 = (EditText) findViewById(R.id.a7);
        final EditText A8 = (EditText) findViewById(R.id.a8);


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
                AlertDialog.Builder builder = new AlertDialog.Builder(Algor5.this);

                View view = LayoutInflater.from(Algor5.this).inflate(R.layout.show_image, null);

                TextView title = (TextView) view.findViewById(R.id.title);
                ImageView imageView = (ImageView) view.findViewById(R.id.image);

                imageView.setImageResource(R.drawable.a5);

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


                if (A1.getText().toString().equals("???????????????????? ????????????????????5")) {
                } else {
                    A1.setError("???????????????????? ????????????????????5");
                }
                if (A2.getText().toString().equals(" ?????? j ?????? i+1 ?????????? ??")) {
                } else {
                    A2.setError(" ?????? j ?????? i+1 ?????????? ??");
                }
                if (A3.getText().toString().equals(" ??????????_????????????????????")) {
                } else {
                    A3.setError(" ??????????_????????????????????");
                }
                if (A4.getText().toString().equals("?????? i ?????? 1 ?????????? N")) {
                } else {
                    A4.setError("?????? i ?????? 1 ?????????? N");
                }

                if (A7.getText().toString().equals(" min<-i")) {
                } else {
                    A7.setError(" min<-i");
                }
                if (A8.getText().toString().equals(" a[i]<-a[min]")) {
                } else {
                    A8.setError(" a[i]<-a[min]");
                }

                if (S1.getText().toString().equals("???????????????? //N//")) {
                } else {
                    S1.setError("???????????????? //N//");

                }

                if (S2.getText().toString().equals("?????? i ?????? 1 ?????????? ??-1")) {
                } else {
                    S2.setError("?????? i ?????? 1 ?????????? ??-1");
                }


                if (S4.getText().toString().equals("  ???? a[i]<a[min] ????????")) {
                } else {
                    S4.setError("  ???? a[i]<a[min] ????????");
                }


                if (S5.getText().toString().equals("   min<-j")) {
                } else {
                    S5.setError("   min<-j");
                }


                if (S6.getText().toString().equals("  ??????????_???? ")) {
                } else {
                    S6.setError("  ??????????_???? ");
                }

                if (S7.getText().toString().equals(" temp<-a[i]")) {
                } else {
                    S7.setError(" temp<-a[i]");
                }



                if (S9.getText().toString().equals("??????????_????????????????????")) {
                } else {
                    S9.setError(" a[min]<-temp");
                }
                if (S10.getText().toString().equals("??????????_????????????????????")) {
                } else {
                    S10.setError(" a[min]<-temp");
                }
                if (S11.getText().toString().equals( "???????????????? ??[i]")) {
                } else {
                    S11.setError(" a[min]<-temp");
                }
                if (S12.getText().toString().equals("??????????_????????????????????")) {
                } else {
                    S12.setError("??????????_????????????????????");
                }
                if (S13.getText().toString().equals("?????????? ????????????????????5")) {
                } else {
                    S13.setError("?????????? ????????????????????5");
                }
            }
        });
    }

    public void openNext () {
        Intent intent = new Intent(this, Algor6.class);
        startActivity(intent);
    }


    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(Algor5.this);
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


