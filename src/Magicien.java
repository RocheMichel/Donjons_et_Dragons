//----------------------------------------------------------------------------------- Class Guerrier -----------------------------------------------------------------------------------------------
public class Magicien {

//---------------------------------------------------------------------------------- Attributs ------------------------------------------------------------------------------------------------------
        String nom_du_personnage;
        String sort_principale_1;
        String sort_principale_2;
        String sort_deffencive_1;
        String sort_deffencive_2;
        int niveau_de_vie_magicien = 0;
        int niveau_de_force_magicien = 0;
//-------------------------------------------------------------------------------- Constructeur principal --------------------------------------------------------------------------------------------------------------------------------------------------
        Magicien(String nom_du_personnage,int niveau_de_vie_magicien,int niveau_de_force_magicien,String sort_principale_1, String sort_principale_2,String sort_deffencive_1,String sort_deffencive_2){

            this.nom_du_personnage = nom_du_personnage;
            this.niveau_de_vie_magicien =niveau_de_vie_magicien ;
            this.niveau_de_force_magicien = niveau_de_force_magicien;
            this.sort_principale_1 = sort_principale_1;
            this.sort_principale_2 = sort_principale_2;
            this.sort_deffencive_1 = sort_deffencive_1;
            this.sort_deffencive_2 = sort_deffencive_2;


    }

}
