
package sominie.samsara.java.entities;
import java.util.List;

public class Alumnos {
    
    //ATRIBUTOS
    
    private int id_alumnos;
    private int id_colegio;
    private String nombre;
    private String apellido;
    private List<Cursos> cursoActual;

    
    //CONSTRUCTORES
    public Alumnos() {
    }

    public Alumnos(int id_alumnos) {
        this.id_alumnos = id_alumnos;
    }

    public Alumnos(int id_alumnos, int id_colegio) {
        this.id_alumnos = id_alumnos;
        this.id_colegio = id_colegio;
    }

    public Alumnos(int id_alumnos, int id_colegio, String nombre) {
        this.id_alumnos = id_alumnos;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
    }

    public Alumnos(int id_alumnos, int id_colegio, String nombre, String apellido) {
        this.id_alumnos = id_alumnos;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumnos(int id_alumnos, int id_colegio, String nombre, String apellido, List<Cursos> cursoActual) {
        this.id_alumnos = id_alumnos;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cursoActual = cursoActual;
    }
    
    

    //GETTERS Y SETTERS
    public List<Cursos> getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(List<Cursos> cursoActual) {
        this.cursoActual = cursoActual;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId_colegio() {
        return id_colegio;
    }

    public void setId_colegio(int id_colegio) {
        this.id_colegio = id_colegio;
    }


    public int getId_alumnos() {
        return id_alumnos;
    }

    public void setId_alumnos(int id_alumnos) {
        this.id_alumnos = id_alumnos;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Alumnos{" + "id_alumnos=" + id_alumnos + ", id_colegio=" + id_colegio +
                ", nombre=" + nombre + ", apellido=" + apellido + ", cursoActual=" + cursoActual + '}';
    }
    
}
