package com.example.maxfilipe.calculodelimite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class indeterminado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indeterminado);

        final TextView aa = (TextView) findViewById(R.id.textView3);
        final TextView bb = (TextView) findViewById(R.id.textView5);
        final TextView ee = (TextView) findViewById(R.id.textView6);
        final TextView resposta = (TextView) findViewById(R.id.indeterminado);

        Intent i = getIntent();
        String a = i.getStringExtra("a");
        String b = i.getStringExtra("b");
        String c = i.getStringExtra("c");
        String d = i.getStringExtra("d");
        String e = i.getStringExtra("e");
        String f = i.getStringExtra("f");
        String g = i.getStringExtra("var");

        aa.setText("x -> "+a);
        bb.setText(b+".("+a+")"+"²+("+c+")."+"("+a+")+("+d+")");
        ee.setText(e+".("+a+")"+"²+("+f+")."+"("+a+")+("+g+")");

        // Pegar inteiros das Strings
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        double c1 = Double.parseDouble(c);
        double d1 = Double.parseDouble(d);
        double e1 = Double.parseDouble(e);
        double f1 = Double.parseDouble(f);
        double g1 = Double.parseDouble(g);
        // Determinar numerador
        double numerador;
        numerador = (Math.pow(a1, 2)*b1+(c1*a1)+d1);

        // Determinar denominador
        double denominador;
        denominador = (Math.pow(a1, 2)*e1+(f1*a1)+g1);

        // Verificar indeterminacao
        if( !(numerador == 0 && denominador == 0) ){
            resposta.setText("NÃO É INDETERMINADO! \n DEU "+numerador+"/"+denominador+" !");
        }else {
            resposta.setText("É INDETERMINADO: 0/0 !");

            // Metodo de Briott Rufini
            double numerador2, denominador2, var, var2, var3, varB, var2B, var3B;

            var = a1*b1;
            var2 = var + c1;
            var3 = var2*a1 + d1; // Resto

            numerador2 = b1*a1 + var2;

            varB = a1*e1;
            var2B = varB + f1;
            var3B = var2B*a1 + g1; // Resto

            denominador2 = e1*a1 + var2B;

            resposta.setText("É INDETERMINADO: 0/0 ! \n Limite = "+ numerador2/denominador2);
        }

    }
    public void voltar(View v ){
        finish();
    }
    public void proximo(View view){
        Intent it = new Intent(this, creditos.class);
        startActivity(it);
    }

}
