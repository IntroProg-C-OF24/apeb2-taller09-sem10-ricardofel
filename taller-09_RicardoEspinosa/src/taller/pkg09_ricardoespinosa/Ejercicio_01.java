package taller.pkg09_ricardoespinosa;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
import java.util.Scanner;
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int limite = 0, contador = 1, i = 0, num = 0;
        char inicialAux = 0;
        String inicial = null;
        System.out.println("BIENVENID@ DIGITA EL NUMERO DE MARCAS QUE VAS INGRESAR");
        limite = tc.nextInt();
        String marcas [] = new String [limite];
        System.out.println("NOTA: Las marcas que inicien con: A,a; C,c; T,t no se contabilizan");
        while(contador <= limite){
            System.out.println("INGRESA LA MARCA DEL VEHICULO ");
            marcas[i] = tc.next();
            inicialAux = marcas[i].charAt(0);
            inicial = String.valueOf(inicialAux);//Se obtiene la incial de la palabra ingresada.
            if(inicial.equals("A") || inicial.equals("C") || inicial.equals("T") || inicial.equals("a") || inicial.equals("c") || inicial.equals("t")){
                marcas[i]= null; //El elemento queda vacio ya que no se contabiliza.
            }
            contador++;
            i++;
        }
        for (int j = 0; j < marcas.length; j++) {
            System.out.println("MARCA " + (j + 1) + ": " + marcas[j]);
        }
    }   
}