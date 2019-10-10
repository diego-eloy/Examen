package examen;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ENTRADA");
        
        System.out.println("Introduce el radio del circulo: ");
        double radio = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Introduce la base del triangulo: ");
        double base = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Introduce la altura del triangulo: ");
        double altura = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Introduce la base del rectangulo: ");
        double base0 = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("Introduce la altura del rectangulo: ");
        double altura0 = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.println("SALIDA");
        calcularACirculo(radio);
        calcularATriangulo(base,altura);
        calcularARectangulo(base0, altura0);
    }
    
    public static void calcularACirculo(double parametro1){
        double areaC = Math.PI*(parametro1 * parametro1);
        System.out.printf("El area del circulo es: %.2f%n",areaC);
    }
    public static void calcularATriangulo(double parametro1,double parametro2){
        double areaT = (parametro1 * parametro2)/2;
        System.out.printf("El area del triangulo es: %.2f%n",areaT);
    }
    public static void calcularARectangulo(double parametro1,double parametro2){
        double areaR = parametro1 * parametro2;
        System.out.printf("El area del rectangulo es: %.2f%n",areaR);
    }
}
