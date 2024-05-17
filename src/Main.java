import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] nombresMaterias = {
                "Biología", "Matemática", "Lengua", "Química",
                "Teatro", "Ética", "Tecnología", "Tutoría",
                "Geografía", "Dibujo"
        };
        Materia[] materias = new Materia[nombresMaterias.length];
        for (int i = 0; i < nombresMaterias.length; i++) {
            materias[i] = new Materia(nombresMaterias[i]);
        }
        Alumno[] alumnos = new Alumno[100];
        for (int i = 0; i < 100; i++) {
            //esto crea al alumno y le asigna una materia cualquiera de las que hay
            alumnos[i] = new Alumno("Alumno " + (i + 1));
            int numMaterias = (int) (Math.random() * 5) + 1;
            for (int j = 0; j < numMaterias; j++) {
                int indexMateria = (int) (Math.random() * nombresMaterias.length);
                alumnos[i].agregarMateria(materias[indexMateria]);
            }
        }
        for (int i = 0; i < 100; i++) {
            Alumno alumno = alumnos[i];
            System.out.println("Alumno: " + alumno.getNombre());
            System.out.println("Materias:");
            List<Materia> materiasAlumno = alumno.getMaterias();
            for (Materia materia : materiasAlumno) {
                System.out.println("- " + materia.getNombre());
            }
            System.out.println();
        }
    }
}