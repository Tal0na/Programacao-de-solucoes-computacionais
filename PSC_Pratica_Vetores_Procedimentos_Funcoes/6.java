import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RemoverElemento {
    public static void main(String[] args) {
        // Criando um vetor com 30 números inteiros aleatórios entre 1 e 100
        int[] vetor = new int[30];
        preencherVetorAleatorio(vetor, 1, 100);

        // Exibindo o vetor antes da remoção
        System.out.println("Vetor antes da remoção:");
        imprimirVetor(vetor);

        // Pedindo ao usuário para digitar um valor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para remover do vetor: ");
        int valor = scanner.nextInt();

        // Verificando se o valor existe no vetor e removendo-o
        vetor = removerElemento(vetor, valor);

        // Exibindo o vetor após a remoção
        System.out.println("Vetor após a remoção:");
        imprimirVetor(vetor);
    }

    // Função para preencher um vetor com números inteiros aleatórios dentro de um intervalo especificado
    public static void preencherVetorAleatorio(int[] vetor, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(max - min + 1) + min;
        }
    }

    // Função para remover um elemento de um vetor
    public static int[] removerElemento(int[] vetor, int valor) {
        int index = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int[] novoVetor = new int[vetor.length - 1];
            System.arraycopy(vetor, 0, novoVetor, 0, index);
            System.arraycopy(vetor, index + 1, novoVetor, index, vetor.length - index - 1);
            return novoVetor;
        } else {
            System.out.println("O valor não foi encontrado no vetor.");
            return vetor;
        }
    }

    // Função para imprimir os elementos de um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}