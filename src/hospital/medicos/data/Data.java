package hospital.medicos.data;
import hospital.medicos.logic.Medico;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Medico> listaMedicos;

    public Data() {
        this.listaMedicos = new ArrayList<Medico>();
        listaMedicos.add(new Medico("222", "Amelia Crowe", "Dermatologia","3333"));
        listaMedicos.add(new Medico("333", "Maddison Bell", "Pediatria","4444"));
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
}
