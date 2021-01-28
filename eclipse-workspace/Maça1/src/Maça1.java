import java.util.Scanner;
public class Maça1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
System.out.println ("Escreva o numero de maças compradas");
int Maça = in.nextInt ();
double total;
	if (Maça >=12) {
		total = Maça * 0.25;
		System.out.println (total);
	}
	else if (Maça <12) {
		total = Maça * 0.30;
		System.out.println (total);
	}
	}

}
