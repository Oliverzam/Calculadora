package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txt_numero1;
    private EditText txt_numero2;
    private TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_numero1=findViewById(R.id.txt_numero1);
        txt_numero2=findViewById(R.id.txt_numero2);
        txt_resultado=findViewById(R.id.txt_resultado);
    }
    public void suma(View view){
        double num1=Integer.parseInt(txt_numero1.getText().toString());
        double num2= Integer.parseInt(txt_numero2.getText().toString());
        double resul;
        resul=num1+num2;
        txt_resultado.setText(String.valueOf(resul));
    }
    public void resta(View view){
        double num1=Integer.parseInt(txt_numero1.getText().toString());
        double num2= Integer.parseInt(txt_numero2.getText().toString());
        double resul;
        resul=num1-num2;
        txt_resultado.setText(String.valueOf(resul));
    }
    public void multiplicacion(View view){
        double num1=Integer.parseInt(txt_numero1.getText().toString());
        double num2= Integer.parseInt(txt_numero2.getText().toString());
        double resul;
        resul=num1*num2;
        txt_resultado.setText(String.valueOf(resul));
    }
    public void division(View view){
        double num1=Integer.parseInt(txt_numero1.getText().toString());
        double num2= Integer.parseInt(txt_numero2.getText().toString());
        double resul;
        resul=num1/num2;
        txt_resultado.setText(String.valueOf(resul));
    }
}