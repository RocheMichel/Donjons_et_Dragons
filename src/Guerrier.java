//----------------------------------------------------------------------------------- Class Guerrier -----------------------------------------------------------------------------------------------
public class Guerrier {

//---------------------------------------------------------------------------------- Attributs ------------------------------------------------------------------------------------------------------
        String nom_du_personnage;
        String arme_principale_1;
        String arme_principale_2;
        String arme_deffencive_1;
        String arme_deffencive_2;
        int niveau_de_vie_guerrier = 0;
        int niveau_de_force_guerrier = 0;
//-------------------------------------------------------------------------------- Constructeur principal --------------------------------------------------------------------------------------------------------------------------------------------------
        Guerrier(String nom_du_personnage,int niveau_de_vie_guerrier,int niveau_de_force_guerrier,String arme_principale_1, String arme_principale_2,String arme_deffencive_1,String arme_deffencive_2) {
            this.nom_du_personnage = nom_du_personnage;
            this.niveau_de_vie_guerrier = niveau_de_vie_guerrier;
            this.niveau_de_force_guerrier = niveau_de_force_guerrier;
            this.arme_principale_1 = arme_principale_1;
            this.arme_principale_2 = arme_principale_2;
            this.arme_deffencive_1 = arme_deffencive_1;
            this.arme_deffencive_2 = arme_deffencive_2;
        }



}