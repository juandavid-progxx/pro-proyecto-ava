package co.uniquindio.edu.co.couniquindioeduco.controller;


import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.edu.co.couniquindioeduco.model.cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class clienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnagregarCliente;

    @FXML
    private TableColumn colApellido;

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





    @FXML
    void initialize() {

clientes= FXCollections.observableArrayList();

this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
this.colApellido.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        this.colCedula.setCellValueFactory(new PropertyValueFactory("cedula"));
        this.colCelular.setCellValueFactory(new PropertyValueFactory("celular"));
        this.colTelefono.setCellValueFactory(new PropertyValueFactory("telefono"));
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

}
