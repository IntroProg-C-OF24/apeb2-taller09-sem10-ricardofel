package taller.pkg09_ricardoespinosa;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
import java.util.Random;
public class Ejercicio_05 {
    public static void main(String[] args) {
        double promedios[] = new double [28];
        double suma = 0, promCurso = 0, mejor = 0, peor = 10;
        for (int i = 0; i < promedios.length; i++) {
            promedios[i] = (double) (Math.random() * (9 - 0 + 1)) + 0;
            suma = suma + promedios[i];
        }
        promCurso = suma/promedios.length;
        System.out.printf("EL PROMEDIO DEL CURSO ES: %.2f \n", promCurso);
        System.out.println("LISTA DE ESTUDIANTES CON UN PUNTAJE MAYOR AL PROMEDIO");
        for (int i = 0; i < promedios.length; i++) {
            if(promedios[i] > promCurso)
                System.out.printf("ESTUDIANTE %s: %.2f \n",(i+1), promedios[i]);
        }
        System.out.println("LISTA DE ESTUDIANTES CON UN PUNTAJE MENOR AL PROMEDIO");
        for (int i = 0; i < promedios.length; i++) {
            if(promedios[i] < promCurso)
                System.out.printf("ESTUDIANTE %s: %.2f \n",(i+1), promedios[i]);
        }
        for (int i = 0; i < promedios.length; i++) {
            if(promedios[i] > mejor)
                mejor = promedios[i];
            if(promedios[i] < peor)
                peor = promedios[i];
        }
        System.out.println("ESTUDIANTE(S) CON EL MEJOR PROMEDIO");
        for (int i = 0; i < promedios.length; i++) {
            if(promedios[i] == mejor)
                System.out.printf("ESTUDIANTE %s: %.2f \n",(i+1), promedios[i]);
        }
        System.out.println("ESTUDIANTE(S) CON EL PEOR PROMEDIO");
        for (int i = 0; i < promedios.length; i++) {
            if(promedios[i] == peor)
                System.out.printf("ESTUDIANTE %s: %.2f \n",(i+1), promedios[i]);
        }
    }   
}