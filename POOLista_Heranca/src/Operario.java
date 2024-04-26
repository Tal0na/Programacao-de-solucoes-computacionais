public class Operario extends Empregado {
    // Atributos específicos da classe Operario
    private double valorProducao;
    private double comissao;

    // Construtor padrão
    public Operario() {
    }

    // Construtor com todos os atributos
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Métodos getters e setters para os atributos específicos
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Método para calcular o salário do operário (incluindo a comissão)
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }
}
