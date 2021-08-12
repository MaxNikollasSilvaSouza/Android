package com.example.passo_a_passo_jogo_da_memoria;

import java.util.Random;

//###FALTA FAZER O ITENT PARA PASSAR O NOME DO JOGADOR E O NÍVEL DE DIFICULDADE
//ASSIM COMO PROGRAMAR PARA ELE ENCERRAR NOS DIFERENTES NIVEIS DE DIFICULDADES

public class Cartas {


    String[] drawable;

    boolean selecionado1 = false;
    boolean selecionado2 = false;

    int pontos= 0;
    int nivel1 = 3;
    int nivel2 = 4;
    int nivel3 = 6;

    boolean Bnivel1 = false;
    boolean Bnivel2 = false;
    boolean Bnivel3 = false;

    int Selecionado1 = -1;
    int Selecionado2 = -1;

    public void pegarDif(int dif)
    {
        if(dif == 1)
        {
            Bnivel1 = true;

        }
        else if(dif == 2)
        {
            Bnivel2 = true;

        }

        else
        {
            Bnivel3 = true;
        }


    }

    private boolean ganhou()
    {
        boolean retorno = false;

        if(Bnivel1 == true )
        {
            if(pontos == nivel1)
            {
                retorno = true;
            }
            else
            {
                retorno = false;
            }
        }

        else if(Bnivel2 == true )
        {
            if(pontos == nivel2)
            {
                retorno = true;
            }
            else
            {
                retorno = false;
            }
        }

        else if(Bnivel3 == true )
        {

            if(pontos == nivel3)
            {
                retorno = true;
            }
            else
            {
                retorno = false;
            }
        }
        return retorno;
    }
    //
    public void verificar(String a)
    {
        if(selecionado1 == false)
        {


        }
        else
        {


        }
    }


    public String getDrawable (int posicao)
    {
        return this.drawable[posicao];
    }















































}























