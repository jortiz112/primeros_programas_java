import java.util.Scanner;

public class CompararDosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer número entero positivo:");
        int numeroA = teclado.nextInt();
        System.out.println("Por favor ingrese un segundo número entero positivo:");
        int numeroB = teclado.nextInt();

        if (numeroA > numeroB) {
            System.out.println("El número mayor es: " + numeroA);
        } else if (numeroB > numeroA) {
            System.out.println("El número mayor es : " + numeroB);
        } else {
            System.out.println("El primer número " + numeroA + " es igual al segundo número " + numeroB);
        }
        teclado.close();
    }
}
