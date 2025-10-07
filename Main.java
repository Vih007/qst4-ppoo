/**
 * Simulação (Cliente): Usa as LocationFactory sem se importar com o tipo de inimigo criado.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Jogo: Fase Amazônia ---");
        LocationFactory amazonFactory = new AmazonLocation();
        amazonFactory.spawnEnemy(); // Cria um Animal Mutante

        System.out.println("\n--- Jogo: Fase Sertão ---");
        LocationFactory sertaoFactory = new SertaoLocation();
        sertaoFactory.spawnEnemy(); // Cria um Cangaceiro

        System.out.println("\n--- O Factory Method garante que novos inimigos atacam (requisito do jogo) ---");
    }
}