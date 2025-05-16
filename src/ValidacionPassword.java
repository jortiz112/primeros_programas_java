import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        String claveUsuario = "123456";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el password:");
        String password = teclado.nextLine();

        if (claveUsuario.equals(password)) {
            System.out.println("Acceso Permitido!.");
        } else {
            System.out.println("Acceso denegado!.");
        }
        teclado.close();
    }
}
