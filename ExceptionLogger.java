import java.io.IOException;
import java.util.logging.*;

public class LogExample {

    // Cria uma instância do Logger
    private static final Logger logger = Logger.getLogger(LogExample.class.getName());

    static {
        try {
            // Define o formato do log e o arquivo de saída
            LogManager.getLogManager().reset();
            logger.setLevel(Level.ALL);
            
            // Configura o FileHandler para escrever logs em um arquivo
            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            // Opcional: Configura o ConsoleHandler para também escrever logs no console
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            consoleHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(consoleHandler);

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Erro ao configurar o logger", e);
        }
    }

    public static void main(String[] args) {
        try {
            // Simula uma exceção para demonstrar o registro no log
            throw new RuntimeException("Erro de exemplo");
        } catch (Exception e) {
            // Registra a exceção no log
            logger.log(Level.SEVERE, "Exceção capturada", e);
        }
    }
}
