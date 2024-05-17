import java.util.*;
class Alumno {
    private String nombre;
    private List<Materia> materias;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}
