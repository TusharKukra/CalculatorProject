package com.naradji.karlecalculate;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnE,btnC,btnP,btnM,btnPP,btnD;

    TextView editText;
    Float value1, value2;
    Boolean ADD,SUB,MUL,DIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText = (TextView) findViewById(R.id.editText);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnP = (Button) findViewById(R.id.btnP);
        btnPP = (Button) findViewById(R.id.btnPP);
        btnM = (Button) findViewById(R.id.btnM);
        btnD = (Button) findViewById(R.id.btnD);
        btnC = (Button) findViewById(R.id.btnC);
        btnE =  (Button)  findViewById(R.id.btnE);
    btn0.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"0");

        }
    });
    btn1.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"1");
        }
    });
    btn2.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"2");

        }
    });
    btn3.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"3");

        }
    });
    btn4.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"4");

        }
    });
    btn5.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"5");

        }
    });
    btn6.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"6");

        }
    });
    btn7.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"7");

        }
    });
    btn8.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"8");

        }
    });
    btn9.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText()+"9");

        }
    });
    btnP.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (editText == null){
                editText.setText("");
            }
            else {
             value1 = Float.parseFloat(editText.getText()+"");
             ADD = true;
             editText.setText(null);
            }

        }
    });
    btnM.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1= Float.parseFloat(editText.getText()+ "");
            SUB =true;
            editText.setText(null);
        }
    });
    btnPP.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1= Float.parseFloat(editText.getText()+ "");
            MUL = true;
            editText.setText(null);

        }
    });
    btnD.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1= Float.parseFloat(editText.getText()+ "");
            DIV = true;
            editText.setText(null);

        }
    });
    btnE.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            value2 = Float.parseFloat(editText.getText()+"");

            if (ADD==true){
                editText.setText(value1+ value2 +"");
                ADD = false;
            }
            if(SUB==true){
                editText.setText(value1 - value2 +"");
                SUB = false;
            }
            if(MUL==true){
                editText.setText(value1 * value2 +"");
                MUL =false;

            }
            if (DIV==true){
                editText.setText(value1/value2 + "");
                DIV = false;

            }
        }
    });
    btnC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editText.setText("");
        }
    });
    }
}
