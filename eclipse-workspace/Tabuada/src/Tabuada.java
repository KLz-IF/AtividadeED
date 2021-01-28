import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
System.out.println ("Digite um numero que deseje consultar a tabuada:");
Integer nume = sc.nextInt ();
Integer x = 1;
Integer result = 0;

for (x = 1; x <= 10; ++x) {
	result = x * nume;
	System.out.println(nume +"x"+x+" = "+ result);
}
	}

}
