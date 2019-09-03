package com.example.calculadorasuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //defino los componentes del texto.
    private EditText et1;
    private EditText et2;

    //usaré un objeto de la clase textview
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hay que caestear el edittext a textview
        //Debe encontrar una vista, una vista es un componente, como un txt.
        /*
        La clase R es de setContentView(R.layout.activity_main); Esa clase Android studio lo crea automática, es un puente de comunicación
        entre nuestra parte lógica (Java) y la parte gráfica del android studio (XML)

        */

        et1 = (EditText)findViewById(R.id.txtNum1);
        et2 = (EditText)findViewById(R.id.txtNum2);

        //guarda el resultado.
        tv1 = (TextView)findViewById(R.id.txtResultado);



    }


    //método que realiza la suma
    public void sumar(View v){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resultado = num1 + num2;

        String resultadoFinal = String.valueOf(resultado);
        tv1.setText(resultadoFinal);




    }

}
