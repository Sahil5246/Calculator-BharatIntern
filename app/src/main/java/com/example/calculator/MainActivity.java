package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAdd, buttonSub,buttonMul,buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd= findViewById(R.id.addition);
        buttonSub = findViewById(R.id.subtraction);
        buttonMul=findViewById(R.id.multiplication);
        buttonDiv = findViewById(R.id.division);
        editTextN1=findViewById(R.id.editTextTextPersonName);
        editTextN2=findViewById(R.id.editTextTextPersonName2);
        textView=findViewById(R.id.ans);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);



    }
    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
            return 0;

        }else
            return Integer.parseInt(editText.getText().toString());
    }


    @Override
    public void onClick(View view) {
        num1=getIntFromEditText(editTextN1);
        num2=getIntFromEditText(editTextN2);
        int id = view.getId();
        if (id == R.id.addition) {
            textView.setText("Answer=" + (num1 + num2));
        } else if (id == R.id.subtraction) {
            textView.setText("Answer=" + (num1 - num2));
        } else if (id == R.id.multiplication) {
            textView.setText("Answer=" + (num1 * num2));
        } else if (id == R.id.division) {
            textView.setText("Answer=" + ((float) num1 / (float) num2));
        } else {
            textView.setText("Thank you");
        }

    }
}