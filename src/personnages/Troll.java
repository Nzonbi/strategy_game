package personnages;

import strategies.ComportementArcEtFleche;
import strategies.ComportementPoignard;

public class Troll extends Personnage {
    public Troll() {
        this.comportementArme= new ComportementPoignard();
    }

    @Override
    public void combattre() {
        scores+=1;
        System.out.println("je suis um troll.....");
        this.comportementArme.utiliserArme();
        System.out.println("score="+scores);
    }
}
