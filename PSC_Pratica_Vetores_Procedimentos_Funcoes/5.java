import java.util.Random;

public class VerificarIndice {
    public static void main(String[] args) {
        // Criando um vetor com 15 números inteiros aleatórios entre 1 e 50
        int[] vetor = new int[15];
        preencherVetorAleatorio(vetor, 1, 50);

        // Verificando se o número 20 existe no vetor e obtendo seu índice, se existir
        int indice = verificarIndice(vetor, 20);

        // Exibindo o vetor e o resultado da verificação
        System.out.println("Vetor:");
        imprimirVetor(vetor);
        if (indice != -1) {
            System.out.println("O número 20 foi encontrado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número 20 não foi encontrado no vetor.");
        }
    }

    // Função para preencher um vetor com números inteiros aleatórios dentro de um intervalo especificado
    public static void preencherVetorAleatorio(int[] vetor, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(max - min + 1) + min;
        }
    }

    // Função para verificar se um número existe em um vetor e retornar seu índice, se existir
    public static int verificarIndice(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1; // Retorna -1 se o número não for encontrado no vetor
    }

    // Função para imprimir os elementos de um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
