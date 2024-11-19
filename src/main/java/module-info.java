module com.david.stydyapp.studyapp {
    requires javafx.controls;
    requires javafx.fxml;
    // requires javafx.web;

    requires org.controlsfx.controls;
    // requires com.dlsc.formsfx;
    // requires net.synedra.validatorfx;
    // requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    // requires eu.hansolo.tilesfx;
    // requires com.almasb.fxgl.all;

    opens com.jmc.mazebank to javafx.fxml;
    exports com.jmc.mazebank;
}