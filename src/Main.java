import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cartes pierre = new Cartes("Pierre","Gris");
        Cartes Brique = new Cartes("Brique","Gris");
        Joueur Sofiane = new Joueur("Sofiane");
        Wonders pyramid = new Wonders("Pyramid");

        Sofiane.affichecartes();
        Sofiane.getCarte(pierre);
        Sofiane.affichecartes();
        Sofiane.getCarte(Brique);
        Sofiane.affichecartes();
        Sofiane.getWonder(pyramid);
        System.out.println(Sofiane.wonder.nom);
    }
}