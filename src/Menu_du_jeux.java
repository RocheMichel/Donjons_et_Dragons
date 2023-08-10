
import java.util.Scanner;

public class Menu_du_jeux {


    public Menu_du_jeux() {

    }

    public void start() {
        int initialisation_du_personnage;
        String reponse;
        String class_du_personnage;
        Guerrier mon_personnage= new Guerrier();
        Magicien mon_personnage1= new Magicien();

        Scanner clavier = new Scanner(System.in);

        System.out.print("Vous souhaitez créer un nouveau personnage (1) ou quitter le jeu (2) : ");
        initialisation_du_personnage = clavier.nextInt();
        clavier.nextLine();
        System.out.println(" ");
        if (initialisation_du_personnage == 2) {
            System.exit(0);
        }
        System.out.print("quel type de personnage vous voulez créer : Guerrier (g), Magicien (m)");
        class_du_personnage = clavier.nextLine();
//---------------------------information ci je choisie le guerrier --------------------------------
        if (class_du_personnage.equals("g")) {
            System.out.print("Quel nom voulez-vous donner à votre personnage ?");
            mon_personnage.setNom_du_personnage(clavier.nextLine());
            System.out.print("Quelles armes principales souhaitez-vous : Hache (h) ou épée (e) ou quitté le jeux (q)?");
            reponse=clavier.nextLine();
            if (reponse.equals("h")) {
                mon_personnage.setArme_principale_1("Hache");
            }else {
                if (reponse.equals("e")) {
                    mon_personnage.setArme_principale_1("Epée");
                } else {
                    if (reponse.equals("q")) {
                        System.exit(0);
                    }
                }
            }

            System.out.print("Quelles armes defensives souhaitez-vous : Bouclier du templier (bt) ou bouclier du barbarre (bb) ou quitté le jeux (q)?");
            reponse = clavier.nextLine();

            if (reponse.equals("bt")) {
                mon_personnage.setArme_deffencive_1("Bouclier du Templier");

            } else {
                if (reponse.equals("bb")) {
                    mon_personnage.setArme_deffencive_1("Bouclier du barbare");
                } else {
                    if (reponse.equals("q")) {
                        System.exit(0);
                    }
                }
            }
            System.out.println("Le nom du personnage est :  " + mon_personnage.getNom_du_personnage());
            System.out.println(" Le niveau de vie est : " + mon_personnage.getNiveau_de_vie_guerrier());
            System.out.println(" le niveau de force est : " + mon_personnage.getNiveau_de_force_guerrier());
            System.out.println(" Mon arme pricipale est : " + mon_personnage.getArme_principale_1());
            System.out.println(" Mon arme pricipale est : " + mon_personnage.getArme_deffencive_1());
        }else{
            if (class_du_personnage.equals("m")){
                System.out.print("Quel nom voulez-vous donner à votre personnage ?");
                mon_personnage1.setNom_du_personnage(clavier.nextLine());
                System.out.print("Quelles armes principales souhaitez-vous : Incantation des enfer (i) ou Soif du mal (s) ou quitté le jeux (q)?");
                reponse=clavier.nextLine();
                if (reponse.equals("i")) {
                    mon_personnage1.setSort_principale_1_principale_1("Incantation des enfer");
                }else {
                    if (reponse.equals("s")) {
                        mon_personnage1.setSort_principale_1_principale_1("Soif du mal");
                    } else {
                        if (reponse.equals("q")) {
                            System.exit(0);
                        }
                    }
                }

                System.out.print("Quelles armes defensives souhaitez-vous : Défense cornus (d) ou bouclier de lumière (b) ou quitté le jeux (q)?");
                reponse = clavier.nextLine();

                if (reponse.equals("d")) {
                    mon_personnage1.setSort_deffencive_1_deffencive_1("Défense cornus");

                } else {
                    if (reponse.equals("b")) {
                        mon_personnage1.setSort_deffencive_1_deffencive_1("bouclier de lumière");
                    } else {
                        if (reponse.equals("q")) {
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Le nom du personnage est :  " + mon_personnage1.getNom_du_personnage());
                System.out.println(" Le niveau de vie est : " + mon_personnage1.getNiveau_de_vie_magicien());
                System.out.println(" le niveau de force est : " + mon_personnage1.getNiveau_de_force_magicien());
                System.out.println(" Mon sort d'attaque est : " + mon_personnage1.getSort_principale_1());
                System.out.println(" Mon sort de défense est : " + mon_personnage1.getSort_deffencive_1());
            }
        }
    }
}