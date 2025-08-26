package hospital.medicos.presentation.medicos;

import hospital.medicos.logic.Medico;
import hospital.medicos.presentation.AbstractModel;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel {
    Medico current;
    List<Medico> medicos;
    int anterior;

    public static final String CURRENT = "Current";
    public static final String LISTAMEDICOS = "Medicos";

    public Model() {
        current = new Medico("111","Alex Dittel","Trauma","1234");
        medicos = new ArrayList<Medico>();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener){
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
        firePropertyChange(LISTAMEDICOS);
    }

    public Medico getMedico() {
        return current;
    }

    public void setMedico(Medico medico) {
        this.current = medico;
        firePropertyChange(CURRENT);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
        firePropertyChange(LISTAMEDICOS);
    }

    public void addMedico(Medico medico){
        medicos.add(medico);
        firePropertyChange(CURRENT);
    }

}
