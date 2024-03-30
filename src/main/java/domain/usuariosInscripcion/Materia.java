package domain.usuariosInscripcion;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;
    public Materia(String nombre){
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public void agregarMateriaCorrelativa(Materia materiaCorrelativa) {
        materiasCorrelativas.add(materiaCorrelativa);
    }

    public List<Materia> obtenerMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
