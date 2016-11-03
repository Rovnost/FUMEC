package com.example.maxfilipe.calculodelimite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class f extends AppCompatActivity {
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        number = (EditText) findViewById(R.id.valorDeF);

    }

    public void proximo(View view){
        String messa = number.getText().toString();;
        Intent i = getIntent();
        String ee = i.getStringExtra("var");
        String aa = i.getStringExtra("a");
        String bb = i.getStringExtra("b");
        String cc = i.getStringExtra("c");
        String dd = i.getStringExtra("d");

        Intent intente = new Intent(f.this, g.class);
        intente.putExtra("var", messa);
        intente.putExtra("b", bb);
        intente.putExtra("a", aa);
        intente.putExtra("c", cc);
        intente.putExtra("d", dd);
        intente.putExtra("e", ee);

        f.this.startActivity(intente);
    }
    public void voltar(View v ){
        finish();
    }
}
