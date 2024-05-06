import java.util.HashMap;
import java.util.Map;

public class SuperHeroi {
    private String nome;
    private String nomeReal;
    private Map<String, Integer> superpoderes;

    // Construtor
    public SuperHeroi(String nome, String nomeReal) {
        this.nome = nome;
        this.nomeReal = nomeReal;
        this.superpoderes = new HashMap<>();
    }

    // Método para adicionar superpoderes
    public void adicionarSuperpoder(String poder, int nivel) {
        superpoderes.put(poder, nivel);
    }

    // Método para exibir informações do super-herói
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nome real: " + nomeReal);
        System.out.println("Superpoderes:");
        for (Map.Entry<String, Integer> entry : superpoderes.entrySet()) {
            System.out.println("- " + entry.getKey() + ": Nível " + entry.getValue());
        }
        System.out.println();
    }

    // Método principal para testar
    public static void main(String[] args) {
        // Criando instâncias de super-heróis
        SuperHeroi homemDeFerro = new SuperHeroi("Homem de Ferro", "Tony Stark");
        homemDeFerro.adicionarSuperpoder("Engenharia Intelectual", 5);
        homemDeFerro.adicionarSuperpoder("Armadura Tecnológica", 4);
        homemDeFerro.adicionarSuperpoder("Inteligência Superior", 5);
        homemDeFerro.exibirInformacoes();

        SuperHeroi superHomem = new SuperHeroi("Super-Homem", "Kal-El (Clark Kent)");
        superHomem.adicionarSuperpoder("Super Força", 5);
        superHomem.adicionarSuperpoder("Voo", 5);
        superHomem.adicionarSuperpoder("Visão de Raio-X", 4);
        superHomem.exibirInformacoes();
    }
}