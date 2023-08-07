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
        } else {
        if (decision_de_la_modification_du_personnage.equals("n")) {
        System.exit(0);
        }
        }
