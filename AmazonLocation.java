/**
 * Criador Concreto: Implementa o Factory Method para criar um MutantAnimal.
 */
public class AmazonLocation extends LocationFactory {
    @Override
    protected Enemy createEnemy() {
        return new MutantAnimal();
    }
}