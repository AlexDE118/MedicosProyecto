package hospital.medicos.presentation.medicos;

import hospital.medicos.logic.Medico;
import hospital.medicos.logic.Service;

public class Controller {
    View view;
    Model model;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void readMedico(String ID) throws Exception{
        Medico e = new Medico();
        e.setID(ID);
        model.setMedico(Service.instance().readMedico(e));
    }

    public void loadMedicos(){
        model.setMedicos(Service.instance().loadMedicos());
    }

    public void createMedico(Medico e) throws Exception{
        Service.instance().createMedico(e);
    }
}
