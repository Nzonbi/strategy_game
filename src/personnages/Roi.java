package personnages;

import strategies.ComportementArcEtFleche;
import strategies.ComportementHache;

public class Roi extends Personnage {
    public Roi() {
        this.comportementArme= new ComportementHache();
    }

    @Override
    public void combattre() {
        scores+=2;
        System.out.println("je suis um roi.....");
        this.comportementArme.utiliserArme();
        System.out.println("score="+scores);
    }
}
