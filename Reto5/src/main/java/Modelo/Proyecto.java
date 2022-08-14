
package Modelo;


public class Proyecto {
    private int id_proyecto;
    private String constructora;
    private int numero_habitaciones;
    private String Ciudad;

    public Proyecto() {
    }

    public Proyecto(int id_proyecto, String constructora, int numero_habitaciones, String Ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.numero_habitaciones = numero_habitaciones;
        this.Ciudad = Ciudad;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id_proyecto=" + id_proyecto + ", constructora=" + constructora + ", numero_habitaciones=" + numero_habitaciones + ", Ciudad=" + Ciudad + '}';
    }
    
    
    
}
