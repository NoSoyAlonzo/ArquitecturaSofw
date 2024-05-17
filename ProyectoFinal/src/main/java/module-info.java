module com.example.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.proyectofinal to javafx.fxml;
    exports com.example.proyectofinal;
    exports com.example.proyectofinal.dominio;
    opens com.example.proyectofinal.dominio to javafx.fxml;
    exports com.example.proyectofinal.broker;
    opens com.example.proyectofinal.broker to javafx.fxml;
}