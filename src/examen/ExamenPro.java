package examen;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class ExamenPro {

    final int NUMEROUNO = 1;
    final int NUMERODOS = 2;
    
    final static String TITULO = "Examen Programacion";
    final static int DIA = 04;
    final static int MES = 05;
    
    static boolean aprobado;

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        System.out.println("Por favor introduce tu nombre:");
        nombre=teclado.next();
        teclado.nextLine();
        
        int nota;
        System.out.println("Por favor introduce la nota que vas a sacar:");
        nota = teclado.nextInt();
        teclado.nextLine();
        
        System.out.printf("Bienvenido al %s %n",TITULO);
        System.out.printf("Fecha %d/%d %n",DIA,MES);
        
        //de esta forma llamamos al metodo y le asignamos 2 parametros
        System.out.println(devolverSaludo(nombre,nota));
        
        System.out.printf("El examen esta: %b %n",aprobado);
    }
    
    public static String devolverSaludo(String parametroUno,int parametroDos){
        String resultado = String.format("Hola %s has sacado un %d",parametroUno,parametroDos);
        aprobado = parametroDos > 5 && !parametroUno.equals("nombre");
        return resultado;
   
    }
}
