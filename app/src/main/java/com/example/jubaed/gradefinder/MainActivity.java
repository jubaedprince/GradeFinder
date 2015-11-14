package com.example.jubaed.gradefinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView outputView;
    Button getGradeButton;
    EditText inputField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputView = (TextView) findViewById(R.id.outputView);
        getGradeButton = (Button) findViewById(R.id.getGradeButton);
        inputField = (EditText) findViewById(R.id.inputField);
    }

    public void getGrade(View view){
        int mark = Integer.parseInt(inputField.getText().toString());

        if(mark>100 || mark<0){
            outputView.setText("Invalid Mark");
            inputField.setText("");
        }else if(mark>=90){
            outputView.setText("A");
            inputField.setText("");
        }else if(mark>=85){
            outputView.setText("A-");
            inputField.setText("");
        }
        else if(mark>=80){
            outputView.setText("B+");
            inputField.setText("");
        }
        else if(mark>=75){
            outputView.setText("B");
            inputField.setText("");
        }
        else if(mark>=70){
            outputView.setText("B-");
            inputField.setText("");
        }
        else if(mark>=65){
            outputView.setText("C+");
            inputField.setText("");
        }
        else if(mark>=60){
            outputView.setText("C");
            inputField.setText("");
        }
        else if(mark>=57){
            outputView.setText("C-");
            inputField.setText("");
        }
        else if(mark>=55){
            outputView.setText("D+");
            inputField.setText("");
        }
        else if(mark>=52){
            outputView.setText("D");
            inputField.setText("");
        }
        else if(mark>=50){
            outputView.setText("D-");
            inputField.setText("");
        }
        else{
            outputView.setText("F");
            inputField.setText("");
        }
    }
}
