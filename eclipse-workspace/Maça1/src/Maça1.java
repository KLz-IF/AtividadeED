import java.util.Scanner;
public class Ma�a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
System.out.println ("Escreva o numero de ma�as compradas");
int Ma�a = in.nextInt ();
double total;
	if (Ma�a >=12) {
		total = Ma�a * 0.25;
		System.out.println (total);
	}
	else if (Ma�a <12) {
		total = Ma�a * 0.30;
		System.out.println (total);
	}
	}

}
