package co.uniquindio.edu.co.couniquindioeduco.model;

import java.util.ArrayList;
import java.util.List;

public class gestionGym { private List<cliente> listaClientes = new ArrayList<>();
    private List<empleado> listaEmpleados = new ArrayList<>();
    private List<plan> listaPlanes = new ArrayList<>();

    public List<cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<plan> getListaPlanes() {
        return listaPlanes;
    }

    public void setListaPlanes(List<plan> listaObjetos) {
        this.listaPlanes = listaObjetos;
    }

    public gestionGym(){

    }
    public String buscarClienteCedula(String cedula) {
        for (cliente Cliente : getListaClientes()) {
            if (Cliente.getCedula().equalsIgnoreCase(cedula)) {
                return Cliente.toString();
            }
        }
        return null;
    }
}


