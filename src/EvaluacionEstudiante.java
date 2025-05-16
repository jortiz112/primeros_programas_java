import java.util.Scanner;

public class EvaluacionEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese la media del estudiante para su evaluación.");
        double media = teclado.nextInt();

        if (media >= 7) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue aprobado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y esta en recuperación.");
        } else if (media < 5) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue reprobado.");
        }
        teclado.close();
    }
}
