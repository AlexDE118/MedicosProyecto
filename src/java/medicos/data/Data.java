package java.medicos.data;
import java.medicos.logic.Medico;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Medico> listaMedicos;

    public Data() {
        this.listaMedicos = new ArrayList<Medico>();
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
}
