public class Administrador extends Empregado {
    // Atributos específicos da classe Administrador
    private double ajudaDeCusto;

    // Construtor padrão
    public Administrador() {
    }

    // Construtor com todos os atributos
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Métodos getters e setters para o atributo específico
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Método para calcular o salário do administrador (incluindo a ajuda de custo)
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}