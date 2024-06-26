import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        // Solicitando ao usuário inserir 10 valores de temperatura
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[10];

        System.out.println("Digite as temperaturas das 10 regiões:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Calculando a temperatura média das regiões
        double media = calcularMedia(temperaturas);

        // Imprimindo a temperatura média
        System.out.println("A temperatura média das regiões é: " + media);
    }

    // Função para calcular a média de um array de temperaturas
    public static double calcularMedia(double[] temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        return soma / temperaturas.length;
    }
}
