import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE; // Inicializamos a variável "maior" com o menor valor possível
        
        // Loop para ler os 5 números e encontrar o maior
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            // Verificar se o número atual é maior que o armazenado na variável "maior"
            if (numero > maior) {
                maior = numero; // Se sim, atualizamos o valor de "maior"
            }
        }
        
        // Após ler os 5 números, imprimir o maior número encontrado
        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }
}
