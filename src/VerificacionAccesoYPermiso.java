import java.util.Scanner;

public class VerificacionAccesoYPermiso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el código de acceso: ");
        int codigoAcceso = teclado.nextInt();
        System.out.println("Ingrese el nivel de permiso: ");
        int nivelPermiso = teclado.nextInt();

        if (codigoAcceso == 2023 && (nivelPermiso >= 1 && nivelPermiso <= 3)) {
            System.out.println("Acceso Permitido. ¡Bienvenido al sistema!");
        } else {
            String motivo;
            if ((codigoAcceso != 2023 && (nivelPermiso < 1 || nivelPermiso > 3) )) {
                motivo = "Motivo: Código de acceso incorrecto y nivel de permiso inválido.";
            } else if (codigoAcceso != 2023) {
                motivo = "Motivo: Código de acceso incorrecto.";
            } else {
                motivo = "Motivo: Nivel de permiso inválido.";
            }
            System.out.printf("""
                    Acceso denegado.  %n""" +
                    motivo + "%n");

        }
        teclado.close();
    }
}
