public class Vendedor extends Empregado {
    // Atributos específicos da classe Vendedor
    private double valorVendas;
    private double comissao;

    // Construtor padrão
    public Vendedor() {
    }

    // Construtor com todos os atributos
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Métodos getters e setters para os atributos específicos
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Método para calcular o salário do vendedor (incluindo a comissão)
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }
}
