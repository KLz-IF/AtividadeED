import java.util.Scanner;
public class Ex1 {
		public static Integer Multiplicar (Integer a, Integer b) {
			return a*b;
		}
		public static double Multiplicar (double a, double b) {
			return a*b;
		}
		public static double Cubo (Integer a) {
			return Math.pow(a, 3);
		}
		public static String ParImpar (Integer a) {
			
			if (a == 0) {
				return "Zero";
			}
			else {
				if (a%2==0) {
					return "Par";
				}
				else {
					return "Impar";
				}	

			}
		}
	}