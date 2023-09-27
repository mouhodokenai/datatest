module com.example.datatest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.datatest to javafx.fxml;
    exports com.example.datatest;
}