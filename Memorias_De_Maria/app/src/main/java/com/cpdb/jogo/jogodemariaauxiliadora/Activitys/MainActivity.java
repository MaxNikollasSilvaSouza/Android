package com.cpdb.jogo.jogodemariaauxiliadora.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cpdb.jogo.jogodemariaauxiliadora.R;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    Button f,m,d,devs,como_jogar_jogo;
    String nome_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nome);
        f = (Button)findViewById(R.id.button);
        m = (Button)findViewById(R.id.button4);
        como_jogar_jogo = (Button) findViewById(R.id.como_jogar);
        d = (Button)findViewById(R.id.button5);
        devs = (Button)findViewById(R.id.devs);

        nome_user ="";
        nome_user = nome.toString();

        //Modo fácil - evento do botão
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nome.getText().toString().equals(""))
                {
                    Intent tela_history = new Intent(MainActivity.this, facil.class);
                    String parametro = nome.getText().toString();
                    tela_history.putExtra("nome_parametro", parametro);
                    startActivityForResult(tela_history, 5);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Campo nome vazio!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Modo médio - evento do botão
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nome.getText().toString().equals(""))
                {
                    Intent tela_history = new Intent(MainActivity.this, medio.class);
                    String parametro = nome.getText().toString();
                    tela_history.putExtra("nome_parametro", parametro);
                    startActivityForResult(tela_history, 5);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Campo nome vazio!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Modo Dificil - evento do botão
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nome.getText().toString().equals(""))
                {
                    Intent tela_history = new Intent(MainActivity.this, dificil.class);
                    String parametro = nome.getText().toString();
                    tela_history.putExtra("nome_parametro", parametro);
                    startActivityForResult(tela_history, 5);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Campo nome vazio!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Devs
        devs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.cpdb.jogo.jogodemariaauxiliadora.Activitys.devs.class));
            }
        });

        como_jogar_jogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, como_jogar.class));
            }
        });
    }
}