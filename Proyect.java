import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class Proyect {

    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Hola Mundo");

        // Crear un JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));

        // Crear un JLabel con el mensaje "Hola Mundo"
        JLabel label = new JLabel("Hola Mundo");
        label.setFont(new Font("Arial", Font.BOLD, 24));

        // Agregar el JLabel al JPanel
        panel.add(label);

        // Agregar el JPanel al JFrame
        frame.getContentPane().add(panel);

        // Configurar el JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

