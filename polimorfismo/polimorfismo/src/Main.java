// Classe Animal (classe base)
class Animal {
    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }
}

// Classe Cachorro (subclasse de Animal)
class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu.");
    }
}

// Classe Gato (subclasse de Animal)
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato miou.");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Cachorro e Gato
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Chamando o método emitirSom() para cada animal
        cachorro.emitirSom(); // Produz: O cachorro latiu.
        gato.emitirSom();     // Produz: O gato miou.
    }
}