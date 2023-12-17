package taller.pkg09_ricardoespinosa;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
public class Ejercicio_02 {
    public static void main(String[] args) {
        int arreglo[] = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0, promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        promedio = suma/arreglo.length;
        System.out.printf("El promedio es: %.2f \n", promedio);
        System.out.println("Lista de notas por arriba del promedio");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio)
                System.out.print("Nota " + (i + 1)+ ": " + arreglo[i] + " ; ");
        }
        System.out.println("\nLista de notas por abajo del promedio");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio)
                System.out.print("Nota " + (i + 1) + ": " + arreglo[i] + " ; ");
        }
    }
} 