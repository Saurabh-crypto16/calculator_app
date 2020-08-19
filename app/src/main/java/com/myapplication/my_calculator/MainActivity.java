package com.myapplication.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnZero,btnDot,btnAdd,btnSub,btnMul,btnClr,btnDiv,btnEqual;
    EditText edt;
    float res1,res2;
    boolean add,subs,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        Button btn3=findViewById(R.id.btn3);
        Button btn4=findViewById(R.id.btn4);
        Button btn5=findViewById(R.id.btn5);
        Button btn6=findViewById(R.id.btn6);
        Button btn7=findViewById(R.id.btn7);
        Button btn8=findViewById(R.id.btn8);
        Button btn9=findViewById(R.id.btn9);
        Button btnZero=findViewById(R.id.btnZero);
        Button btnAdd=findViewById(R.id.btnAdd);
        Button btnSub=findViewById(R.id.btnSubs);
        Button btnDiv=findViewById(R.id.btnDiv);
        Button btnMul=findViewById(R.id.btnMul);
        Button btnClr=findViewById(R.id.btnClr);
        Button btnDot=findViewById(R.id.btndot);
        Button btnEqual=findViewById(R.id.btnEqual);
        final EditText edt=findViewById(R.id.plainTxt);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt==null){
                    edt.setText("0");
                }
                else{
                    res1=Float.parseFloat(edt.getText()+" ");
                    add=true;
                    edt.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt==null){
                    edt.setText(" ");
                }
                else{
                    res1=Float.parseFloat(edt.getText()+" ");
                    subs=true;
                    edt.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt==null){
                    edt.setText(" ");
                }
                else{
                    res1=Float.parseFloat(edt.getText()+" ");
                    mul=true;
                    edt.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt==null){
                    edt.setText(" ");
                }
                else{
                    res1=Float.parseFloat(edt.getText()+" ");
                    div=true;
                    edt.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res2=Float.parseFloat(edt.getText()+" ");
                if(add==true){
                    edt.setText(res1+res2+" ");
                    add=false;
                }
                if(subs==true){
                    edt.setText(res1-res2+" ");
                    subs=false;
                }
                if(mul==true){
                    edt.setText(res1*res2+" ");
                    mul=false;
                }
                if(div==true){
                    edt.setText(res1/res2+" ");
                    div=false;
                }
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(" ");
            }
        });
    }
}