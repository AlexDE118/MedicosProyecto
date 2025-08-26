package hospital.medicos;

import javax.swing.*;

import hospital.medicos.presentation.medicos.Controller;
import hospital.medicos.presentation.medicos.Model;
import hospital.medicos.presentation.medicos.View;

public class Application {
    public static void main(String[] args){
        try {UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        JFrame window = new JFrame();
        window.setSize(600,300);
        window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Personas");
        window.setContentPane(view.getPanel());
        window.setVisible(true);
    }
}
