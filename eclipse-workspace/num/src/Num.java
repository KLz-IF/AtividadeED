
import java.util.Scanner;
public class Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Integer nume = 0;
		Integer quant = 0;
		Integer media = 0;

		do {
			System.out.println ("Digite os numeros desejados e para finalizar digite zero:");
			nume = sc.nextInt ();
			++ quant ;
			media = quant / 2;}
		
		while (nume > 0);
		if (nume == 0) {
		System.out.println("O total de numeros digitados é:" + quant);
		System.out.println("A media de numeros digitados é:" + media);
		
	}
	

}}



