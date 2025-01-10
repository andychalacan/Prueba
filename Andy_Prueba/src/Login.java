import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField user;
    private JTextField pass;
    private JButton login;
    public JPanel logg;

    public Login() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = user.getText();
                String contraseña = new String(pass.getText());

            if (BD.validarUsuario(usuario,contraseña)){
                System.out.println("Ingresado a la base de datos ");
                JFrame frame = new JFrame("MENU");
                frame.setContentPane(new Menu().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500,500);
                frame.setPreferredSize(new Dimension(500,500));
                frame.pack();
                frame.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null,"ERROR CREDENCIALES INCORRECTAS");
            }
            }
        });
    }
}
