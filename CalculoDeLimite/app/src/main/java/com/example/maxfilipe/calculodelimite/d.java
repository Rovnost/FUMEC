package com.example.maxfilipe.calculodelimite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class d extends AppCompatActivity {
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        number = (EditText) findViewById(R.id.valorDeD);

    }
    public void proximo(View view){
        String messa = number.getText().toString();;
        Intent i = getIntent();
        String cc = i.getStringExtra("var");
        String aa = i.getStringExtra("a");
        String bb = i.getStringExtra("b");

        Intent intente = new Intent(d.this, e.class);
        intente.putExtra("var", messa);
        intente.putExtra("b", bb);
        intente.putExtra("a", aa);
        intente.putExtra("c", cc);
        d.this.startActivity(intente);
    }
    public void voltar(View v ){
        finish();
    }
}
