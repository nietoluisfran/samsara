


public class Alumno {
      String nombre;
      String apellido;
      String curso;
      int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String curso, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", edad=" + edad + '}';
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}

