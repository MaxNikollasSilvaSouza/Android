package com.example.modelomvccompleto;

public class Modelo {

    private String ultima_conta;

    public String getUltima_conta(){return this.ultima_conta;}

    public String operacao(String simbolo, String Valor1, String Valor2)
    {
        String Oresultado;
        int x1 = Integer.valueOf(Valor1);
        int x2 = Integer.valueOf(Valor2);

       if(simbolo.equals("+"))
       {
            Oresultado = String.valueOf(soma(x1,x2));
       }
       else if(simbolo.equals("-"))
       {
           Oresultado = String.valueOf(subtracao(x1,x2));
       }
       else if(simbolo.equals("/"))
       {
           Oresultado = String.valueOf(divisao(x1,x2));
       }
       else if(simbolo.equals("x"))
        {
            Oresultado = String.valueOf(multiplicacao(x1,x2));
        }
       else
       {
           Oresultado = "0";
       }

       return Oresultado;

    }

    private int soma(int x1, int x2)
    {
        int resultado = 0;
        resultado = x1 + x2;

        this.ultima_conta = String.valueOf(x1) + " + " + String.valueOf(x2) + " = " + String.valueOf(resultado);


        return resultado;
    }
    private int subtracao(int x1, int x2)
    {
        int resultado = 0;
        resultado = x1 - x2;

        this.ultima_conta = String.valueOf(x1) + " - " + String.valueOf(x2) + " = " + String.valueOf(resultado);


        return resultado;
    }
    private int multiplicacao(int x1, int x2)
    {
        int resultado = 0;
        resultado = x1 * x2;

        this.ultima_conta = String.valueOf(x1) + " * " + String.valueOf(x2) + " = " + String.valueOf(resultado);


        return resultado;
    }
    private int divisao(int x1, int x2)
    {
        int resultado = 0;
        resultado = x1 / x2;

        this.ultima_conta = String.valueOf(x1) + " / " + String.valueOf(x2) + " = " + String.valueOf(resultado);


        return resultado;
    }


}
