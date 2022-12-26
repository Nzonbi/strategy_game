package personnages;

import strategies.ComportementArcEtFleche;
import strategies.ComportementHache;

public class Reine extends Personnage {
    public Reine() {
        this.comportementArme= new ComportementArcEtFleche();
    }

    @Override
    public void combattre() {
        scores+=4;
        System.out.println("je suis ume reine.....");
        this.comportementArme.utiliserArme();
        System.out.println("score="+scores);
        if (scores>15)
            this.setComportementArme(new ComportementHache());
    }
}
