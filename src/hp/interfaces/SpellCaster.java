package hp.interfaces;

import hp.classes.Spell;
import hp.classes.Character;

public interface SpellCaster {
    void castSpell(Character target);
    void receiveSpell(Spell spell);
}
