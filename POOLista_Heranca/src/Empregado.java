public class Empregado extends Pessoa {
    // Atributos específicos da classe Empregado
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    // Construtor padrão
    public Empregado() {
    }

    // Construtor com todos os atributos
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    // Métodos getters e setters para os atributos específicos
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Método para calcular o salário líquido
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Exemplo de uso da classe Empregado
        Empregado empregado = new Empregado("João", "Rua B, 456", "987654321", 123, 2500.0, 10.0);
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());
    }
}
