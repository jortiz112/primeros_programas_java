import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {
        String nombre = "Julio César Ortiz Pabón";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int menu;

        System.out.printf("""
                \033[0;43;30m**********************************************\033[0;37m%n%n""" +
                """
                \033[0;43;30m\033[31mNombre del cliente:\033[30m""" + " " + nombre + "   \033[0;37m" + "%n\033[0;37m" +
                """
                \033[0;43;30m\033[31mTipo de cuenta:\033[30m""" + " " + tipoDeCuenta + "                     \033[0;37m" + "%n\033[0;37m" +
                """
                \033[0;43;30m\033[31mSaldo disponible:\033[30m""" + " $" + saldoDisponible + "                    \033[0;37m" + "%n%n\033[0;37m" +
                """
                \033[0;43;30m\033[30m**********************************************""" + "\033[0;37m%n%n"
                );

        do {
            System.out.println("""
                    \033[0;43;30m\033[30m********************\033[31m-MENU-\033[30m********************\033[0;37m
                    \033[0;43;30m\033[37m**--Escriba el número de la opción deseada--**\033[0;37m
                    \033[0;43;30m    \033[32m1 - \033[30mConsultar saldo                       \033[0;37m
                    \033[0;43;30m    \033[32m2 - \033[30mRetirar                               \033[0;37m
                    \033[0;43;30m    \033[32m3 - \033[30mDepositar                             \033[0;37m
                    \033[0;43;30m    \033[32m9 - \033[30mSalir                                 \033[0;37m""");
            //Ingreso de opciones del menu por el usuario
            Scanner teclado = new Scanner(System.in);
            System.out.print("\033[31m>> ");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.printf("\033[35mEl saldo disponible es: \033[32m$ %.2f%n", saldoDisponible);
                    break;
                case 2:
                    System.out.println("\033[34mCuál es el valor que deseas retirar?");
                    double retirarSaldo = teclado.nextDouble();
                    if (saldoDisponible >= retirarSaldo) {
                        saldoDisponible -= retirarSaldo;
                        System.out.printf("\033[35mSaldo restante: \033[32m$ %.2f%n", saldoDisponible);
                    } else {
                        System.out.println("\033[31mSaldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("\033[34mCuál es el valor que vas a depositar?");
                    double depositarSaldo = teclado.nextDouble();
                    saldoDisponible += depositarSaldo;
                    System.out.printf("\033[35mEl saldo actualizado es: \033[32m$ %.2f%n", saldoDisponible);
                    break;
                case 9:
                    System.out.println("\033[35m☺☺☺ Finalizado el programa. Muchas gracias por usar nuestros servicios. ☺☺☺");
                    break;
                default:
                    System.out.println("\033[35m☺☺☺ Opción no válida, favor intenta nuevamente con una opción del menú. ☺☺☺");
            }

        } while (menu < 9);
    }
}
