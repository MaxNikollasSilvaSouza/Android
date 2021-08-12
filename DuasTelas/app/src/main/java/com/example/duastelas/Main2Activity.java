package com.example.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView mostra;
    Button sim;
    Button nao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sim = (Button)findViewById(R.id.Sim);
        nao = (Button)findViewById(R.id.Nao);
        mostra = (TextView) findViewById(R.id.Mostra);

        sim.setOnClickListener(this);
        nao.setOnClickListener(this);

        String oquefoipassado = this.getIntent().getStringExtra("parametro");

        if(oquefoipassado != null)
        {
            mostra.setText(oquefoipassado);

        }
    }

    @Override
    public void onClick(View v) {

        String retorno = ((Button)v).getText().toString();
        Intent sacolinha = new Intent();
        sacolinha.putExtra("Retorno",retorno);
        setResult(RESULT_OK,sacolinha);
        finish();

    }
}
