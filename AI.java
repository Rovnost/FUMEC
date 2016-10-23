public class AI{

  public static void metodo01( ){

    MyIO.println("Equacao de grau 2");
    MyIO.println("lim\t"+"b²+cx+d");
    MyIO.println("x>a\t"+"-------");
    MyIO.println("\t"+"e²+fx+g");

    // Definir variaveis
    double a; // variacao do limite
    double b, c, d; // variaveis do numerador
    double e, f, g; // variaveis do denominador

    // Definir valores
    MyIO.println("Digite qualquer valor para a: ");
    a = MyIO.readDouble();

    MyIO.println("Digite qualquer valor para b: ");
    b = MyIO.readDouble();
    MyIO.println("Digite qualquer valor para c: ");
    c = MyIO.readDouble();
    MyIO.println("Digite qualquer valor para d: ");
    d = MyIO.readDouble();

    MyIO.println("Digite qualquer valor para e: ");
    e = MyIO.readDouble();
    MyIO.println("Digite qualquer valor para f: ");
    f = MyIO.readDouble();
    MyIO.println("Digite qualquer valor para g: ");
    g = MyIO.readDouble();

    // Determinar numerador
    double numerador;
    numerador = (Math.pow(a, 2)*b+(c*a)+d);

    // Determinar denominador
    double denominador;
    denominador = (Math.pow(a, 2)*e+(f*a)+g);

    // Verificar indeterminacao
    if( !(numerador == 0 && denominador == 0) ){
      MyIO.print("Não é indeterminado! Deu "+numerador+"/"+denominador+" !");
    }else{
      MyIO.println("É indeterminado: 0/0 !");
      // Metodo de Briott Rufini
      double numerador2, denominador2, var, var2, var3, varB, var2B, var3B;

      var = a*b;
      var2 = var + c;
      var3 = var2*a + d; // Resto

      numerador2 = b*a + var2;

      varB = a*e;
      var2B = varB + f;
      var3B = var2B*a + g; // Resto

      denominador2 = e*a + var2B;

      MyIO.println("Limite = "+ numerador2/denominador2);
    }


  }

  public static void main(String[] args) {
    metodo01( );
  }
}
