package com.example.passo_a_passo_jogo_da_memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;



public class Jogo4x3com12cartas extends AppCompatActivity {

    Cartas cartas;
    ImageView []img;
    boolean []valido = {false,false,false,false,false,false,false,false,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo4x3com12cartas);

        img[0] = findViewById(R.id.img0);
        img[1] = findViewById(R.id.img1);
        img[2] = findViewById(R.id.img2);
        img[3] = findViewById(R.id.img3);
        img[4] = findViewById(R.id.img4);
        img[5] = findViewById(R.id.img5);
        img[6] = findViewById(R.id.img6);
        img[7] = findViewById(R.id.img7);
        img[8] = findViewById(R.id.img8);
        img[9] = findViewById(R.id.img9);
        img[10] = findViewById(R.id.img10);
        img[11] = findViewById(R.id.img11);
        cartas = new Cartas();
        cartas.pegarDif(3);
    }
/*
    public void mostrar()
    {
        Handler handler = new Handler();
        handler.postDelayed((Runnable) this,2000);

            img[i].setImageDrawable(R.drawable.principal);


    }*/








}
