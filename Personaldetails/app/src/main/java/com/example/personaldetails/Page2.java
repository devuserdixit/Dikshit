package com.example.personaldetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Page2 extends AppCompatActivity {

    EditText edtFName, edtLName, edtNumber, edtEmail, edtAddress, edt10Percentage, edt12Percentage, edtFPercentage, edt10Pass, edt12Pass, edtCPass, edtExperience, edtFuture;
    CheckBox chkJourney, chkSpeaking, chkWriting, chkC, chkCPlus, chkJava, chkAndroid, chkKotlin, chkPhp, chkHtml, chkCss, chkWeb;
    RadioGroup rgGender, rgStatus;
    AppCompatButton btnSubmit;
    String gender, status, hobby1,hobby2,hobby3,language1,language2,language3,language4,language5,language6,language7,language8,language9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        id();
    }

    private void id()
    {
        edtFName = findViewById(R.id.edtFName);
        edtLName = findViewById(R.id.edtLName);
        edtNumber = findViewById(R.id.edtNumber);
        edtEmail = findViewById(R.id.edtEmail);
        edtAddress = findViewById(R.id.edtAddress);
        edt10Percentage = findViewById(R.id.edt10Percentage);
        edt12Percentage = findViewById(R.id.edt12Percentage);
        edtFPercentage = findViewById(R.id.edtFPercentage);
        edt10Pass = findViewById(R.id.edt10Pass);
        edt12Pass = findViewById(R.id.edt12Pass);
        edtCPass = findViewById(R.id.edtCPass);
        edtExperience = findViewById(R.id.edtExperience);
        edtFuture = findViewById(R.id.edtFuture);
        chkJourney = findViewById(R.id.chkJourney);
        chkSpeaking = findViewById(R.id.chkSpeaking);
        chkWriting = findViewById(R.id.chkWriting);
        chkC = findViewById(R.id.chkC);
        chkCPlus = findViewById(R.id.chkCPlus);
        chkJava = findViewById(R.id.chkJava);
        chkAndroid = findViewById(R.id.chkAndroid);
        chkKotlin = findViewById(R.id.chkKotlin);
        chkPhp = findViewById(R.id.chkPhp);
        chkHtml = findViewById(R.id.chkHtml);
        chkCss = findViewById(R.id.chkCss);
        chkWeb = findViewById(R.id.chkWeb);
        rgGender = findViewById(R.id.rgGender);
        rgStatus = findViewById(R.id.rgStatus);
        btnSubmit = findViewById(R.id.btnSubmit);

        String FirstName=getIntent().getStringExtra("First name");
        String name=getIntent().getStringExtra("Last name");
        String name=getIntent().getStringExtra("Mobile Number");
        String name=getIntent().getStringExtra("Email");
        String name=getIntent().getStringExtra("Address");
        String name=getIntent().getStringExtra("Experience");
        String name=getIntent().getStringExtra("Future");
        String name=getIntent().getStringExtra("Hobby");
        String name=getIntent().getStringExtra("Hobby");
        String name=getIntent().getStringExtra("Hobby");
        String name=getIntent().getStringExtra("Gender");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("Language");
        String name=getIntent().getStringExtra("10 Percentage");
        String name=getIntent().getStringExtra("12 Percentage");
        String name=getIntent().getStringExtra("Final Percentage");
        String name=getIntent().getStringExtra("10 Pass year");
        String name=getIntent().getStringExtra("12 Pass year");
        String name=getIntent().getStringExtra("Final Pass year");

    }
}