import java.util.Scanner;

class Venda {
  public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    System.out.println("Informe o valor");
    int Lucro = in.nextInt();
    double valor;

    if(Lucro >= 20){
      valor = Lucro + (Lucro * 0.45);
      System.out.println(valor);
    }
    else if(Lucro < 20){
      valor = Lucro + (Lucro * 0.30);
      System.out.println(valor);

    }

  }
}