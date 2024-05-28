package co.uniquindio.edu.co.couniquindioeduco.buider;

import co.uniquindio.edu.co.couniquindioeduco.model.empleado;

public  class empleadoBuilder {
    private String nombre;
    private String apellido;
    private String cedula;
    private String edad;
    private String cargo;
    private String celular;

    public empleadoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }


    public empleadoBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    public empleadoBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }
    public empleadoBuilder edad(String edad) {
        this.edad = edad;
        return this;
    }
    public empleadoBuilder cargo(String cargo) {
        this.cargo = cargo;
        return this;
    }
    public empleadoBuilder celular(String celular){
        this.celular=celular;
        return this;
    }

    public empleadoBuilder() {
    }
    public empleado build() {
        return new empleado(nombre, apellido, cedula, edad,celular, cargo);
    }

}







