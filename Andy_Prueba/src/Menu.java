import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Menu {
    public JPanel panel1;
    private JButton agregarButton;
    private JTextField cedu;
    private JTextField nombre;
    private JTextField nota_1;
    private JTextField nota_2;
    private JTextField nota_3;
    private JTextField nota_4;
    private JTextField nota_5;
    private JTextField id_new;
    private JButton agregar;

    public Menu() {

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = "INSERT INTO estudiantes (id,cedula,nombre,nota_1,nota_2,nota_3,nota_4,nota_5) VALUES (?,?,?,?,?,?,?,?)";
                String id = id_new.getText();
                String cedula=cedu.getText();
                String name=nombre.getText();
                String nota1=nota_1.getText();
                String nota2=nota_2.getText();
                String nota3=nota_3.getText();
                String nota4=nota_4.getText();
                String nota5=nota_5.getText();

                try (Connection conn = BD_E.getConnection();
                     PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setInt(1,Integer.parseInt(id));
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(panel1, "Jugador guardado exitosamente.");
                    pstmt.setInt(1, Integer.parseInt(id));
                    pstmt.setInt(2, Integer.parseInt(cedula));
                    pstmt.setString(3, name);
                    pstmt.setString(4, nota1);
                    pstmt.setString(5, nota2);
                    pstmt.setString(6, nota3);
                    pstmt.setString(7, nota4);
                    pstmt.setString(8, nota5);





            } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }
}





