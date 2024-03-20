import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0; // Variável para armazenar a soma dos números
        int media; // Variável para armazenar a média dos números
        
        // Loop para ler os 5 números e calcular a soma
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            soma += numero; // Adiciona o número à soma acumulada
        }
        
        // Calcula a média dos números
        media = soma / 5;
        
        // Imprime a soma e a média dos números
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}
