module com.example.ddrjavax {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ddrjavax to javafx.fxml;
    exports com.example.ddrjavax;
}