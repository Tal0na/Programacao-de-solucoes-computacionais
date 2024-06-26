import java.util.Random;

public class MediaVetor {
    public static void main(String[] args) {
        // Criando um vetor com 10 números inteiros aleatórios
        int[] vetor = new int[10];
        preencherVetorAleatorio(vetor);

        // Calculando a média dos elementos do vetor
        double media = calcularMedia(vetor);

        // Exibindo o vetor e a média
        System.out.println("Vetor:");
        imprimirVetor(vetor);
        System.out.println("Média dos elementos: " + media);
    }

    // Função para preencher um vetor com números inteiros aleatórios
    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Números inteiros aleatórios entre 0 e 99
        }
    }

    // Função para calcular a média dos elementos de um vetor
    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (double) soma / vetor.length;
    }

    // Função para imprimir os elementos de um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

