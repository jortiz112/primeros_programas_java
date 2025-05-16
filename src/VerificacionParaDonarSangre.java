import java.util.Scanner;

public class VerificacionParaDonarSangre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad del donante: ");
        int edadDonante = teclado.nextInt();
        System.out.println("Ingrese el peso del donante en Kilogramos(Kg): ");
        int pesoDonante = teclado.nextInt();

        if ((edadDonante >= 18 && edadDonante <= 65) && pesoDonante > 50) {
            System.out.println("El donante es compatible para donar sangre.");
        }else {
            String motivo;
            if ((edadDonante < 18 || edadDonante > 65) && pesoDonante <= 50) {
                motivo = "Motivo: Debe tener entre 18 y 65 años de edad y debe tener un peso mayor a 50 Kg.";
            } else if (edadDonante < 18 || edadDonante > 65) {
                motivo = "Motivo: Debe tener entre 18 y 65 años de edad.";
            } else {
                motivo = "Motivo: Debe tener un peso mayor a 50 Kg.";
            }
            System.out.printf("""
                    El donante no es compatible. %n""" +
                    motivo + "%n");
        }
        teclado.close();
    }
}
