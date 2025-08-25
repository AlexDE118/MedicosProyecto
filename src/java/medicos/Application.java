package java.medicos;

import javax.swing.*;
import java.medicos.presentation.medicos.View;

public class Application {
    public static void main(String[] args){
        try {UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};

        View view = new View();

        JFrame window = new JFrame();
        window.setSize(600,300);
        window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Personas");
        window.setContentPane(view.getPanel());
        window.setVisible(true);
    }
    }
}
