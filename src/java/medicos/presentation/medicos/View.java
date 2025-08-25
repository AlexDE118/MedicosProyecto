package java.medicos.presentation.medicos;

import javax.swing.*;

public class View {
    private JTabbedPane tabbedPaneMedicos;
    private JPanel panel;
    private JTextField textField_ID;
    private JTextField textField_nombre;
    private JTextField textField_especialidad;
    private JTextField textField_clave;
    private JTable table_medicos;
    private JButton guardarButton;
    private JButton cargarButton;

    public View(){

    }

    public JPanel getPanel(){
        return panel;
    }

    //------- MVC -------//

}
