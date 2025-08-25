package java.medicos.logic;

public class Medico {
    //Atributos
    private String ID;
    private String nombre;
    private String especialidad;
    private String clave;
    //Constructores
    Medico(){
        this.ID = "";
        this.nombre = "";
        this.especialidad = "";
        this.clave = "123";
    }

    Medico(String ID, String nombre, String especialidad, String clave){
        this.ID = ID;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
