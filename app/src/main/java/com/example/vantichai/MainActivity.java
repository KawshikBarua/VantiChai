package com.example.vantichai;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String amount="";
    private TextView num500,num100,num50,num20,num10,num5,num2,num1,amountLabel;
    private int require500;
    private int require100;
    private int require50;
    private int require20;
    private int require10;
    private int require5;
    private int require2;
    private int require1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button clear = findViewById(R.id.buttonClear);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num5=findViewById(R.id.num5);
        num10=findViewById(R.id.num10);
        num20=findViewById(R.id.num20);
        num50=findViewById(R.id.num50);
        num100=findViewById(R.id.num100);
        num500=findViewById(R.id.num500);
        amountLabel = findViewById(R.id.textView15);

        button0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               resetRequiredNotes();
               changeAmount("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               resetRequiredNotes();
               changeAmount("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               resetRequiredNotes();
               changeAmount("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetRequiredNotes();
                changeAmount("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetRequiredNotes();
                changeAmount("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetRequiredNotes();
                changeAmount("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetRequiredNotes();
                changeAmount("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               resetRequiredNotes();
               changeAmount("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetRequiredNotes();
                changeAmount("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                resetRequiredNotes();
                changeAmount("9");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearFunction();
            }
        });
    }

    void resetRequiredNotes(){
        require1=0;
        require2=0;
        require5=0;
        require10=0;
        require20=0;
        require50=0;
        require100=0;
        require500=0;
        num1.setText("0");
        num2.setText("0");
        num5.setText("0");
        num10.setText("0");
        num20.setText("0");
        num50.setText("0");
        num100.setText("0");
        num500.setText("0");
    }

    void clearFunction(){
        amount="";
        resetRequiredNotes();
        amountLabel.setText(amount);
    }

    void changeAmount(String num){
        amount = amount.concat(num);
        requiredNote();
        amountLabel.setText(amount);
    }

    void requiredNote(){
        int currentAmount = Integer.parseInt(amount);
        while(currentAmount!=0){
            if(currentAmount>=500){
                num500.setText(Integer.toString(++require500));
                currentAmount-=500;
                if(currentAmount>=500){
                    continue;
                }
            }
            if(currentAmount>=100){
                num100.setText(Integer.toString(++require100));
                currentAmount-=100;
                if(currentAmount>=100){
                    continue;
                }
            }
            if(currentAmount>=50){
                num50.setText(Integer.toString(++require50));
                currentAmount-=50;
                if(currentAmount>=50){
                    continue;
                }
            }
            if(currentAmount>=20){
                num20.setText(Integer.toString(++require20));
                currentAmount-=20;
                if(currentAmount>=20){
                    continue;
                }
            }
            if(currentAmount>=10){
                num10.setText(Integer.toString(++require10));
                currentAmount-=10;
                if(currentAmount>=10){
                    continue;
                }
            }
            if(currentAmount>=5){
                num5.setText(Integer.toString(++require5));
                currentAmount-=5;
                if(currentAmount>=5){
                    continue;
                }
            }
            if(currentAmount>=2){
                num2.setText(Integer.toString(++require2));
                currentAmount-=2;
                if(currentAmount>=2){
                    continue;
                }
            }
            if(currentAmount>=1){
                num1.setText(Integer.toString(++require1));
                currentAmount-=1;
            }
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("save500",require500);
        outState.putInt("save100",require100);
        outState.putInt("save50",require50);
        outState.putInt("save20",require20);
        outState.putInt("save10",require10);
        outState.putInt("save5",require5);
        outState.putInt("save2",require2);
        outState.putInt("save1",require1);
        outState.putString("saveAmount",amount);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        require500 = savedInstanceState.getInt("save500");
        require100 = savedInstanceState.getInt("save100");
        require50 = savedInstanceState.getInt("save50");
        require20 = savedInstanceState.getInt("save20");
        require10 = savedInstanceState.getInt("save10");
        require5 = savedInstanceState.getInt("save5");
        require2 = savedInstanceState.getInt("save2");
        require1 = savedInstanceState.getInt("save1");
        amount = savedInstanceState.getString("saveAmount");
        amountLabel.setText(amount);
        num500.setText(Integer.toString(require500));
        num100.setText(Integer.toString(require100));
        num50.setText(Integer.toString(require50));
        num20.setText(Integer.toString(require20));
        num10.setText(Integer.toString(require10));
        num5.setText(Integer.toString(require5));
        num2.setText(Integer.toString(require2));
        num1.setText(Integer.toString(require1));
    }
}
