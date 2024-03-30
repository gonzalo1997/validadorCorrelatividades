package domain.usuariosInscripcion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;
    public Alumno(String nombre){
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }
    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

    // Método para obtener materias correlativas
    public List<Materia> obtenerMateriasAprobadas() {
        return materiasAprobadas;
    }
}