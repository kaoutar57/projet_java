
package Ride_glide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnexion {
    public static Connection getConnexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/java_database"; // Vérifiez que le port est correct
        String user = "root";
        String pass = "";

        return DriverManager.getConnection(url, user, pass);
    }
}

