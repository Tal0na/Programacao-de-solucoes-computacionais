import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida: " + nota);
                break;
            } else {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}