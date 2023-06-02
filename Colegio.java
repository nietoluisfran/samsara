
package sominie.samsara.java.entities;
import java.util.List;

public class Colegio {
    
    //ATRIBUTOS
    
    private int id_colegio;
    private int id_comuna;
    private String nombre_cole;
    private String direccion_cole;
    private List<Alumnos> alumnos;
    private List<Profesores> profesor;
    private List<Cursos> cursos;
    
    //CONSTRCUTORES

    public Colegio() {
    }

    public Colegio(int id_colegio) {
        this.id_colegio = id_colegio;
    }

    public Colegio(int id_colegio, int id_comuna) {
        this.id_colegio = id_colegio;
        this.id_comuna = id_comuna;
    }

    public Colegio(int id_colegio, int id_comuna, String nombre_cole) {
        this.id_colegio = id_colegio;
        this.id_comuna = id_comuna;
        this.nombre_cole = nombre_cole;
    }

    public Colegio(int id_colegio, int id_comuna, String nombre_cole, String direccion_cole) {
        this.id_colegio = id_colegio;
        this.id_comuna = id_comuna;
        this.nombre_cole = nombre_cole;
        this.direccion_cole = direccion_cole;
    }

    public Colegio(int id_colegio, int id_comuna, String nombre_cole, String direccion_cole, List<Alumnos>alumnos) {
        this.id_colegio = id_colegio;
        this.id_comuna = id_comuna;
        this.nombre_cole = nombre_cole;
        this.direccion_cole = direccion_cole;
        this.alumnos = alumnos;
    }

    public Colegio(int id_colegio, int id_comuna, String nombre_cole, String direccion_cole, List<Alumnos> alumnos, List<Profesores> profesor) {
        this.id_colegio = id_colegio;
        this.id_comuna = id_comuna;
        this.nombre_cole = nombre_cole;
        this.direccion_cole = direccion_cole;
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public Colegio(int id_colegio, int id_comuna, String nombre_cole, String direccion_cole, List<Alumnos> alumnos, List<Profesores> profesor, List<Cursos> cursos) {
        this.id_colegio = id_colegio;
        this.id_comuna = id_comuna;
        this.nombre_cole = nombre_cole;
        this.direccion_cole = direccion_cole;
        this.alumnos = alumnos;
        this.profesor = profesor;
        this.cursos = cursos;
    }
    
    
    
    //GETTERS Y SETTERS

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }


    public List<Profesores> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<Profesores> profesor) {
        this.profesor = profesor;
    }


    public List<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }


    public String getDireccion_cole() {
        return direccion_cole;
    }

    public void setDireccion_cole(String direccion_cole) {
        this.direccion_cole = direccion_cole;
    }


    public String getNombre_cole() {
        return nombre_cole;
    }

    public void setNombre_cole(String nombre_cole) {
        this.nombre_cole = nombre_cole;
    }


    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }


    public int getId_colegio() {
        return id_colegio;
    }

    public void setId_colegio(int id_colegio) {
        this.id_colegio = id_colegio;
    }

    //METODOS

    @Override
    public String toString() {
        return "Colegio{" + "id_colegio=" + id_colegio + ", id_comuna=" + id_comuna +
                ", nombre_cole=" + nombre_cole + ", direccion_cole=" + direccion_cole + 
                ", alumnos=" + alumnos + ", profesor=" + profesor + ", cursos=" + cursos + '}';
    }
    
}
