import java.util.ArrayList;
import java.util.List;

public class Joueur {
    List<Cartes> cartejoueur = new ArrayList<Cartes>();
    Wonders wonder;
    String nom;

    public Joueur(String nom){
        this.nom = nom;
    }

    void getCarte(Cartes carte){
        cartejoueur.add(carte);
    }

    void getWonder(Wonders w){
        wonder = w;
    }

    void affichecartes(){
        System.out.print("[");
        for(int i = 0; i < cartejoueur.size(); i++){
            if(i == cartejoueur.size()-1) {
                System.out.print(cartejoueur.get(i).nom+"("+cartejoueur.get(i).couleur+")");
            }else{
                System.out.print(cartejoueur.get(i).nom+"("+cartejoueur.get(i).couleur+")"+",");
            }
        }
        System.out.println("]");
    }
}
