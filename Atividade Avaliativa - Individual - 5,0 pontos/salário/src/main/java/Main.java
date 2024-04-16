import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para o empregado 1
        System.out.println("Digite o primeiro nome do empregado 1:");
        String primeiroNome1 = scanner.next();

        System.out.println("Digite o sobrenome do empregado 1:");
        String sobrenome1 = scanner.next();

        System.out.println("Digite o salário mensal do empregado 1:");
        double salarioMensal1 = scanner.nextDouble();

        // Entrada de dados para o empregado 2
        System.out.println("Digite o primeiro nome do empregado 2:");
        String primeiroNome2 = scanner.next();

        System.out.println("Digite o sobrenome do empregado 2:");
        String sobrenome2 = scanner.next();

        System.out.println("Digite o salário mensal do empregado 2:");
        double salarioMensal2 = scanner.nextDouble();

        // Criando duas instâncias da classe Empregado com os dados fornecidos
        Empregado empregado1 = new Empregado(primeiroNome1, sobrenome1, salarioMensal1);
        Empregado empregado2 = new Empregado(primeiroNome2, sobrenome2, salarioMensal2);

        // Calculando e exibindo o salário anual de cada empregado (soma dos salários mensais)
        double salarioAnualTotalAntes = empregado1.getSalarioMensal() + empregado2.getSalarioMensal();
        System.out.println("Salário anual total antes do aumento: " + salarioAnualTotalAntes);

        // Aumentando o salário de cada empregado em 10%
        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);

        // Calculando e exibindo o salário anual de cada empregado após o aumento
        double salarioAnualTotalDepois = empregado1.salarioAnual() + empregado2.salarioAnual();
        System.out.println("Salário anual total após aumento: " + salarioAnualTotalDepois);

        // Fechando o scanner
        scanner.close();
    }
}