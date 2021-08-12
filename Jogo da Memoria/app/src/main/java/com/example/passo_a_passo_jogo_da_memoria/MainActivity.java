package com.example.passo_a_passo_jogo_da_memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnext;
    EditText nomej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomej= (EditText) findViewById(R.id.Nome);
        btnext = (Button) findViewById(R.id.BNext);
        btnext.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(nomej.getText().toString().length() == 0) {
            Intent sacolinha = new Intent();
            sacolinha.putExtra("Nomej", nomej.getText().toString());

            Intent interface2 = new Intent(this, Jogo4x3com12cartas.class);
        }
    }
}
