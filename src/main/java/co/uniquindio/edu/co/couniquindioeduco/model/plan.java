package co.uniquindio.edu.co.couniquindioeduco.model;

public class plan {
 private String nombre;
 private String precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "plan{" +
                "nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public plan(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
