package taller.pkg09_ricardoespinosa;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
import java.util.Scanner;
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial, letra;
        char letraAux;
        boolean bandera = true;
        while(bandera){
        System.out.println("Ingrese una letra");
        inicial = tc.nextLine();
            for (int i = 0; i < estudiantes.length; i++) {
                letraAux = estudiantes[i].charAt(0);
                letra = String.valueOf(letraAux);//Se obtiene la inicial de cada elemento del arreglo
                if (inicial.equals(letra)){
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                }
            }
        }
    }   
}