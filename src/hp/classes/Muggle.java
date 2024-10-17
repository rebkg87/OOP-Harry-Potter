package hp.classes;

public class Muggle extends Character {
    public Muggle (String name) {
        super(name, 0, 100, false);
    }

    @Override
    public String introduce(){
        return "Hola, soy " + super.getName() + " y soy un muggle.";
    }

    @Override
    public String doing(){
        return super.getName() + " está haciendo cualquier cosa aburrida de Muggle.";
    }

    @Override
    public void castSpell(Character target){
    }

    @Override
    public void receiveSpell(Spell spell){
    }
}
