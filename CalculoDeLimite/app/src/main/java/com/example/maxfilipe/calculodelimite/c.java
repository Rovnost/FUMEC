package com.example.maxfilipe.calculodelimite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class c extends AppCompatActivity {
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        number = (EditText) findViewById(R.id.valorDeC);

    }
    public void proximo(View view){
        String messa = number.getText().toString();;
        Intent i = getIntent();
        String bb = i.getStringExtra("var");
        String aa = i.getStringExtra("a");

        Intent intente = new Intent(c.this, d.class);
        intente.putExtra("var", messa);
        intente.putExtra("b", bb);
        intente.putExtra("a", aa);
        c.this.startActivity(intente);
    }
    public void voltar(View v ){
        finish();
    }
}
