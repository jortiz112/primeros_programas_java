import java.util.Scanner;

public class VerificacionTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer lado: ");
        int primerLado = teclado.nextInt();
        System.out.println("Por favor ingrese el segundo lado: ");
        int segundoLado = teclado.nextInt();
        System.out.println("Por favor ingrese el tercer lado: ");
        int tercerLado = teclado.nextInt();

        if (((primerLado + segundoLado) > tercerLado &&
                (primerLado + tercerLado) > segundoLado) &&
                (segundoLado + tercerLado) > primerLado) {
            System.out.println(" Los lados ingresados pueden formar un triangulo.");
        } else {
            System.out.println("Los lados ingresados no forman un triangulo.");
        }
        teclado.close();
    }
}
