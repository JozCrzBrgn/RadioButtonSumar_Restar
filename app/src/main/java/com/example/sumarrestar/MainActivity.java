package com.example.sumarrestar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Encapsulamos
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1;
    private RadioButton rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relación de valores entre la parte gráfica y la parte lógica
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
    }

    // Método para calcular el promedio al dar click al boton
    public void SumaResta(View view){
        //Nos traemos el texto de la parte gráfica (llegan en formato String)
        String strNum1 = et1.getText().toString();
        String strNum2 = et2.getText().toString();


        //Pasamos los valores a enteros para poder hacer operaciones
        int Num1 = Integer.parseInt(strNum1);
        int Num2 = Integer.parseInt(strNum2);

        if(rb1.isChecked() == true){
            int sum = Num1 + Num2;
            String resultado = String.valueOf(sum);
            tv1.setText(resultado);
        }else if(rb2.isChecked() == true){
            int rest = Num1 - Num2;
            String resultado = String.valueOf(rest);
            tv1.setText(resultado);
        }

    }
}