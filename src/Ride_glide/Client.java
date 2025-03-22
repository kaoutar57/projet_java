
package Ride_glide;

public class Client {
    private int id;
     private String Nom;
    private String prenom;
    private String num_tel;
    private String adresse;
    private String email;
    private String num_permis;
    
    public Client(int id,String Nom,String prenom,String num_tel,String adresse, String email,String num_permis){
        this.id=id;
        this.Nom=Nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.num_permis=num_permis;
        this.email=email;
        this.num_tel=num_tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getNum_permis() {
        return num_permis;
    }

    public void setNum_permis(String num_permis) {
        this.num_permis = num_permis;
    }
    
}
