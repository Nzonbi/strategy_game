package personnages;

import strategies.ComportementArme;

public abstract class Personnage {
    protected String nom;
    protected int scores;
    protected ComportementArme comportementArme;
    public abstract void combattre();

    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }
}
