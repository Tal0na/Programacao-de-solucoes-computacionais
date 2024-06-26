import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        double[] notas = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}