package com.example.prakweek_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private TextView home_Username,home_Password,home_Gender,home_Phonenumber, home_Country;
    private Button home_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home_Username = findViewById(R.id.home_username);
        home_Password = findViewById(R.id.home_password);
        home_Phonenumber = findViewById(R.id.home_phonenumber);
        home_Country = findViewById(R.id.home_country);
        home_Gender = findViewById(R.id.home_gender);

        home_Username.setText("Username : "+getIntent().getStringExtra("Name"));
        home_Password.setText("Password : "+getIntent().getStringExtra("Password"));
        home_Phonenumber.setText("Phone Number : "+getIntent().getStringExtra("Phonenumber"));
        home_Country.setText("Country : "+getIntent().getStringExtra("Country"));
        home_Gender.setText("Gender : "+getIntent().getStringExtra("Gender"));

        home_button = findViewById(R.id.Back_Button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_button = findViewById(R.id.Back_Button);
                Toast.makeText(HomeActivity.this, "Back to Register", Toast.LENGTH_SHORT).show();
                Intent intent_toRegister = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent_toRegister);
            }
        });
    }
}
