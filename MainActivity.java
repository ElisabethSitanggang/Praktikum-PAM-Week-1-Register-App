package com.example.prakweek_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private Button mregistButton;
    private String mStringUsername,mStringPassword,mStringCountry, mStringGender,mStringPhonenumber;
    private EditText mUsername,mPassword, mCountry,mPhoneNumber, mGender ;
    public static final String Name = "Name";
    public static final String Password = "Password";
    public static final String PhoneNumber = "Phonenumber";
    public static final String Coutntry = "Country";
    public static final String Gender = "Gender";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsername = findViewById(R.id.Username_EditText);
        mPassword = findViewById(R.id.Password_EditText);
        mPhoneNumber = findViewById(R.id.PhoneNumber_EditText);
        mCountry = findViewById(R.id.Country_EditText);
        mGender = findViewById(R.id.Gender_EditText);
        mregistButton = findViewById(R.id.Register_Button);
        mregistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStringUsername = mUsername.getText().toString();
                mStringPassword = mPassword.getText().toString();
                mStringPhonenumber = mPhoneNumber.getText().toString();
                mStringCountry = mCountry.getText().toString();
                mStringGender = mGender.getText().toString();
                Toast.makeText(MainActivity.this, "Your Register is Success", Toast.LENGTH_SHORT).show();
                Intent intent_toHome = new Intent(MainActivity.this, HomeActivity.class);
                intent_toHome.putExtra("Name", mStringUsername);
                intent_toHome.putExtra("Password", mStringPassword);
                intent_toHome.putExtra("Phonenumber", mStringPhonenumber);
                intent_toHome.putExtra("Country", mStringCountry);
                intent_toHome.putExtra("Gender", mStringGender);
                startActivity(intent_toHome);
            }
        });
    }
}
