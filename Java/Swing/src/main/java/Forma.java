import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class Forma extends JFrame {
    private JPanel panel1;

    public Forma() {
        inicializarForma();
    }
    private void inicializarForma() {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Forma f = new Forma();
        f.setVisible(true);
    }
}
