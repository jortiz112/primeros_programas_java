import java.util.Random;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        int numeroMaximoPosible = 100;
        int numeroSecreto = new Random().nextInt(numeroMaximoPosible + 1);
        int numeroUsuario = 0;
        int intentos = 1;
        int maximosIntentos = 5;

        System.out.println(numeroSecreto);

        while (numeroUsuario != numeroSecreto) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Me indicas un número entre el 1 al " + numeroMaximoPosible + " por favor:");
            numeroUsuario = teclado.nextInt();

            //Se realiza las comparaciónes
            if (numeroUsuario == numeroSecreto) {
                //Para utilizar el operador ternario en el formateo
                String operadorTernario = intentos == 1 ? "vez" : "veces";
                System.out.printf("Acertaste, el número secreto es: %d. Lo hiciste en %d %s%n", numeroSecreto, intentos, operadorTernario);
                break;
            } else {
                if (numeroUsuario > numeroSecreto) {
                    System.out.println("El número secreto es menor");
                } else {
                    System.out.println("El número secreto es mayor");
                }
            }
            //incremento el número de intentos
            intentos++;
            //valido el máximo número de inytentos
            if (intentos > maximosIntentos) {
                System.out.printf("Llegaste al número máximo de %d intentos", maximosIntentos);
                break;
            }

        }
    }
}

