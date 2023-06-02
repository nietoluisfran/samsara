
package sominie.samsara.java.entities;

public class Profesores {
    
    //ATRIBUTOS
    
    private int id_profesor;
    private int id_colegio;
    private String nombre;
    private String apellido;

    
    //CONSTRUCTORES
    public Profesores() {
    }

    public Profesores(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Profesores(int id_profesor, int id_colegio) {
        this.id_profesor = id_profesor;
        this.id_colegio = id_colegio;
    }

    public Profesores(int id_profesor, int id_colegio, String nombre) {
        this.id_profesor = id_profesor;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
    }

    public Profesores(int id_profesor, int id_colegio, String nombre, String apellido) {
        this.id_profesor = id_profesor;
        this.id_colegio = id_colegio;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   

    //GETTERS Y SETTERS
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


    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Profesores{" + "id_profesor=" + id_profesor + ", id_colegio=" + id_colegio + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
