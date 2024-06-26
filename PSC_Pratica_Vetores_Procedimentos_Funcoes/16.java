import java.util.Scanner;

public class RespostasEntrevistados {
    public static void main(String[] args) {
        int[] respostas = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as respostas dos entrevistados:");
        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Resposta " + (i + 1) + ": ");
            respostas[i] = scanner.nextInt();
        }

        System.out.println("Respostas na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
    }
}