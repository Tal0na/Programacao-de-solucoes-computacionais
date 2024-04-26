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

    // Getter e setter para o atributo específico
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

    // Método principal para teste
    public static void main(String[] args) {
        // Exemplo de uso da classe Administrador
        Administrador admin = new Administrador("Ana", "Rua C, 789", "555444333", 456, 3000.0, 15.0, 500.0);
        System.out.println("Salário do Administrador: " + admin.calcularSalario());
    }
}
