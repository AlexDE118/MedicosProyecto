package hospital.medicos.logic;

import hospital.medicos.data.Data;

import java.util.List;

public class Service {
    private static Service theInstance;
    private Data data;

    public static Service instance(){
        if(theInstance == null) theInstance = new Service();
        return theInstance;
    }

    private Service() {
        data = new Data();
    }

    //============ MEDICOS ============//
    public void createMedico(Medico e) throws Exception {
        Medico result = data.getListaMedicos().stream()
                .filter(x -> x.getID().equals(e.getID()))
                .findFirst()
                .orElse(null);
        if(result == null){
            data.getListaMedicos().add(e);
        }else{
            throw new Exception("Medico ya existe");
        }
    }

    public List<Medico> loadMedicos() {
            return data.getListaMedicos();
    }

    public Medico readMedico(Medico e) throws Exception {
        Medico result = data.getListaMedicos().stream()
                .filter(x -> x.getID().equals(e.getID()))
                .findFirst()
                .orElse(null);
        if(result != null){
            return result;
        }else{
            throw new Exception("Medico ya existe");
        }
    }
}
