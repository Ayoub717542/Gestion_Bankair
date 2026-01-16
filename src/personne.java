import java.util.ArrayList;
import java.util.List;

public class personne {
    private String nome;
    private String prenom;
    private String dateNaissance;
    private String email;

    public personne(String nome, String prenom, String dateNaissance, String email) {
        this.nome = nome;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
    }

    public String getNome() {return nome;}
    public String getPrenom() {return prenom;}
    public String getDateNaissance() {return dateNaissance;}
    public String getEmail() {return email;}



}
