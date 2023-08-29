import java.util.ArrayList; // ça me permet d'utiliser la fonction liste de tableau
import com.mysql.cj.jdbc.Driver;// j'etablis la connection au serveur mysql
import java.sql.Connection;// j'etablis la connection au serveur mysql avec le driver manager
import java.sql.DriverManager;// on ajoute le driver à la liste des drivers de java
import java.sql.Statement;// je prepare la ou les requete(s)
import java.sql.ResultSet;// j'execute une requete
public class Database {
    public static ArrayList<Personnage> getHeroes() { //c'est la fonction qui me retourne la liste des éléments compris dans mon tableau
        ArrayList<Personnage> personnages =  new ArrayList<Personnage>();// création de l'objet personnages qui est lui même un tableau de liste


        //je vais créer un ogjet de type driver pour me connecter à la bdd
        try {
            Driver pilote = new Driver(); // on créer le driver
            DriverManager.registerDriver(pilote); // on ajoute le driver à la liste des drivers de java ce qui permet de pouvoir interagir avec le driver qui lui interagis avec la base de données

            String protocole = "jdbc:mysql";
            String adresseIP = "localhost";
            String port = "3306";
            String nomDeLaBaseDeDonee = "infos_perso";
            Connection connectToDataBase = DriverManager.getConnection(protocole + "://" + adresseIP + ":" + port + "/" + nomDeLaBaseDeDonee, "root", "Michelroche@07");
            // j'etablis la connection au serveur mysql avec le driver manager les argument url correspond à l'adresse ou ce trouve ma bbd,
            // ma fonction connection est composée de 3 arguments : une url, nom utilisateur, et un mot de passe
            // l'url et lui même composée de 4 partie : le protocole, l'adresse ip, le port, le nom de la bdd

            Statement preparationDeRequettes = connectToDataBase.createStatement(); // je prepare la ou les requete(s)

            ResultSet resultatDuneRequette = preparationDeRequettes.executeQuery("SELECT * FROM magicien;");// j'execute une requete

            while (resultatDuneRequette.next()) { // c'est pour parcourire les differentes lignes de ma table magicien
                //j'ai creer une variable qui comprend la class Magicien je la nom magicien et je lui dit qu'elle contiendra toutes les types compris dans la de base de données
                Magicien magicien= new Magicien( resultatDuneRequette.getString("nom"),resultatDuneRequette.getInt("niveau_de_vie"), resultatDuneRequette.getInt("forcee"),resultatDuneRequette.getString("sort"),"",resultatDuneRequette.getString("protection"),"");
                personnages.add(magicien);//ça veut dire que je met dans la variable personnages les valeurs compris dans la class magicien
//                System.out.println("Le magicien s'appel " + resultatDuneRequette.getString("nom")); //j'affiche le resultat de ma requete
//                System.out.println("Le magicien s'appel " + resultatDuneRequette.getString("class_du_perso") + "\n la force du magicien est de " + resultatDuneRequette.getString("forcee"));
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
        return personnages;// je retourne les valeurs compris dans la liste du tableau personnage qui son les élément de la table magicien construit dans la base de données
    }

}


