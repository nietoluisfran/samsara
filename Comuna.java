
package sominie.samsara.java.entities;
import java.util.List;

public class Comuna {
    
    //ATRIBUTOS
    
    private int id_comuna;
    private String nombre_comuna;
    private List<Colegio> colegio;
    
    
    //CONSTRUCTORES

    public Comuna() {
    }

    public Comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }
    

    public Comuna(int id_comuna, String nombre_comuna) {
        this.id_comuna = id_comuna;
        this.nombre_comuna = nombre_comuna;
    }

    public Comuna(int id_comuna, String nombre_comuna, List<Colegio> colegio) {
        this.id_comuna = id_comuna;
        this.nombre_comuna = nombre_comuna;
        this.colegio = colegio;
    }
    
    //GETTERS Y SETTERS

    public List<Colegio> getColegio() {
        return colegio;
    }

    public void setColegio(List<Colegio> colegio) {
        this.colegio = colegio;
    }



    public String getNombre_comuna() {
        return nombre_comuna;
    }

    public void setNombre_comuna(String nombre_comuna) {
        this.nombre_comuna = nombre_comuna;
    }


    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }
    
    //METODOS

    @Override
    public String toString() {
        return "Comuna{" + "id_comuna=" + id_comuna + ", nombre_comuna=" + nombre_comuna + ", colegio=" + colegio + '}';
    }

}
