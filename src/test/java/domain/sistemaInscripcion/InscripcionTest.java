package domain.sistemaInscripcion;

import domain.usuariosInscripcion.Alumno;
import domain.usuariosInscripcion.Materia;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {
    @Test
    public void verificarCorrelativasExistentes(){
        Inscripcion inscripcion = new Inscripcion();
        Alumno shuko = new Alumno("Shuko");
        Materia ads = new Materia("Analisis de Sistemas");
        Materia pdp = new Materia("Paradigmas de Programacion");

        shuko.agregarMateriaAprobada(ads);
        shuko.agregarMateriaAprobada(pdp);

        Materia dds = new Materia("Diseño de Sistemas");
        dds.agregarMateriaCorrelativa(ads);
        dds.agregarMateriaCorrelativa(pdp);
        Assert.assertEquals(inscripcion.aprobada(shuko, dds), true);
    }
}