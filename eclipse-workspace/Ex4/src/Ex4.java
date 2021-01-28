import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
Integer quant = 0;
Integer maior = 0;
while (quant < 10) {
	System.out.println ("Digite dez numeros:");
	Integer nume = sc.nextInt ();
	if (nume > maior)
		maior = nume;
	quant++;
}
System.out.println ("O numero maior é:"+maior);

	}

}
