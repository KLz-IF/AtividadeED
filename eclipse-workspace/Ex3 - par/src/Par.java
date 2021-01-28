public class Calculadora {

    public static Integer Multiplicar(Integer x, Integer y){

        return x*y;

    }

    public static double Multiplicar(double x, double y){

        return x*y;

    }

    public static double Cubo(Integer x){

        return Math.pow(x, 3);

    }

    public static String ParImpar(Integer x){

        if (x == 0){

        return "Zero";

        }

        else{

        if (x%2 == 0){

        return "Par";

        }

        else{

        return "Ímpar";

            }

        }

    }

}

