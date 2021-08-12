package com.example.duastelas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Next;
    EditText Texto;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Next = (Button) findViewById(R.id.Next);
        Texto = (EditText) findViewById(R.id.Texto);
        layout = (LinearLayout) findViewById(R.id.fundao);

        Next.setOnClickListener(this);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 5)
        {
            if(resultCode == RESULT_OK)
            {
                if (data != null)
                {
                    String recebimento = data.getStringExtra("Retorno");
                    Texto.setText(recebimento);
                    if(recebimento.equals("Sim"))
                    {
                        layout.setBackgroundColor(Color.GREEN);
                    }
                    else
                    {
                        layout.setBackgroundColor(Color.RED);
                    }
                }
            }
        }
    }

    @Override
    public void onClick(View v) {

    Intent sacola = new Intent(this, Main2Activity.class);
    String pergunta = Texto.getText().toString();
    sacola.putExtra("parametro", pergunta);
    startActivityForResult(sacola,5);




    }
}
