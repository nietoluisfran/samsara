
package sominie.samsara.java.entities;
import java.util.List;

public class Cursos {
    
    //ATRIBUTOS
    
    private int id_curso;
    private int id_colegio;
    private String nombre;
    private String apellido;
    private List<Alumnos> alumnosCurso;
    
 
    //CONSTRUCTORES
    public Cursos() {
    }

    public Cursos(int id_curso) {
        this.id_curso = id_curso;
    }

    public Cursos(int id_curso, int id_colegio) {
        this.id_curso = id_curso;
        this.id_colegio = id_colegio;
    }

    public Cursos(int id_curso, int id_colegio, String nombre) {
        this.id_curso = id_curso;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
    }

    public Cursos(int id_curso, int id_colegio, String nombre, String apellido) {
        this.id_curso = id_curso;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cursos(int id_curso, int id_colegio, String nombre, String apellido, List<Alumnos> alumnosCurso) {
        this.id_curso = id_curso;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.alumnosCurso = alumnosCurso;
    }

    //GETTERS Y SETTERS
    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_colegio() {
        return id_colegio;
    }

    public void setId_colegio(int id_colegio) {
        this.id_colegio = id_colegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Alumnos> getAlumnosCurso() {
        return alumnosCurso;
    }

    public List<Alumnos> setAlumnosCurso() {
        return alumnosCurso;
    }

    
    public void setAlumnosCurso(List<Alumnos> alumnosCurso) {
        this.alumnosCurso = alumnosCurso;
    }

    //METODOS

    @Override
    public String toString() {
        return "Cursos{" + "id_curso=" + id_curso + ", id_colegio=" + id_colegio + ", nombre=" + nombre + ", apellido=" + apellido + ", alumnosCurso=" + alumnosCurso + '}';
    }
       
}
