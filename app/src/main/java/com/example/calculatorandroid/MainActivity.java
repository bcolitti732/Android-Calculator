package com.example.calculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean suma = false;
    boolean resta = false;
    boolean multiplica = false;
    boolean division = false;
    boolean rad = false;
    Double[] numero = new Double[30];
    double conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn1 = (Button) findViewById(R.id.Btn1);
        Btn1.setOnClickListener(this);
        Button Btn2 = (Button) findViewById(R.id.Btn2);
        Btn2.setOnClickListener(this);
        Button Btn3 = (Button) findViewById(R.id.Btn3);
        Btn3.setOnClickListener(this);
        Button Btn4 = (Button) findViewById(R.id.Btn4);
        Btn4.setOnClickListener(this);
        Button Btn5 = (Button) findViewById(R.id.Btn5);
        Btn5.setOnClickListener(this);
        Button Btn6 = (Button) findViewById(R.id.Btn6);
        Btn6.setOnClickListener(this);
        Button Btn7 = (Button) findViewById(R.id.Btn7);
        Btn7.setOnClickListener(this);
        Button Btn8 = (Button) findViewById(R.id.Btn8);
        Btn8.setOnClickListener(this);
        Button Btn9 = (Button) findViewById(R.id.Btn9);
        Btn9.setOnClickListener(this);
        Button Btn0 = (Button) findViewById(R.id.Btn0);
        Btn0.setOnClickListener(this);
        Button BtnC = (Button) findViewById(R.id.BtnC);
        BtnC.setOnClickListener(this);
        Button BtnPlus = (Button) findViewById(R.id.BtnPlus);
        BtnPlus.setOnClickListener(this);
        Button BtnMinus = (Button) findViewById(R.id.BtnMinus);
        BtnMinus.setOnClickListener(this);
        Button BtnMultiply = (Button) findViewById(R.id.BtnMultiply);
        BtnMultiply.setOnClickListener(this);
        Button BtnDivide = (Button) findViewById(R.id.BtnDivide);
        BtnDivide.setOnClickListener(this);
        Button BtnSen = (Button) findViewById(R.id.BtnSen);
        BtnSen.setOnClickListener(this);
        Button BtnCos = (Button) findViewById(R.id.BtnCos);
        BtnCos.setOnClickListener(this);
        Button BtnTan = (Button) findViewById(R.id.BtnTan);
        BtnTan.setOnClickListener(this);
        Button BtnEqual = (Button) findViewById(R.id.BtnEqual);
        BtnEqual.setOnClickListener(this);
        Switch Switch = (Switch) findViewById(R.id.Switch);
        Switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    rad = false;
                }
                else{
                    rad = true;
                }
            }
        });

    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {


        TextView pantalla = (TextView) findViewById(R.id.PantallaCalc);
        int op = v.getId();
        String n = pantalla.getText().toString();
        try{
            if (op==R.id.Btn1) {
                pantalla.setText(n + "1");
            }
            else if (op==R.id.Btn2){
                pantalla.setText(n + "2");
            }
            else if (op==R.id.Btn3){
                pantalla.setText(n + "3");
            }
            else if (op==R.id.Btn4){
                pantalla.setText(n + "4");
            }
            else if (op==R.id.Btn5){
                pantalla.setText(n + "5");
            }
            else if (op==R.id.Btn6){
                pantalla.setText(n + "6");
            }
            else if (op==R.id.Btn7){
                pantalla.setText(n + "7");
            }
            else if (op==R.id.Btn8){
                pantalla.setText(n + "8");
            }
            else if (op==R.id.Btn9){
                pantalla.setText(n + "9");
            }
            else if (op==R.id.Btn0){
                pantalla.setText(n + "0");
            }
            else if (op==R.id.BtnPlus){
                suma = true;
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
            }
            else if (op==R.id.BtnMinus){
                resta = true;
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
            }
            else if (op==R.id.BtnMultiply){
                multiplica = true;
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
            }
            else if (op==R.id.BtnDivide){
                division = true;
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
            }
            else if (op==R.id.BtnSen){
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
                if (rad){
                    conversion = Math.sin(Math.toRadians(numero[0]));
                }
                else{
                    conversion = Math.sin((numero[0]));
                }
                pantalla.setText(String.valueOf(conversion));
            }
            else if (op==R.id.BtnCos){
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
                if (rad){
                    conversion = Math.cos(Math.toRadians(numero[0]));
                }
                else{
                    conversion = Math.cos((numero[0]));
                }
                pantalla.setText(String.valueOf(conversion));
            }
            else if (op==R.id.BtnTan){
                numero[0] = Double.parseDouble(n);
                pantalla.setText("");
                if (rad){
                    conversion = Math.tan(Math.toRadians(numero[0]));
                }
                else{
                    conversion = Math.tan((numero[0]));
                }
                pantalla.setText(String.valueOf(conversion));
            }
            else if (op==R.id.BtnC){
                pantalla.setText("");
            }
            else if (op==R.id.BtnEqual){
                numero[1] = Double.parseDouble(n);
                if (suma){
                    conversion = numero[0] + numero[1];
                    pantalla.setText(String.valueOf(conversion));
                }
                else if (resta){
                    conversion = numero[0] - numero[1];
                    pantalla.setText(String.valueOf(conversion));
                }
                else if(multiplica){
                    conversion = numero[0] * numero[1];
                    pantalla.setText(String.valueOf(conversion));
                }
                else if(division){
                    conversion = numero[0] / numero[1];
                    pantalla.setText(String.valueOf(conversion));
                }
                suma = false;
                resta = false;
                multiplica = false;
                division = false;
            }
        }
        catch (Exception e){
            pantalla.setText("");
        }
    }
}