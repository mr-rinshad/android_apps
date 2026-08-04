package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, subtract, multiply, divide;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        result = findViewById(R.id.result);

        add.setOnClickListener(v -> calculate('+'));
        subtract.setOnClickListener(v -> calculate('-'));
        multiply.setOnClickListener(v -> calculate('*'));
        divide.setOnClickListener(v -> calculate('/'));
    }

    private void calculate(char operator) {

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());
        double answer = 0;

        switch (operator) {
            case '+':
                answer = a + b;
                break;

            case '-':
                answer = a - b;
                break;

            case '*':
                answer = a * b;
                break;

            case '/':
                if (b != 0) {
                    answer = a / b;
                } else {
                    result.setText("Cannot divide by zero");
                    return;
                }
                break;
        }

        result.setText("Result: " + answer);
    }
}