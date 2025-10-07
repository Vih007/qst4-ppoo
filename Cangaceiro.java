/**
 * Produto Concreto: Inimigo do Sertão
 */
public class Cangaceiro implements Enemy {
    @Override
    public String getName() {
        return "Cangaceiro Lampião";
    }

    @Override
    public void attack() {
        System.out.println("  -> Cangaceiro disparou com o Rifle!");
    }
}