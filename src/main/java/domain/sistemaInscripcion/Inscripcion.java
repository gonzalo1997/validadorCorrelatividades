package domain.sistemaInscripcion;

import domain.usuariosInscripcion.Alumno;
import domain.usuariosInscripcion.Materia;

import java.util.List;

public class Inscripcion {
    public static boolean aprobada(Alumno alumno, Materia materia){
        List<Materia> materiasAprobadas = alumno.obtenerMateriasAprobadas();
        List<Materia> materiasCorrelativas = materia.obtenerMateriasCorrelativas();

        for (Materia correlativa : materiasCorrelativas) {
            if (!materiasAprobadas.contains(correlativa)) {
                return false; // Si falta alguna correlativa, no puede cursar la materia
            }
        }

        return true; // Si ha aprobado todas las correlativas, puede cursar la materia
    }
}
