package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    TextView tvShow;
    EditText edtName, edtRoll, edtEmail, edtUniversity, edtPresentAddress, edtPermanentAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        tvShow = findViewById(R.id.tvShow);

        edtName = findViewById(R.id.edtName);
        edtRoll = findViewById(R.id.edtRoll);
        edtEmail = findViewById(R.id.edtEmail);
        edtUniversity = findViewById(R.id.edtUniversity);
        edtPresentAddress = findViewById(R.id.edtPresentAddress);
        edtPermanentAddress = findViewById(R.id.edtPermanentAddress);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sh = "Name: " + (edtName.getText().toString().trim()) +
                        "\nRoll: " + (edtRoll.getText().toString().trim()) +
                        "\nEmail " + (edtEmail.getText().toString().trim()) +
                        "\nUniversity: " + (edtUniversity.getText().toString().trim()) +
                        "\nPresent Address: " + (edtPresentAddress.getText().toString().trim()) +
                        "\nPermanent Address: " + (edtPermanentAddress.getText().toString().trim());
                tvShow.setText(sh);
            }
        });

    }
}