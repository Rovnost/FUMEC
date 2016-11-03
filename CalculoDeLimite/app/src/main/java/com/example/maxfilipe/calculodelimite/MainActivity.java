package com.example.maxfilipe.calculodelimite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (EditText) findViewById(R.id.valorDeA);

    }

    public void proximo(View view){
        String messa = number.getText().toString();;

        Intent intente = new Intent(MainActivity.this, b.class);
        intente.putExtra("var", messa);
        MainActivity.this.startActivity(intente);
    }
}
