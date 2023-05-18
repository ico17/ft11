module com.example.futbol11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.futbol11 to javafx.fxml;
    exports com.example.futbol11;
}