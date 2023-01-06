package com.example.personaldetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import javax.net.ssl.SSLEngineResult;

public class MainActivity extends AppCompatActivity {

    EditText edtFName, edtLName, edtNumber, edtEmail, edtAddress, edt10Percentage, edt12Percentage, edtFPercentage, edt10Pass, edt12Pass, edtCPass, edtExperience, edtFuture;
    CheckBox chkJourney, chkSpeaking, chkWriting, chkC, chkCPlus, chkJava, chkAndroid, chkKotlin, chkPhp, chkHtml, chkCss, chkWeb;
    RadioGroup rgGender, rgStatus;
    AppCompatButton btnSubmit;
    String gender, status, hobby1,hobby2,hobby3,language1,language2,language3,language4,language5,language6,language7,language8,language9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id();
        output();
    }

    private void id() {
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
    }

    private void output() {
        btnSubmit.setOnClickListener(v -> {
            String Firstname = edtFName.getText().toString();
            String Lastname = edtLName.getText().toString();
            String MobileNumber = edtNumber.getText().toString();
            String Email = edtEmail.getText().toString();
            String Address = edtAddress.getText().toString();
            String Experience = edtExperience.getText().toString();
            String Future = edtFuture.getText().toString();
            String Percentage10 = edt10Percentage.getText().toString();
            String Percentage12 = edt12Percentage.getText().toString();
            String PercentageF = edtFPercentage.getText().toString();
            String Pass10 = edt10Pass.getText().toString();
            String Pass12 = edt12Pass.getText().toString();
            String PassF = edtCPass.getText().toString();

            int selectedId = rgGender.getCheckedRadioButtonId();
            RadioButton rb = findViewById(selectedId);
            gender = rb.getText().toString();


            int selectedId1 = rgStatus.getCheckedRadioButtonId();
            RadioButton rb1 = findViewById(selectedId1);
            status = rb1.getText().toString();

            if (chkJourney.isChecked()) {
                hobby1 = chkJourney.getText().toString();
            }
            if (chkSpeaking.isChecked()) {
                hobby2 = chkSpeaking.getText().toString();
            }
            if (chkWriting.isChecked()) {
                hobby3 = chkWriting.getText().toString();
            }


            if (chkC.isChecked()) {
                language1 = chkC.getText().toString();
            }
            if (chkCPlus.isChecked()) {
                language2 = chkCPlus.getText().toString();
            }
            if (chkJava.isChecked()) {
                language3 = chkJava.getText().toString();
            }
            if (chkAndroid.isChecked()) {
                language4 = chkAndroid.getText().toString();
            }
            if (chkKotlin.isChecked()) {
                language5 = chkKotlin.getText().toString();
            }
            if (chkPhp.isChecked()) {
                language6 = chkPhp.getText().toString();
            }
            if (chkHtml.isChecked()) {
                language7 = chkHtml.getText().toString();
            }
            if (chkCss.isChecked()) {
                language8 = chkCss.getText().toString();
            }
            if (chkWeb.isChecked()) {
                language9 = chkWeb.getText().toString();
            }

            Intent i = new Intent(MainActivity.this, Page2.class);
            i.putExtra("First name",Firstname);
            i.putExtra("Last name",Lastname);
            i.putExtra("Mobile Number",MobileNumber);
            i.putExtra("Email",Email);
            i.putExtra("Address",Address);
            i.putExtra("Experience",Experience);
            i.putExtra("Future",Future);
            i.putExtra("Hobby",hobby1);
            i.putExtra("Hobby",hobby2);
            i.putExtra("Hobby",hobby3);
            i.putExtra("Gender",gender);
            i.putExtra("Language",language1);
            i.putExtra("Language",language2);
            i.putExtra("Language",language3);
            i.putExtra("Language",language4);
            i.putExtra("Language",language5);
            i.putExtra("Language",language6);
            i.putExtra("Language",language7);
            i.putExtra("Language",language8);
            i.putExtra("Language",language9);
            i.putExtra("10 Percentage",Percentage10);
            i.putExtra("12 Percentage",Percentage12);
            i.putExtra("Final Percentage",PercentageF);
            i.putExtra("10 Pass year",Pass10);
            i.putExtra("12 Pass year",Pass12);
            i.putExtra("Final Pass year",PassF);

            startActivity(i);
        });
    }

}