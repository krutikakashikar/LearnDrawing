package com.example.learndrawing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedBack extends AppCompatActivity {
    DatabaseHelper db;
    EditText FirstName;
    EditText MiddleNamme;
    EditText LastName;
    EditText EmailId;
    EditText PhoneNo;
    EditText Message;
    Button B1, C1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        db = new DatabaseHelper(this);
        getSupportActionBar().setTitle("Feedback Form");
        FirstName = (EditText) findViewById(R.id.FN1);
        MiddleNamme = (EditText) findViewById(R.id.MN1);
        LastName = (EditText) findViewById(R.id.LN1);
        EmailId = (EditText) findViewById(R.id.EI1);
        PhoneNo = (EditText) findViewById(R.id.PN1);
        Message = (EditText) findViewById(R.id.MSG1);
        B1 = (Button) findViewById(R.id.Submit);
        C1=(Button) findViewById(R.id.Cancel);
                B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String FN = FirstName.getEditableText().toString();
                String MN = MiddleNamme.getEditableText().toString();
                String LN = LastName.getEditableText().toString();
                String EI = EmailId.getEditableText().toString();
                String PN = PhoneNo.getEditableText().toString();
                String MSG = Message.getEditableText().toString();


                long val = db.addUser(FN, MN, LN, EI, PN, MSG);
                if (val > 0) {
                    Toast.makeText(FeedBack.this, "You Have Feedback", Toast.LENGTH_SHORT);
                    Intent ob = new Intent(FeedBack.this, Rating.class);
                    startActivity(ob);
                } else {
                    Toast.makeText(FeedBack.this, "You Have Not Feddback", Toast.LENGTH_SHORT);

                }

            }

        });
                C1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob = new Intent(FeedBack.this, Rating.class);
                        startActivity(ob);
                    }
                });

    }







}






