import java.util.Scanner;

public class VerirficandoNumeroEnIntervalo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor entero del préstamo: ");
        int valorPrestamo = teclado.nextInt();

        if (valorPrestamo >= 1000 && valorPrestamo <= 5000) {
            System.out.println("El valor de " + valorPrestamo + " está dentro del intervalo " +
                    "permitido para su préstamo.");
        } else {
            System.out.println("El valor de " + valorPrestamo + " no está dentro del intervalo " +
                    "permitido para el préstamo.");
        }
        teclado.close();
    }
}
