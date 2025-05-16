import java.util.Scanner;

public class VerificacionDescuentoEnCompras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor total de su compra: ");
        double valorCompra = teclado.nextDouble();

        if (valorCompra >= 100) {
            valorCompra = descuento(valorCompra);
            System.out.println("""
                    Descuento del 10% aplicado.
                    Nuevo valor: $""" + valorCompra
                    );
        } else {
            System.out.println("""
                    Descuento no aplicado.
                    Valor total: $""" + valorCompra
                    );
        }
        teclado.close();
    }

    public static double descuento(double valor) {
        valor -= (valor * 0.1);
        return valor;
    }
}
