import java.sql.SQLOutput;
import java.util.Random;

public class deplacement_du_joueur {
    private int emplacement_du_joueur;

    private int nbr_du_dice;
    public deplacement_du_joueur(){
        this.nbr_du_dice = 1;
        this.emplacement_du_joueur = 1;
    }
    public void nbr_aleatoire(){
        Random nbr_du_dice = new Random();
        System.out.println(nbr_du_dice.nextInt(7));
    }
    public int getNbr_du_dice(){
        return nbr_du_dice;
    }
    public void setNbr_du_dice(int nbr){nbr_du_dice = nbr;}

    public void deplacement(){
        int nbr_de_case_que_dispose_le_plateau = 64;
        emplacement_du_joueur = 1;
        int deplacement = 0;
        System.out.println(emplacement_du_joueur);
        while (emplacement_du_joueur<nbr_de_case_que_dispose_le_plateau){
            while (deplacement<nbr_du_dice){
                deplacement++;
            }
            emplacement_du_joueur = emplacement_du_joueur + deplacement;
            deplacement = 0;
            System.out.println(emplacement_du_joueur);
        }
    }
    public int getEmplacement_du_joueur(){
        return emplacement_du_joueur;
    }
    public void setEmplacement_du_joueur(int nbr){emplacement_du_joueur = nbr;}

}
