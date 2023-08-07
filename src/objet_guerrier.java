import java.util.Scanner;

public class objet_guerrier {
    public static void main(String[] args) {

        String class_du_personnage;
        String nom_du_personnage;
        String arme_principale;
        String arme_deffencive;
        String decision_de_la_modification_du_personnage;
        int niveau_de_vie_guerrier = 10;
        int niveau_de_force_guerrier = 10;


        Scanner clavier = new Scanner(System.in);


        if (class_du_personnage.equals("g")) {
            System.out.println("Vous avez choisie la classe : guerrier");
//-------------------------------- Nom du GUERRIER ---------------------------------------------------
            System.out.print("Quel nom voulez-vous donner à votre personnage ?");
            nom_du_personnage = clavier.nextLine();
            System.out.println("Le nom de votre personnage est : " + nom_du_personnage);
//------------------------------ Caracteristique vie et force du guerrier ----------------------------
            System.out.println("Votre niveau de vie est de : " + niveau_de_vie_guerrier);
            System.out.println("Votre force est de : " + niveau_de_force_guerrier);
//-------------------------------------------- Equipement du guerrier ----------------------------------
            System.out.print("Quelles armes principales souhaitez-vous : Hache (h) ou épée (e) ou quitté le jeux (q)?");
            arme_principale = clavier.nextLine();

            if (arme_principale.equals("h")) {
                arme_principale = "Hache";
                System.out.println("Voici l'arme que vous avez choisie : la " + arme_principale);
            } else {
                if (arme_principale.equals("e")) {
                    arme_principale = "épée";
                    System.out.println("Voici l'arme que vous avez choisie : l'" + arme_principale);
                } else {
                    if (arme_principale.equals("q")) {
                        System.exit(0);
                    }
                }
            }
//--------------------------------------------- Arme defensive ---------------------------------------
            System.out.print("Quelles armes defensives souhaitez-vous : Bouclier du templier (bt) ou bouclier du barbarre (bb) ou quitté le jeux (q)?");
            arme_deffencive = clavier.nextLine();

            if (arme_deffencive.equals("bt")) {
                arme_deffencive = "Bouclier du Templier";
                System.out.println("vous avez choisie le : " + arme_deffencive);
            } else {
                if (arme_deffencive.equals("bb")) {
                    arme_deffencive = "Bouclier du barbare";
                    System.out.println("vous avez choisie le : Bouclier du Barbarre");
                } else {
                    if (arme_deffencive.equals("q")) {
                        System.exit(0);
                    }
                }
            }
            System.out.println(" ");
            System.out.println("Voici le détail de votre personnage");
            System.out.println(" ");
            System.out.println("Le nom de votre personnage : " + nom_du_personnage);
            System.out.println("Son niveau de vie : " + niveau_de_vie_guerrier);
            System.out.println("Sa force : " + niveau_de_force_guerrier);
            System.out.println("Pouvoir offensif : " + arme_principale);
            System.out.println("Pouvoir defensif : " + arme_deffencive);
            System.out.println(" ");

//------------Changement des caractéristique du personnage ou validation des stats du personnage -----------------------

            System.out.print("Souhaitez-vous changer les caractéristique de votre personnage si oui tapé (o) si c'est non tapé (n)?");
            decision_de_la_modification_du_personnage = clavier.nextLine();
            System.out.println(" ");

            if (decision_de_la_modification_du_personnage.equals("o")) {
                System.out.print("Quel nom voulez-vous donner à votre personnage ?");
                nom_du_personnage = clavier.nextLine();
                System.out.println("Le nom de votre personnage est : " + nom_du_personnage);
//------------------------------Caracteristique vie et force du personnage----------------------------
                System.out.print("mettez votre niveau de vie : ");
                niveau_de_vie_guerrier = clavier.nextInt();
                System.out.println("Votre niveau de vie est de : " + niveau_de_vie_guerrier);
                System.out.print("Mettez votre force : ");
                niveau_de_force_guerrier = clavier.nextInt();
                System.out.println("Votre force est de : " + niveau_de_force_guerrier);
                clavier.nextLine();
//--------------------------------------------Equipement du personnage----------------------------------
                System.out.print("Quelles armes principales souhaitez-vous : Hache (h) ou épée (e) ou quitté le jeux (q) ?");
                arme_principale = clavier.nextLine();

                if (arme_principale.equals("h")) {
                    arme_principale = "Hache";
                    System.out.println("Voici l'arme que vous avez choisie : la " + arme_principale);
                } else {
                    if (arme_principale.equals("e")) {
                        arme_principale = "épée";
                        System.out.println("Voici l'arme que vous avez choisie : l'" + arme_principale);
                    } else {
                        if (arme_principale.equals("q")) {
                            System.exit(0);
                        }
                    }
                }
//---------------------------------------------arme defensive---------------------------------------
                System.out.print("Quelles armes defensives souhaitez-vous : Bouclier du templier (bt) ou bouclier du barbarre (bb) ou quitté le jeux (q)?");
                arme_deffencive = clavier.nextLine();

                if (arme_deffencive.equals("bt")) {
                    arme_deffencive = "Bouclier du Templier";
                    System.out.println("vous avez choisie le : " + arme_deffencive);
                } else {
                    if (arme_deffencive.equals("bb")) {
                        arme_deffencive = "Bouclier du barbare";
                        System.out.println("vous avez choisie le : Bouclier du Barbarre");
                    } else {
                        if (arme_deffencive.equals("q")) {
                            System.exit(0);
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("Voici le détail de votre personnage");
                System.out.println(" ");
                System.out.println("Le nom de votre personnage : " + nom_du_personnage);
                System.out.println("Son niveau de vie : " + niveau_de_vie_guerrier);
                System.out.println("Sa force : " + niveau_de_force_guerrier);
                System.out.println("Pouvoir offensif : " + arme_principale);
                System.out.println("Pouvoir defensif : " + arme_deffencive);
                System.out.println(" ");

            }
        }
//-------------------------------------information personnage ci je choisie le magicien--------------------------


    }
}