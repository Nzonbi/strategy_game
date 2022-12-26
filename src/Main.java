import personnages.Personnage;
import personnages.Reine;
import personnages.Roi;
import strategies.ComportementPoignard;

public class Main {
    public static void main(String[] args) {

        Personnage reine = new Reine();
        reine.combattre();
        System.out.println("___________________________");
        reine.combattre();
        System.out.println("___________________________");
        reine.combattre();
        System.out.println("___________________________");
        reine.combattre();
        System.out.println("___________________________");
        reine.combattre();
        System.out.println("___________________________");
        reine.combattre();
        System.out.println("___________________________");
        reine.combattre();
        System.out.println("___________________________");

        /*Personnage roi = new Roi();
        roi.combattre();
        System.out.println("___________________________");
        roi.setComportementArme(new ComportementPoignard());
        roi.combattre();*/
    }
}