import java.util.Scanner;
public class Inteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
System.out.println ("Digite um numero inteiro:");
int nu = in.nextInt();
	if (nu % 2 == 0) {
		System.out.println ("Numero par");
		
	}
	else 
	{
		System.out.println ("Numero impar");
	}
	}

}
