package com.example.teamsjoaonelson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class X {


}

 class operacoes {
    private char simbolo;

    public void signal(char valore)
    {
        this.simbolo = valore;
    }

    private int retornar;
    public int definir_operacao(int valor1, int valor2)
    {
        if (simbolo == '+')
        {
            retornar = soma(valor1,valor2);

        }
        else if (simbolo == '-')
        {
            retornar = subtracao(valor1,valor2);

        }
        else if (simbolo == '/')
        {
            retornar =  multiplicacao(valor1,valor2);

        }
        else if (simbolo == 'x' || simbolo == '*')
        {
            retornar = divisao(valor1,valor2);

        }
        return retornar;
    }

    public int soma(int valor1, int valor2)
    {
        int resultado = valor1 + valor2;
        return resultado;
    }


    public int subtracao(int valor1, int valor2)
    {
        int resultado = valor1 - valor2;
        return resultado;
    }

    public int multiplicacao(int valor1, int valor2)
    {
        int resultado = valor1 * valor2;
        return resultado;
    }

    public int divisao(int valor1, int valor2)
    {
        int resultado = valor1 / valor2;
        return resultado;
    }

}

public  main()
{
    public static

}



