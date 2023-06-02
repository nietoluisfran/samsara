
package sominie.samsara.java.entities;
import java.util.List;

public class alumnos_relacion_cursos {
    
    //ATRIBUTOS
    
    private int alumnos_id_alumnos;     //o va id_alumnos ?
    private String cursos_id_cursos;   //o va id_cursos ?
    
    
    //CONSTRUCTORES
        public alumnos_relacion_cursos() {
    }

    public alumnos_relacion_cursos(int alumnos_id_alumnos, String cursos_id_cursos) {
        this.alumnos_id_alumnos = alumnos_id_alumnos;
        this.cursos_id_cursos = cursos_id_cursos;
    }

    //GETTERS Y SETTERS
    public int getAlumnos_id_alumnos() {
        return alumnos_id_alumnos;
    }

    public void setAlumnos_id_alumnos(int alumnos_id_alumnos) {
        this.alumnos_id_alumnos = alumnos_id_alumnos;           //creo que no es necesario hacerlos pasar por el set y get, no?
    }

    public String getCursos_id_cursos() {
        return cursos_id_cursos;
    }

    public void setCursos_id_cursos(String cursos_id_cursos) {
        this.cursos_id_cursos = cursos_id_cursos;
    }

    //METODOS

    @Override
    public String toString() {
        return "alumnos_relacion_cursos{" + "alumnos_id_alumnos=" + alumnos_id_alumnos + ", cursos_id_cursos=" + cursos_id_cursos + '}';
    }
    
}
