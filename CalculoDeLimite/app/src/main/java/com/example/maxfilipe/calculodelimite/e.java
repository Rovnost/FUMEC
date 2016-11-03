package com.example.maxfilipe.calculodelimite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class e extends AppCompatActivity {
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        number = (EditText) findViewById(R.id.valorDeE);

    }
    public void proximo(View view){
        String messa = number.getText().toString();;
        Intent i = getIntent();
        String dd = i.getStringExtra("var");
        String aa = i.getStringExtra("a");
        String bb = i.getStringExtra("b");
        String cc = i.getStringExtra("c");

        Intent intente = new Intent(e.this, f.class);
        intente.putExtra("var", messa);
        intente.putExtra("b", bb);
        intente.putExtra("a", aa);
        intente.putExtra("c", cc);
        intente.putExtra("d", dd);
        e.this.startActivity(intente);
    }
    public void voltar(View v ){
        finish();
    }
}
