import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor para armazenar os números
        int[] vetor = new int[10];

        // Preenchendo o vetor com números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números primos e suas respectivas posições:");

        // Verificando e exibindo números primos e suas posições
        for (int i = 0; i < vetor.length; i++) {
            if (isPrimo(vetor[i])) {
                System.out.println("Posição " + i + ": " + vetor[i]);
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
