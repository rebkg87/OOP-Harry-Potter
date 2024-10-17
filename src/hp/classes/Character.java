package hp.classes;

import hp.interfaces.Fightable;
import hp.interfaces.SpellCaster;

public abstract class Character implements Fightable, SpellCaster {
    protected String name;
    protected int age;
    protected int health;
    protected boolean isAWizard;

    public Character(String name, int age, int health, boolean isAWizard) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.isAWizard = isAWizard;
    }

    public abstract String introduce();
    
    public abstract String doing();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean getIsAWizard() {
        return this.isAWizard;
    }

    public void setIsAWizard(boolean isAWizard) {
        this.isAWizard = isAWizard;
    }

    @Override
    public void attack(Fightable target){
        int damage = 20;
        target.receiveDamage(damage);
        System.out.println(getName() + " ha atacado a " + ((Character)target).getName() + " causando " + damage + " de daño.");
    }

    @Override
    public void receiveDamage(int damage){
        health -= damage;
        if (health < 0) health=0;
        System.out.println(getName() + " recibió " + damage + " de daño. Salud restante: " + health + "%");
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }

    @Override
    public void castSpell(Character target){
        Spell spell = SpellList.getRandomSpell();
        System.out.println(getName() + " lanza " + spell + " a " + target.getName());
        target.receiveSpell(spell);
    }

    @Override
    public void receiveSpell(Spell spell){
        receiveDamage(spell.getDamage());
        System.out.println(getName()+ " recibió el hechizo " + spell.getName());
    }
}
