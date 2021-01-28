import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
Integer vI = 0;
Integer vF = 0;
do {
	System.out.println("Digite um valor para o 1º numero inteiro:");
	vI = sc.nextInt ();
	System.out.println("Digite um valor para o 2º numero inteiro:");
	vF = sc.nextInt();
}
while (vF <= vI);
for (Integer var = vI; var <= vF; var ++)
	System.out.println(var);
	}

}
