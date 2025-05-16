import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        int numeroMaximoPosible = 100;
        int numeroSecreto = new Random().nextInt(numeroMaximoPosible + 1);
        int numeroUsuario = 0;
        int intentos = 1;
        int maximosIntentos = 5;

        System.out.println("\033[31m " + numeroSecreto);

        while (numeroUsuario != numeroSecreto) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("\033[0;43;30m Me indicas un número entre el 1 al " + numeroMaximoPosible + " por favor: \033[0;35m");
            numeroUsuario = teclado.nextInt();

            //Se realiza las comparaciónes
            if (numeroUsuario == numeroSecreto) {
                //Para utilizar el operador ternario en el formateo
                String operadorTernario = intentos == 1 ? "vez" : "veces";
                System.out.printf("\033[31m Acertaste, el número secreto es: %d. Lo hiciste en %d %s%n \033[37m",numeroSecreto, intentos, operadorTernario);
                break;
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("\033[35m El número secreto es menor");
            } else {
                System.out.println("\033[36m El número secreto es mayor");
            }
            //incremento el número de intentos
            intentos++;
            //valido el máximo número de intentos y hago salto de linea %n
            if (intentos > maximosIntentos) {
                System.out.printf("\033[31m Llegaste al número máximo de %d intentos%n \033[37m", maximosIntentos);
                break;
            }
        }
    }
}
