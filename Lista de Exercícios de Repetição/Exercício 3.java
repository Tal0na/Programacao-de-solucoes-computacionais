import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Informe a população do país A: ");
        double populacaoA = scanner.nextDouble();
        System.out.print("Informe a taxa de crescimento anual do país A (em %): ");
        double taxaCrescimentoA = scanner.nextDouble() / 100.0;
        
        
        System.out.print("Informe a população do país B: ");
        double populacaoB = scanner.nextDouble();
        System.out.print("Informe a taxa de crescimento anual do país B (em %): ");
        double taxaCrescimentoB = scanner.nextDouble() / 100.0;
        
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA *= (1 + taxaCrescimentoA);
            populacaoB *= (1 + taxaCrescimentoB);
            anos++;
        }
        
        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse a população do país B.");
        
        scanner.close();
    }
}