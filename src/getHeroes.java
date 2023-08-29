import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class getHeroes {
    //je vais créer un ogjet de type driver pour me connecter à la bdd
        try {
        Driver pilote = new Driver (); // on créer le driver
        DriverManager.registerDriver(pilote); // on ajoute le driver à la liste des drivers de java ce qui permet de pouvoir interagir avec le driver qui lui interagis avec la base de données

        String protocole = "jdbc:mysql";
        String adresseIP = "localhost";
        String port = "3306";
        String nomDeLaBaseDeDonee = "infos_perso";
        Connection connectToDataBase = DriverManager.getConnection(protocole + "://" + adresseIP + ":" + port + "/" + nomDeLaBaseDeDonee, "root","Michelroche@07" );
        // j'etablis la connection au serveur mysql avec le driver manager les argument url correspond à l'adresse ou ce trouve ma bbd,
        // ma fonction connection est composée de 3 arguments : une url, nom utilisateur, et un mot de passe
        // l'url et lui même composée de 4 partie : le protocole, l'adresse ip, le port, le nom de la bdd

        Statement preparationDeRequettes = connectToDataBase.createStatement(); // je prepare la ou les requete(s)

        ResultSet resultatDuneRequette = preparationDeRequettes.executeQuery("SELECT * FROM magicien;");// j'execute une requete

        while(resultatDuneRequette.next()) { // c'est pour parcourire les differentes lignes de ma table magicien
            System.out.println("Le magicien s'appel " + resultatDuneRequette.getString("nom")); //j'affiche le resultat de ma requete
            System.out.println("Le magicien s'appel " + resultatDuneRequette.getString("class_du_perso")+"\n la force du magicien est de "+resultatDuneRequette.getString("forcee"));
        }

    }
        catch (Exception e) {
        e.printStackTrace();
    }
}
