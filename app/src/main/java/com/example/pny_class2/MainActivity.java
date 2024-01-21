package com.example.pny_class2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private EditText entry;
    private Button button;
    private RadioGroup RD1;
    private RadioButton radioButton1, radioButton2;
    private CheckBox checkBox;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        entry = findViewById(R.id.entry);
        button=findViewById(R.id.button);
        RD1 = findViewById(R.id .RD1);
        radioButton1=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        checkBox = findViewById(R.id.checkBox);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name= entry.getText().toString();
                textView.setText("Your name is "+ Name);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}