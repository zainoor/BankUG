package com.example.bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class transfer extends AppCompatActivity {
    private EditText amountEditText;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transfer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        amountEditText = findViewById(R.id.editTextNumber);
        continueButton = findViewById(R.id.buttontopin);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = amountEditText.getText().toString().trim();
                if (!amount.isEmpty()) {
                    // Move to the next activity (pin activity)
                    Intent intent = new Intent(transfer.this, confrimation.class);
                    startActivity(intent);
                } else {
                    // Show a toast message indicating that amount is required
                    Toast.makeText(transfer.this, "Please enter an amount", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
