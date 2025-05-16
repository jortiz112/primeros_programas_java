import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero positivo:");
        int numero = teclado.nextInt();

        if (esNumeroPar(numero)) {
            System.out.println("El número " + numero + " es un número par.");
        } else {
            System.out.println("El número " + numero + " es un número impar");
        }
        teclado.close();
    }

    public static boolean esNumeroPar(int numeroUsuario) {
        return (numeroUsuario % 2) == 0;
    }

}
