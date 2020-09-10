
import java.util.Scanner;
public class calculadora {

    public static double suma (double a, double b) { return a+b; }
    public static double resta (double a, double b) { return a-b; }
    public static double multiplica (double a, double b) { return a*b; }
    public static double divide (double a, double b) { return a/b; }


    public static void main (String[]args) {
        Scanner entrada = new Scanner (System.in);
        double numero1=0, numero2=0;
        System.out.println("<<<<<<<<<<Bienvenido a la Calculadora básica>>>>>>>>>>");
        System.out.println("Ingresa un numero: ");
        numero1=entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2=entrada.nextDouble();
//operaciones
        System.out.println("La suma de ambos numeros es: "+suma(numero1,numero2));
        System.out.println("La resta de ambos numeros es: "+resta(numero1,numero2));
        System.out.println("La multiplicacion de ambos numeros es: "+multiplica(numero1,numero2));
        System.out.println("La división de ambos numeros es: "+divide(numero1,numero2)); }
}