package com.example.bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class transfertoug extends AppCompatActivity {
    private EditText inputnorek1;
    private EditText inputnorek2;
    private Button continuebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfertoug);

        inputnorek1 = findViewById(R.id.inputnorek1);
        inputnorek2 = findViewById(R.id.inputnorek2);
        continuebtn = findViewById(R.id.continue4);

        continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accountNumber1 = inputnorek1.getText().toString().trim();
                String accountNumber2 = inputnorek2.getText().toString().trim();
                if (!accountNumber1.isEmpty() || !accountNumber2.isEmpty()) {
                    Intent intent = new Intent(transfertoug.this, transfer.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(transfertoug.this, "Please enter a beneficiary account number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
