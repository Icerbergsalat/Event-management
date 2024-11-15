module com.example.eventmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.eventmanagement to javafx.fxml;
    exports com.example.eventmanagement;
}