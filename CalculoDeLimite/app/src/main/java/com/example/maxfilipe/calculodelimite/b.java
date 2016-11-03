package com.example.maxfilipe.calculodelimite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class b extends AppCompatActivity {
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        number = (EditText) findViewById(R.id.valorDeB);

//        final TextView nomeresposta = (TextView) findViewById(R.id.textView);
//
//        Intent i = getIntent();
//        String x = i.getStringExtra("ar");
//
//        nomeresposta.setText(x);


    }

    public void proximo(View view){
        String messa = number.getText().toString();;
        Intent i = getIntent();
        String rr = i.getStringExtra("var");

        Intent intente = new Intent(b.this, c.class);
        intente.putExtra("var", messa);
        intente.putExtra("a", rr);
        b.this.startActivity(intente);
    }
    public void voltar(View v ){
        finish();
    }
}
