import java.util.Scanner;

public class SaldoFinal {
    public static void main(String[] args) {
        double[] entradas = new double[5];
        double[] saidas = new double[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de entrada de recursos:");
        for (int i = 0; i < entradas.length; i++) {
            System.out.print("Entrada " + (i + 1) + ": ");
            entradas[i] = scanner.nextDouble();
        }

        System.out.println("Digite os valores de saída de recursos:");
        for (int i = 0; i < saidas.length; i++) {
            System.out.print("Saída " + (i + 1) + ": ");
            saidas[i] = scanner.nextDouble();
        }

        double saldoFinal = calcularSaldoFinal(entradas, saidas);
        System.out.println("O saldo final é: " + saldoFinal);
    }

    public static double calcularSaldoFinal(double[] entradas, double[] saidas) {
        double somaEntradas = 0;
        for (double entrada : entradas) {
            somaEntradas += entrada;
        }

        double somaSaidas = 0;
        for (double saida : saidas) {
            somaSaidas += saida;
        }

        return somaEntradas - somaSaidas;
    }
}
