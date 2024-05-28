package co.uniquindio.edu.co.couniquindioeduco.model;

public class empleado {
    private String nombre;
    private String apellido;
    private String celular;

    public empleado(String nombre, String apellido, String edad,String cedula,String celular, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.celular=celular;
        this.cargo = cargo;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private String cedula;
    private String edad;

    @Override
    public String toString() {
        return "empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", celular='" + celular + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad='" + edad + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }


public String getCelular(){
        return celular;
}
    public String getApellido() {
        return apellido;
    }



    public String getCedula() {
        return cedula;
    }



    public String getEdad() {
        return edad;
    }



    public String getCargo() {
        return cargo;
    }



    private String cargo;
}
