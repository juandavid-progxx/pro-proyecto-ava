module co.uniquindio.edu.co.couniquindioeduco {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.edu.co.couniquindioeduco to javafx.fxml;
    exports co.uniquindio.edu.co.couniquindioeduco;
    exports co.uniquindio.edu.co.couniquindioeduco.controller;
     opens co.uniquindio.edu.co.couniquindioeduco.controller;
     opens co.uniquindio.edu.co.couniquindioeduco.model;
exports co.uniquindio.edu.co.couniquindioeduco.model;
}