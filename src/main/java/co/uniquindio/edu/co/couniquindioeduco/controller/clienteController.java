package co.uniquindio.edu.co.couniquindioeduco.controller;


import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.edu.co.couniquindioeduco.model.cliente;
import co.uniquindio.edu.co.couniquindioeduco.model.empleado;
import co.uniquindio.edu.co.couniquindioeduco.strategy.entrenadorPersonal;
import co.uniquindio.edu.co.couniquindioeduco.strategy.rutinaCardio;
import co.uniquindio.edu.co.couniquindioeduco.strategy.rutinaFlexibilidad;
import co.uniquindio.edu.co.couniquindioeduco.strategy.rutinaFuerza;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import static co.uniquindio.edu.co.couniquindioeduco.factory.modelFactory.ModelFactory;

public class clienteController {
    reportesController controllerGym;

    @FXML
    private ResourceBundle resources;


    @FXML
    private URL location;
    @FXML
    private Button btnActualizarEMP;

    @FXML
    private Button btnAgregarEmpleado;
    @FXML
    private Button btnEliminarEMP;
    @FXML
    private Button btnFlexibilidad;
    @FXML
    private Button btnFuerza;
    @FXML
    private Button btnCardio;
    @FXML
    private Button btnPagar;
    @FXML
    private ComboBox comb;
    @FXML
    private TextArea reultadoCombobox;
    @FXML
    private TextArea resultadoRurinas;
    @FXML
    private TextField codigoSeguridad;
    @FXML
    private TextField fechaNacimientoPagoM;

    @FXML
    private TextField fechaVencimientoPagoM;

    @FXML
    private TextField numeroTarjeta;

    @FXML
    private TextArea resultadoPagoM;
    @FXML
    private TextField valorPago;



    @FXML
    private Button btnagregarCliente;
    @FXML
    private TableColumn colApellidoEMP;

    @FXML
    private TableColumn colCargoEMP;
    @FXML
    private TableColumn colCedulaEMP;
    @FXML
    private TableColumn colCelularEMP;
    @FXML
    private TableColumn colEdadEMP;
    @FXML
    private TableColumn colNombreEMP;

    @FXML
    private TableColumn colApellido;
    @FXML
    private TextField txtBuscar;
    @FXML
    private TextField txtCargoEMP;

    @FXML
    private TextField txtEdadEMP;
    @FXML
    private TextField txtApellidoEMP;
    @FXML
    private TextField txtcedulaEMP;
    @FXML
    private TextField txtcelularEMP;
    @FXML
    private TextField txtnombreEmp;
    @FXML
    private TableColumn colCedula;

    @FXML
    private TableColumn colCelular;

    @FXML
    private TableColumn colEdad;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableColumn colTelefono;

    @FXML
    private TableView<cliente> tblClientes;
    @FXML
    private TableView<empleado> tblEmpleados;

    @FXML
    private TextField txtapellido;

    @FXML
    private TextField txtcedula;

    @FXML
    private TextField txtcelular;

    @FXML
    private TextField txtedad;

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txttelefono;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnEliminar;
    private ObservableList<cliente>filtroClientes;

    @FXML
    void onBuscar(ActionEvent event) {
String filtrarNombre = this.txtBuscar.getText();
if(filtrarNombre.isEmpty()){
    this.tblClientes.setItems(clientes);
}else{
    this.filtroClientes.clear();
    for (cliente c:this.clientes) {
        if(c.getNombre().toLowerCase().contains(filtrarNombre.toLowerCase()));
        this.filtroClientes.add(c);
    }
}
this.tblClientes.setItems(filtroClientes);
    }

    @FXML
    void onActualizar(ActionEvent event) {
        cliente c = this.tblClientes.getSelectionModel().getSelectedItem();
        if(c == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no se puede");
            alert.setContentText("debes seleccionar cliente");
            alert.showAndWait();

        }else{
            try{
                String nombre = this.txtnombre.getText();
                String apellido = this.txtapellido.getText();
                String edad = this.txtedad.getText();
                String cedula = this.txtcedula.getText();
                String celular = this.txtcelular.getText();
                String telefono = this.txttelefono.getText();

                cliente aux = new cliente(nombre,apellido,edad,cedula,celular,telefono);
                if(!this.clientes.contains(aux)) {
                    c.setNombre(aux.getNombre());
                    c.setApellido(aux.getApellido());
                    c.setEdad(aux.getEdad());
                    c.setCedula(aux.getCedula());
                    c.setCelular(aux.getCelular());
                    c.setTelefono(aux.getTelefono());
                    this.tblClientes.refresh();



                }
            }catch (NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("no se puede");
                alert.setContentText("formato incorrecto");
                alert.showAndWait();
        }
    }
    }

    @FXML
    void onEliminar(ActionEvent event) {
        cliente c = this.tblClientes.getSelectionModel().getSelectedItem();
        if(c == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no se puede");
            alert.setContentText("selecciona cliente");
            alert.showAndWait();

        }else{
            this.clientes.remove(c);
            this.tblClientes.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("info");
            alert.setContentText("cliente  eliminado");
            alert.showAndWait();
        }

    }
    @FXML
    void seleccionar(MouseEvent event) {
        cliente c = this.tblClientes.getSelectionModel().getSelectedItem();
        if(c == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no se puede");
            alert.setContentText("selecciona al cliente");
            alert.showAndWait();

        }else{
            try{
                String nombre = this.txtnombre.getText();
                String apellido = this.txtapellido.getText();
                String edad = this.txtedad.getText();
                String cedula = this.txtcedula.getText();
                String celular = this.txtcelular.getText();
                String telefono = this.txttelefono.getText();

                cliente aux = new cliente(nombre,apellido,edad,cedula,celular,telefono);
                if(!this.clientes.contains(aux)) {
                    c.setNombre(aux.getNombre());
                    c.setApellido(aux.getApellido());
                    c.setEdad(aux.getEdad());
                    c.setCedula(aux.getCedula());
                    c.setCelular(aux.getCelular());
                    c.setTelefono(aux.getTelefono());
                    this.tblClientes.refresh();



                }
            }catch (NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("no se puede");
                alert.setContentText("formato incorrecto");
                alert.showAndWait();
            }
        }
    }
    private ObservableList<cliente>clientes;

    private ObservableList<empleado>empleados;



    @FXML
    void initialize() {


        ObservableList<String> listt= FXCollections.observableArrayList("PLAN VIP","PLAN PREMIUM","PLAN BASICO");
        comb.setItems(listt);




        entrenadorPersonal entrenador= new entrenadorPersonal(new rutinaFuerza());
       // entrenador.ejecutarEntrenamiento();
        //cambio de rutina
      //  entrenador.setUsoEntrenamiento(new rutinaCardio());
     //   entrenador.ejecutarEntrenamiento();
        //cambio de rutina
     //   entrenador.setUsoEntrenamiento(new rutinaFlexibilidad());
     //   entrenador.ejecutarEntrenamiento();

controllerGym= new reportesController();


clientes= FXCollections.observableArrayList();
        filtroClientes= FXCollections.observableArrayList();
        empleados=FXCollections.observableArrayList();




this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
this.colApellido.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        this.colCedula.setCellValueFactory(new PropertyValueFactory("cedula"));
        this.colCelular.setCellValueFactory(new PropertyValueFactory("celular"));
        this.colTelefono.setCellValueFactory(new PropertyValueFactory("telefono"));


        this.colNombreEMP.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidoEMP.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.colEdadEMP.setCellValueFactory(new PropertyValueFactory("edad"));
        this.colCedulaEMP.setCellValueFactory(new PropertyValueFactory("cedula"));
        this.colCelularEMP.setCellValueFactory(new PropertyValueFactory("celular"));
        this.colCargoEMP.setCellValueFactory(new PropertyValueFactory("cargo"));
    }
    @FXML
    void onagregarCliente(ActionEvent event) {
        try{
            String nombre = this.txtnombre.getText();
            String apellido = this.txtapellido.getText();
            String edad = this.txtedad.getText();
            String cedula = this.txtcedula.getText();
            String celular = this.txtcelular.getText();
            String telefono = this.txttelefono.getText();

            cliente usoCliente = new cliente(nombre,apellido,edad,cedula,celular,telefono);
            if(!this.clientes.contains(usoCliente)) {
                this.clientes.add(usoCliente);
                this.tblClientes.setItems(clientes);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("info");
                alert.setContentText("cliente agregado");
                alert.showAndWait();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("no se puede");
                alert.setContentText("el cliente esta registrado");
                alert.showAndWait();
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no se puede");
            alert.setContentText("formato incorrecto");
            alert.showAndWait();
        }

    }
    @FXML
    void onAgregarEmpleado(ActionEvent event) {
        {
            try{
                String nombre = this.txtnombreEmp.getText();
                String apellido = this.txtApellidoEMP.getText();
                String edad = this.txtEdadEMP.getText();
                String cedula = this.txtcedulaEMP.getText();
                String celular = this.txtcelularEMP.getText();
                String cargo = this.txtCargoEMP.getText();

                empleado usoEmpleado = new empleado(nombre,apellido,edad,cedula,celular,cargo);
                if(!this.empleados.contains(usoEmpleado)) {
                    this.empleados.add(usoEmpleado);
                    this.tblEmpleados.setItems(empleados);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("info");
                    alert.setContentText("empleado agregado");
                    alert.showAndWait();
                }else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("no se puede");
                    alert.setContentText("el empleado esta registrado");
                    alert.showAndWait();
                }
            }catch (NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("no se puede");
                alert.setContentText("formato incorrecto");
                alert.showAndWait();
            }

        }

    }
    @FXML
    void onEliminarEMP(ActionEvent event) {

        empleado c = this.tblEmpleados.getSelectionModel().getSelectedItem();
        if(c == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no se puede");
            alert.setContentText("selecciona empleado");
            alert.showAndWait();

        }else{
            this.empleados.remove(c);
            this.tblEmpleados.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("info");
            alert.setContentText("empleado  eliminado");
            alert.showAndWait();
        }


    }
    @FXML
    void onActualizarEMP(ActionEvent event) {

        empleado c = this.tblEmpleados.getSelectionModel().getSelectedItem();
        if(c == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("no se puede");
            alert.setContentText("debes seleccionar empleado");
            alert.showAndWait();

        }else{
            try{
                String nombre = this.txtnombreEmp.getText();
                String apellido = this.txtApellidoEMP.getText();
                String edad = this.txtEdadEMP.getText();
                String cedula = this.txtcedulaEMP.getText();
                String celular = this.txtcelularEMP.getText();
                String cargo = this.txtCargoEMP.getText();

                empleado aux = new empleado(nombre,apellido,edad,cedula,celular,cargo);
                if(!this.empleados.contains(aux)) {
                    c.setNombre(aux.getNombre());
                    c.setApellido(aux.getApellido());
                    c.setEdad(aux.getEdad());
                    c.setCedula(aux.getCedula());
                    c.setCelular(aux.getCelular());
                    c.setCargo(aux.getCargo());
                    this.tblEmpleados.refresh();



                }
            }catch (NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("no se puede");
                alert.setContentText("formato incorrecto");
                alert.showAndWait();
            }
        }

    }
    @FXML
    void onSeleccionarRutinaCardio(ActionEvent event) {
        entrenadorPersonal entrenador= new entrenadorPersonal(new rutinaCardio());
        entrenador.ejecutarEntrenamiento();
        resultadoRurinas.appendText("ha seleccionado rutina de cardio \n entrenando maquina de correr\n");

    }

    @FXML
    void onSeleccionarRutinaFlexibilidad(ActionEvent event) {
        entrenadorPersonal entrenador= new entrenadorPersonal(new rutinaFlexibilidad());
        entrenador.ejecutarEntrenamiento();
        resultadoRurinas.appendText("ha selecionado rutina de flexibilidad \n entrenando haciendo  estiramiento \n" );
    }

    @FXML
    void onSeleccionarRutinaFuerza(ActionEvent event) {
        entrenadorPersonal entrenador= new entrenadorPersonal(new rutinaFuerza());
        entrenador.ejecutarEntrenamiento();
        resultadoRurinas.appendText("ha seleccionado rutina de fuerza \n entrenando en maquinas de peso\n");


    }
    @FXML
    void onProcesarPago(ActionEvent event) {
        String numeroTarjeta1 = numeroTarjeta.getText();
        String fechaVencimientoPagoM1 = fechaVencimientoPagoM.getText();
        String codigoSeguridad1 = codigoSeguridad.getText();
        String valorPago1 = valorPago.getText();

String informacionTransaccion= "pago exitoso\n"+
        "Número de tarjeta: " + numeroTarjeta1 + "\n" +
        "Fecha de vencimiento: " + fechaVencimientoPagoM1 + "\n" +
        "Codigo seguridad: " + codigoSeguridad1 + "\n" +
        "Monto a pagar: " + valorPago1;
resultadoPagoM.setText(informacionTransaccion);
    }
    @FXML
    void selec(ActionEvent event) {
String s = comb.getSelectionModel().getSelectedItem().toString();
if (s != null){
    switch (s ){
        case "PLAN VIP":
            reultadoCombobox.setText("has seleccionado el plan vip ");
            break;
        case "PLAN PREMIUM":
            reultadoCombobox.setText("has seleccionado el plan premium");
            break;
        case "PLAN BASICO":
            reultadoCombobox.setText("has seleccionado el plan normal");
            break;
        default:
            reultadoCombobox.setText("sellecione una opcion");
    }
}
    }

}
