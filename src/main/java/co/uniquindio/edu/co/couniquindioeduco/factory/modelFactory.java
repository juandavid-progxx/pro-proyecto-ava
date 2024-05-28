package co.uniquindio.edu.co.couniquindioeduco.factory;

import co.uniquindio.edu.co.couniquindioeduco.model.cliente;
import co.uniquindio.edu.co.couniquindioeduco.model.empleado;
import co.uniquindio.edu.co.couniquindioeduco.model.gestionGym;
import co.uniquindio.edu.co.couniquindioeduco.model.plan;

public class modelFactory {
    public static modelFactory ModelFactory;
    gestionGym gestionarioGym;

    private modelFactory() {
        gestionarioGym = new gestionGym();
        inicializarDatos();
    }



    public static modelFactory getInstance() {
        if (ModelFactory == null) {
            ModelFactory = new modelFactory();
        }
        return ModelFactory;
    }


    private void inicializarDatos() {
        initClientes();
        initEmpleados();
        initPlan();
    }

    private void initPlan() {
plan planVIP= new plan("plan VIP","80000");
plan planNormal= new plan("plan normal ","60000");
plan planBasico = new plan("plan basico","50000");
        gestionarioGym.getListaPlanes().add(planVIP);
        gestionarioGym.getListaPlanes().add(planNormal);
        gestionarioGym.getListaPlanes().add(planBasico);

    }


    private void initEmpleados() {
        empleado empleado1 = new empleado("oscar","gimenez","25","19122","3124","entrenador");
        empleado empleado2 = new empleado("luis","herrera","26","109122","32124","entrenador");
        empleado empleado3 = new empleado("angy","gomez","18","119122","34124","limpieza");
        empleado empleado4 = new empleado("jhoana","suarez","20","19222","31124","administrativa");
        empleado empleado5 = new empleado("karen","gimenez","22","1192122","301124","gerente");

        gestionarioGym.getListaEmpleados().add(empleado1);
        gestionarioGym.getListaEmpleados().add(empleado2);
        gestionarioGym.getListaEmpleados().add(empleado3);
        gestionarioGym.getListaEmpleados().add(empleado4);
        gestionarioGym.getListaEmpleados().add(empleado5);
    }


    private void initClientes() {
        cliente cliente1= new cliente("ana","diaz","21","123","3222","74884");
        cliente cliente2= new cliente("jose","salazar","41","1234","322","7484");
        cliente cliente3= new cliente("jhon","gomez","25","23","311","7445");
        cliente cliente4= new cliente("camilo","perez","30","3333","32","74784");
        cliente cliente5= new cliente("luisa","castillo","18","192","314","745884");

        gestionarioGym.getListaClientes().add(cliente1);
        gestionarioGym.getListaClientes().add(cliente2);
        gestionarioGym.getListaClientes().add(cliente3);
        gestionarioGym.getListaClientes().add(cliente4);
        gestionarioGym.getListaClientes().add(cliente5);
    }
public String buscarClienteCedula(String cedula){
        return gestionarioGym.buscarClienteCedula(cedula);
}





}
