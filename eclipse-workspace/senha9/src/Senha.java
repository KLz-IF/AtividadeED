		import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		 Scanner in = new Scanner (System.in);
		 System.out.println("Adicione sua senha:");
		 String senha = in.nextLine();
			 if (senha.equals("1234")){
			 		 System.out.println ("ACESSO PERMITIDO");
			 }
			 else { 
				 System.out.println ("ACESSO NEGADO");
			 }
			 }
			
	}

