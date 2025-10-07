/**
 * Produto Concreto: Inimigo da Amazônia
 */
public class MutantAnimal implements Enemy {
    @Override
    public String getName() {
        return "Animal Mutante da Amazônia";
    }

    @Override
    public void attack() {
        System.out.println("  -> Animal Mutante usou Presas Tóxicas!");
    }
}