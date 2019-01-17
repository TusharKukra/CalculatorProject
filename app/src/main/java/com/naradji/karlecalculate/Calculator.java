package com.example.tk.simplcalculatr;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,sub,prod,divide,clear,equal,one,two,three,four,five,six,seven,eight,nine,zero;
    TextView tvResult;
    Float value1, value2;
    Boolean SUM,MIN,MUL,DIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult= (TextView)findViewById(R.id.tvResult);
        add= (Button) findViewById(R.id.add);
        sub= (Button) findViewById(R.id.sub);
        prod= (Button) findViewById(R.id.prod);
        divide= (Button)findViewById(R.id.divide);
        one=(Button)findViewById(R.id.one);
        two= (Button)findViewById(R.id.two);
        three= (Button)findViewById(R.id.three);
        four= (Button)findViewById(R.id.four);
        five= (Button)findViewById(R.id.five);
        six= (Button)findViewById(R.id.six);
        seven= (Button) findViewById(R.id.seven);
        eight= (Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        clear=(Button)findViewById(R.id.clear);
        equal=(Button)findViewById(R.id.equal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult == null) {
                    tvResult.setText("");
                } else
                    value1 = Float.parseFloat(tvResult.getText() + "");
                SUM = true;
                tvResult.setText(null);


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(tvResult.getText()+" ");
                MIN=true;
                tvResult.setText(null);
            }
        });
        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(tvResult.getText()+" ");
                MUL=true;
                tvResult.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(tvResult.getText()+" ");
                DIV=true;
                tvResult.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2=Float.parseFloat(tvResult.getText()+" ");
                if (SUM==(Boolean)true){
                    tvResult.setText(value1+value2+ " ");
                    SUM=false;
                }
                if (MIN==(Boolean)true){
                    tvResult.setText(value1-value2+" ");
                    MIN=false;
                }
                if (MUL==(Boolean)true){
                    tvResult.setText(value1*value2+ " ");
                    MUL=false;
                }
                if (DIV==(Boolean)true){
                    tvResult.setText(value1/value2+"");
                    DIV=false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
            }
        });
    }

}
