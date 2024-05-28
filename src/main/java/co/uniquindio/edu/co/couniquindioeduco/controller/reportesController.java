package co.uniquindio.edu.co.couniquindioeduco.controller;

import co.uniquindio.edu.co.couniquindioeduco.factory.modelFactory;

public class reportesController {
    modelFactory ModelFactory;

    public reportesController() {
        ModelFactory = modelFactory.getInstance();
    }

    public String buscarClienteCedula(String cedula) {
        return ModelFactory.buscarClienteCedula(cedula);
    }
}
