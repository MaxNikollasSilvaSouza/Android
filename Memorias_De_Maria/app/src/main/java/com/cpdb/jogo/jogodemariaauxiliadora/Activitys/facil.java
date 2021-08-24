package com.cpdb.jogo.jogodemariaauxiliadora.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cpdb.jogo.jogodemariaauxiliadora.R;
import com.cpdb.jogo.jogodemariaauxiliadora.componenteVisual.MyView;
import com.cpdb.jogo.jogodemariaauxiliadora.componenteVisual.OnGameListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class facil extends AppCompatActivity implements OnGameListener {

    MyView[] cartas;
    int [] desenhos = {R.drawable.d1,R.drawable.d2,R.drawable.d3};
    int pnts = 0;
    TextView placar;
    List<Integer> possiveis;
    int acertos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facil);
        MyView.setMeuBack(R.drawable.verso);
        placar = findViewById(R.id.pnts);
        cartas = new MyView[6];

        acertos=0;
        possiveis = new ArrayList<Integer>();
        for (int i=0;i<desenhos.length;i++ )
        {
            possiveis.add(desenhos[i]);
            possiveis.add(desenhos[i]);
        }
        cartas[0]=(MyView)findViewById(R.id.imageView);
        cartas[1]=(MyView)findViewById(R.id.imageView2);
        cartas[2]=(MyView)findViewById(R.id.imageView4);
        cartas[3]=(MyView)findViewById(R.id.imageView9);
        cartas[4]=(MyView)findViewById(R.id.imageView11);
        cartas[5]=(MyView)findViewById(R.id.imageView10);

        for (int i =0;i<cartas.length;i++)
        {
            cartas[i].setCostas();
            Random rr = new Random(System.currentTimeMillis());
            int sorteio = rr.nextInt(possiveis.size());
            sorteio= sorteio % possiveis.size();
            cartas[i].setMeuFront(possiveis.get(sorteio));
            possiveis.remove(sorteio);
            cartas[i].setOnGameListener(this);

        }

    }
    public void onErro(View v)
    {
        Toast.makeText(this, "Errou", Toast.LENGTH_SHORT).show();
    }
    public void onAcerto(View v)
    {
        String parametro = this.getIntent().getStringExtra("nome_parametro");
        acertos++;

        if (acertos>=desenhos.length)
        {

            startActivity(new Intent(this, devs.class));
            Toast.makeText(this, "Parabens "+parametro+", Voce Ganhou!", Toast.LENGTH_SHORT).show();
            pnts = acertos;
            String foi =String.valueOf( pnts);
            placar.setText(foi);
        }
        else
        {
            pnts = acertos;
            String foi =String.valueOf( pnts);
            placar.setText(foi);
            Toast.makeText(this, "Explendido", Toast.LENGTH_SHORT).show();
        }
    }
}