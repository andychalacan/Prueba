import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class BD {
    private static final String url = "jdbc:mysql://localhost:3306/operadores";
    private static final String user = "root";
    private static final String password = "1234";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }

    public static boolean validarUsuario(String usuario, String contrasenia) {
        String query = "SELECT * FROM usuarios WHERE usuario = ? AND contrasenia = ?";
        try (Connection conn = getConnection();

             PreparedStatement stmt = conn.prepareStatement(query)) {
            System.out.println("Conectado");
            stmt.setString(1, usuario);
            stmt.setString(2, contrasenia);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

