package com.example.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button showName;
    private TextView textVar;
    private EditText nameEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showName=findViewById(R.id.button);
        textVar=findViewById(R.id.textView);
        nameEnter=findViewById(R.id.editTextName);

        showName.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name =nameEnter.getText().toString();
                        if(name.isEmpty()){
                            textVar.setText("Welcome Back , Bond !");
                        }
                        else{
                            textVar.setText("Welcome Back , "+name+" !");
                        }

                    }
                }
        );
    }
}