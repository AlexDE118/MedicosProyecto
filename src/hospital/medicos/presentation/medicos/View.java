package hospital.medicos.presentation.medicos;

import hospital.medicos.logic.Medico;
import hospital.medicos.logic.Service;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class View implements PropertyChangeListener {
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
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Medico medico = new Medico();
                medico.setID(textField_ID.getText());
                medico.setNombre(textField_nombre.getText());
                medico.setEspecialidad(textField_especialidad.getText());
                medico.setClave(textField_clave.getText());
                try{
                    controller.createMedico(medico);
                    JOptionPane.showMessageDialog(null, "Medico creado con exito");
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.loadMedicos();
            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }

    //------- MVC -------//
    Controller controller;
    Model model;

    public void setController(Controller controller){
        this.controller = controller;
    }

    public void setModel(Model model){
        this.model = model;
        model.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()){
            case Model.CURRENT:
                textField_ID.setText(model.getMedico().getID());
                textField_nombre.setText(model.getMedico().getNombre());
                textField_especialidad.setText(model.getMedico().getEspecialidad());
                textField_clave.setText(model.getMedico().getClave());
                break;
            case Model.LISTAMEDICOS:
                int[] cols = {TableModel.ID, TableModel.NAME, TableModel.ESPECIALIAD, TableModel.CLAVE};
                TableModel tableModel = new TableModel(cols, model.getMedicos());
                table_medicos.setModel(tableModel);
                table_medicos.updateUI();
                break;
        }
    }
}
