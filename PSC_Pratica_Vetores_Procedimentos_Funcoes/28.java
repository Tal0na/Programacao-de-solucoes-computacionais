import java.util.Scanner;

public class RelatorioVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioFixo = 545.00;
        double[] precos = new double[10];
        int[] quantidades = new int[10];

        System.out.println("Digite os preços dos produtos vendidos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            System.out.print("Quantidade vendida do produto " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();
        }

        double valorVendas = 0;
        for (int i = 0; i < precos.length; i++) {
            valorVendas += precos[i] * quantidades[i];
        }

        double comissao = valorVendas * 0.05;
        double salarioTotal = salarioFixo + comissao;

        System.out.println("Relatório de vendas:");
        for (int i = 0; i < precos.length; i++) {
            double valorTotal = precos[i] * quantidades[i];
            System.out.println("Produto " + (i + 1) + ": Quantidade vendida = " + quantidades[i] +
                    ", Valor unitário = " + precos[i] + ", Valor total = " + valorTotal);
        }

        System.out.println("Valor geral das vendas: " + valorVendas);
        System.out.println("Valor da comissão: " + comissao);
        System.out.println("Salário total do vendedor: " + salarioTotal);
    }
}
