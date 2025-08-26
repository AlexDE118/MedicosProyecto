package hospital.medicos.presentation.medicos;

import hospital.medicos.logic.Medico;
import hospital.medicos.presentation.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModel extends AbstractTableModel<Medico> implements javax.swing.table.TableModel {
    public TableModel(int[] column, List<Medico> rows) {
        super(column, rows);
    }

    public static final int ID = 0;
    public static final int NAME = 1;
    public static final int ESPECIALIAD = 2;
    public static final int CLAVE = 3;

    @Override
    protected void initColNames() {
        columnName = new String[4];
        columnName[ID] = "ID";
        columnName[NAME] = "Nombre";
        columnName[ESPECIALIAD] = "Especialidad";
        columnName[CLAVE] = "Clave";
    }

    @Override
    protected Object getPropertyAt(Medico medico, int col) {
        switch (column[col]) {
            case ID: return medico.getID();
            case NAME: return medico.getNombre();
            case ESPECIALIAD: return medico.getEspecialidad();
            case CLAVE: return medico.getClave();
            default: return null;
        }
    }
}
