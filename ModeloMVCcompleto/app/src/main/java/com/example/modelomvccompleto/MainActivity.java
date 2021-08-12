package com.example.modelomvccompleto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Modelo modelo;

    Button btmais, btmenos, btmultiplica, btdivide, btlimpar;
    EditText valor1,valor2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         modelo = new Modelo();
         btmais = (Button) findViewById(R.id.Botao_adicao);
         btmenos = (Button) findViewById(R.id.Botao_subtracao);
         btdivide = (Button) findViewById(R.id.Botao_divisao);
         btmultiplica = (Button) findViewById(R.id.Botao_multiplicacao);
         btlimpar = (Button) findViewById(R.id.Botao_limpar);
         valor1 = (EditText) findViewById(R.id.EditText_valor1);
         valor2 = (EditText) findViewById(R.id.EditText_valor2);
         result = (TextView) findViewById(R.id.Resultado);

         btmais.setOnClickListener(this);
         btmenos.setOnClickListener(this);
         btmultiplica.setOnClickListener(this);
         btdivide.setOnClickListener(this);
         btlimpar.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        String operador = ((Button)v).getText().toString();
        try {


            if (operador.equals("c")) {
                result.setText(modelo.getUltima_conta());
                valor1.setText("");
                valor2.setText("");
            }

            else {

                String resultim = modelo.operacao(operador, valor1.getText().toString(), valor2.getText().toString());

                result.setText(resultim);
            }
        }
        catch (Exception e)
        {

        }

    }
}


