import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);
        
        int soma = 0; 
        
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
            soma += i; 
        }

        System.out.println("A soma dos números no intervalo é: " + soma);
        
        scanner.close();
    }
}