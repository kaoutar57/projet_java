
package Ride_glide;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
  

    public class ClientDao {
    private Connection connexion;
    
    public ClientDao() throws SQLException{
        connexion= DBconnexion.getConnexion();
    }
    public int ajouterClient(Client client) {
        try{
        String sql="INSERT INTO Client(id,Nom,Prenom,num_tel,adresse,Num_permis,Email) Values(?,?,?,?,?,?,?)";
        PreparedStatement stmt=connexion.prepareStatement(sql);
        stmt.setInt(1, client.getId());
        stmt.setString(2, client.getNom());
        stmt.setString(3, client.getPrenom());
        stmt.setString(4, client.getNum_tel());
        stmt.setString(5, client.getAdresse());
        stmt.setString(6, client.getNum_permis());
        stmt.setString(7, client.getEmail());
        stmt.executeUpdate();
        return 1;
        }catch(SQLException e){
             e.printStackTrace(); 
             JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout du client : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
             return 0;
           
        }}
    public int modifierClient(Client client) {
    try {
        String sql = "UPDATE Client SET Nom=?, Prenom=?, num_tel=?, adresse=?, Email=?, Num_permis=? WHERE id=?";
        PreparedStatement stmt = connexion.prepareStatement(sql);
        stmt.setString(1, client.getNom());
        stmt.setString(2, client.getPrenom());
        stmt.setString(3, client.getNum_tel());
        stmt.setString(4, client.getAdresse());
        stmt.setString(5, client.getEmail());
        stmt.setString(6, client.getNum_permis());
        stmt.setInt(7, client.getId());

        int rowsUpdated = stmt.executeUpdate();
        return rowsUpdated; // Retourne 1 si la mise à jour a réussi
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la modification du client : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        return 0;
    }
}
public int supprimerClient(int id) {
    try {
        String sql = "DELETE FROM Client WHERE id = ?";
        PreparedStatement stmt = connexion.prepareStatement(sql);
        stmt.setInt(1, id);

        int rowsDeleted = stmt.executeUpdate();
        return rowsDeleted; // Retourne 1 si la suppression a réussi
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la suppression du client : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        return 0;
    }
}
}
