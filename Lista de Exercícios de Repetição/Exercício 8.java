import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Números inteiros no intervalo [" + num1 + ", " + num2 + "]:");
        
        // Determina o menor e o maior número para o intervalo
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);
        
        // Loop para iterar sobre o intervalo
        for (int i = menor; i <= maior; i++) {
            System.out.println(i); // Imprime o número no intervalo
        }
        
        scanner.close();
    }
}
