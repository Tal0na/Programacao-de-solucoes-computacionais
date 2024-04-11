import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a capacidade do elevador:");
        int capacidade = scanner.nextInt();
        System.out.println("Informe o total de andares no prédio (desconsiderando o térreo):");
        int totalAndares = scanner.nextInt();

        Elevador elevador = new Elevador(capacidade, totalAndares);
        Predio predio = new Predio(totalAndares);

        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Entrar no elevador");
            System.out.println("2. Sair do elevador");
            System.out.println("3. Subir um andar");
            System.out.println("4. Descer um andar");
            System.out.println("5. Mostrar status do elevador");
            System.out.println("6. Sair do programa");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    elevador.entrar();
                    break;
                case 2:
                    elevador.sair();
                    break;
                case 3:
                    elevador.subir();
                    break;
                case 4:
                    elevador.descer();
                    break;
                case 5:
                    elevador.mostrarStatus();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida, por favor escolha novamente.");
            }
        }

        scanner.close();
    }
}
