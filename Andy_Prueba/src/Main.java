import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso");
        frame.setContentPane(new Login().logg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setPreferredSize(new Dimension(500,200));
        frame.pack();
        frame.setVisible(true);
    }
}