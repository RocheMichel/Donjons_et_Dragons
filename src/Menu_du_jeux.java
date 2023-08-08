import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Menu_du_jeux {

       public void start(){
            /*
           System.out.print("Vous souhaitez créer un nouveau personnage (1) ou quitter le jeu (2) : ");
           initialisation_du_personnage = clavier.nextInt();
           clavier.nextLine();
           System.out.println(" ");


           System.out.print("quel type de personnage vous voulez créer : Guerrier (g), Magicien (m)");
           class_du_personnage = clavier.nextLine();
//---------------------------information ci je choisie le guerrier --------------------------------
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
           } else {
//-------------------------------------information personnage ci je choisie le magicien--------------------------
               if (class_du_personnage.equals("m")) {
                   System.out.println("Vous avez choisie la classe : Magicien");
                   System.out.print("Quel nom voulez-vous donner à votre personnage ?");
                   nom_du_personnage = clavier.nextLine();
                   System.out.println("Le nom de votre personnage est : " + nom_du_personnage);
                   System.out.println("Votre niveau de vie est de : " + niveau_de_vie_magicien);
                   System.out.println("Votre force est de : " + niveau_de_force_du_magicien);

                   System.out.print("Quelles armes principales souhaitez-vous : super-nova (sn) ou Décimation (d) ou si vous souhaitez quitter tapé (q)?");
                   sort_principale = clavier.nextLine();

                   if (sort_principale.equals("sn")) {
                       sort_principale = "super-nova";
                       System.out.println("Voici le sort principal que vous avez choisie : " + sort_principale);
                   } else {
                       if (sort_principale.equals("d")) {
                           sort_principale = "Décimation";
                           System.out.println("Voici le sort principal que vous avez choisie : " + sort_principale);
                       } else {
                           if (sort_principale.equals("q")) {
                               System.exit(0);
                           }
                       }
                   }
                   System.out.print("Quelles sort defensives souhaitez-vous : bulle de protection (bp) ou pluie de l'arme (pa) ou si vous souhaitez quitter tapé (q)?");
                   sort_defensif = clavier.nextLine();

                   if (sort_defensif.equals("bp")) {
                       sort_defensif = "bulle de protection";
                       System.out.println("voici le sort defensif que vous avez choisie le : " + sort_defensif);
                   } else {
                       if (sort_defensif.equals("pa")) {
                           sort_defensif = "pluie de larme";
                           System.out.println("voici le sort defensif que vous avez choisie le : " + sort_defensif);
                       } else {
                           if (sort_defensif.equals("q")) {
                               System.exit(0);
                           }
                       }
                   }
//------------------------------- j'affiche les caracteristique du personnage -------------------------------------

                   System.out.println(" ");
                   System.out.println("Voici le détail de votre personnage");
                   System.out.println(" ");
                   System.out.println("Le nom de votre personnage : " + nom_du_personnage);
                   System.out.println("Son niveau de vie : " + niveau_de_vie_magicien);
                   System.out.println("Sa force : " + niveau_de_force_du_magicien);
                   System.out.println("Pouvoir offensif : " + sort_principale);
                   System.out.println("Pouvoir defensif : " + sort_defensif);
                   System.out.println(" ");

//------------- Changement des caractéristique du personnage ou validation des stats du personnage -----------------------

                   System.out.print("Souhaitez-vous changer les caractéristique de votre personne si oui tapé (o) si c'est non tapé (n)?");
                   decision_de_la_modification_du_personnage = clavier.nextLine();

                   if (decision_de_la_modification_du_personnage.equals("o")) {
                       System.out.print("Quel nom voulez-vous donner à votre personnage ?");
                       nom_du_personnage = clavier.nextLine();

//---------------------------------------------- nom et caracteristique du magicien -------------------------------------------------------------------------

                       System.out.println("Le nom de votre personnage est : " + nom_du_personnage);
                       System.out.print("mettez votre niveau de vie : ");
                       niveau_de_vie_magicien = clavier.nextInt();
                       System.out.println("Votre niveau de vie est de : " + niveau_de_vie_magicien);
                       System.out.print("Mettez votre force : ");
                       niveau_de_force_du_magicien = clavier.nextInt();
                       System.out.println("Votre force est de : " + niveau_de_force_du_magicien);
                       clavier.nextLine();
//----------------------------------------------- Pouvoir def et off du magicien -------------------------------------------------------------------

                       System.out.print("Quelles armes principales souhaitez-vous : super-nova (sn) ou Décimation (d) ou si vous souhaitez quitter (q)?");
                       sort_principale = clavier.nextLine();

                       if (sort_principale.equals("sn")) {
                           sort_principale = "super-nova";
                           System.out.println("Voici le sort principal que vous avez choisie : " + sort_principale);
                       } else {
                           if (sort_principale.equals("d")) {
                               sort_principale = "Décimation";
                               System.out.println("Voici le sort principal que vous avez choisie : " + sort_principale);
                           } else {
                               if (sort_principale.equals("q")) {
                                   System.exit(0);
                               }
                           }
                       }

                       System.out.print("Quelles sort defensives souhaitez-vous : bulle de protection (bp) ou pluie de l'arme (pa) ou si vous souhaitez quitter (q) ?");
                       sort_defensif = clavier.nextLine();

                       if (sort_defensif.equals("bp")) {
                           sort_defensif = "bulle de protection";
                           System.out.println("voici le sort defensif que vous avez choisie le : " + sort_defensif);
                       } else {
                           if (sort_defensif.equals("pa")) {
                               sort_defensif = "pluie de larme";
                               System.out.println("voici le sort defensif que vous avez choisie le : " + sort_defensif);
                           } else {
                               if (sort_defensif.equals("q")) {
                                   System.exit(0);
                               }
                           }

                       }
                       System.out.println("Vos nouveau caracteristique sont : ");
                       System.out.println(" ");
                       System.out.println("Voici le détail de votre personnage");
                       System.out.println(" ");
                       System.out.println("Le nom de votre personnage : " + nom_du_personnage);
                       System.out.println("Son niveau de vie : " + niveau_de_vie_magicien);
                       System.out.println("Sa force : " + niveau_de_force_du_magicien);
                       System.out.println("Pouvoir offensif : " + sort_principale);
                       System.out.println("Pouvoir defensif : " + sort_defensif);
                       System.out.println(" ");

                   }*/

       }
}