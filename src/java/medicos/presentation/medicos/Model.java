package java.medicos.presentation.medicos;

import java.medicos.logic.Medico;
import java.medicos.presentation.AbstractModel;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel {
    Medico current;
    List<Medico> medicos;
    int anterior;

    public static final String CURRENT = "Current";

    public Model() {
        current = new Medico("111","Alex Dittel","Trauma","1234");
        medicos = new ArrayList<Medico>();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener){
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
    }

    public Medico getMedico() {
        return current;
    }

    public void setMedico(Medico medico) {
        this.current = medico;
    }
}
