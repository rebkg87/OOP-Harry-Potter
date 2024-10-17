package hp.classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpellList {
    private static  List<Spell> spells = new ArrayList<>();

    static {
        spells.add(new Spell("Expelliarmus", 25));
        spells.add(new Spell("Protego",  10));
        spells.add(new Spell("Stupefy", 15));
        spells.add(new Spell("Lumos", 5));
        spells.add(new Spell("Avada Kedavra", 100));
        spells.add(new Spell("Crucio", 50));
        spells.add(new Spell("Imperio", 30));
        spells.add(new Spell("Sectumsempra", 40));
    }

    public static Spell getRandomSpell(){
        Random random = new Random();
        return spells.get(random.nextInt(spells.size()));
    }

}
