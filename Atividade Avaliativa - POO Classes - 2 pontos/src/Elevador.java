public class Elevador {
    private int andarAtual;
    private final int totalAndares;
    private final int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // Térreo
        this.pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio, não é possível entrar mais pessoas.");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio, não é possível sair mais pessoas.");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar, não é possível subir mais.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo, não é possível descer mais.");
        }
    }

    public void mostrarStatus() {
        System.out.println("Andar Atual: " + andarAtual);
        System.out.println("Total de Andares: " + totalAndares);
        System.out.println("Capacidade do Elevador: " + capacidade);
        System.out.println("Pessoas Presentes: " + pessoasPresentes);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}
