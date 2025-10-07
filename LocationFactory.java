/**
 * Criador Abstrato: Declara o Factory Method, que retorna um objeto do tipo Enemy.
 */
public abstract class LocationFactory {

    // O método principal que o cliente chama.
    public Enemy spawnEnemy() {
        Enemy enemy = createEnemy();
        // Lógica que pode ser comum a todas as localizações (ex: garantir que ele ataque)
        System.out.println("Um novo inimigo surgiu: " + enemy.getName());
        enemy.attack(); // Requisito: Os inimigos devem sempre atacar o jogador.
        return enemy;
    }

    // O Factory Method: Subclasses (localizações) implementam para definir qual Enemy criar.
    protected abstract Enemy createEnemy();
}