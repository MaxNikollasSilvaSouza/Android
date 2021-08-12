package com.example.passo_a_passo_jogo_da_memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Menu extends AppCompatActivity implements OnClickListener {
    EditText nome;
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        nome = findViewById(R.id.Nome);
        Next = findViewById(R.id.BNext);
    }

    @Override
    public void onClick(View v) {


    }

    public void avancar()
    {
        if(nome.getText().toString().length() > 2)
        {
         Intent sacola = new Intent(this, SelectDificuldade.class);
        String NomeJogador = nome.getText().toString();
        sacola.putExtra("NomeJogador", NomeJogador);
        startActivity(sacola);
        }
    }








}
