/**
 * Criador Concreto: Implementa o Factory Method para criar um Cangaceiro.
 */
public class SertaoLocation extends LocationFactory {
    @Override
    protected Enemy createEnemy() {
        return new Cangaceiro();
    }
}