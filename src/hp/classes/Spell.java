package hp.classes;

public class Spell {
    private String name;
    private int damage; 

    public Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString() {
        return name;
    }

    public void cast (Character target){
        target.receiveDamage(damage);
    }
}
