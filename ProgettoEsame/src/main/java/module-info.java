module com.example.progettoesame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progettoesame to javafx.fxml;
    exports com.example.progettoesame;
}