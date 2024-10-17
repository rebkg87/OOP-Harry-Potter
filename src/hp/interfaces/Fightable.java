package hp.interfaces;

public interface Fightable {
    void attack(Fightable target);
    void receiveDamage(int damage);
    boolean isAlive();
}
