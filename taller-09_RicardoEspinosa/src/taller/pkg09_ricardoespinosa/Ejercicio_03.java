package taller.pkg09_ricardoespinosa;
/**
 * @author RICARDO FABIAN ESPINOSA LARGO
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int i = 0; i < promedios.length; i++) {
            if((promedios[i] >= 0) & (promedios[i] <= 5.9))
		promediosCualitativos[i] = "PROMEDIO REGULAR";
            else if ((promedios[i] >= 6) & (promedios[i] <= 8.9))
		promediosCualitativos[i] = "PROMEDIO BUENO";
            else if ((promedios[i] >= 9) & (promedios[i] <= 10)) 
	        promediosCualitativos[i] = "PROMEDIO SOBRESALIENTE";
        }
        for (int i = 0; i < promedios.length; i++) {
            System.out.println(estudiantes[i] + " PROMEDIO: " + promedios[i] + "; PROMEDIO CUALITATIVO: " + promediosCualitativos[i]);
        }
    }
}