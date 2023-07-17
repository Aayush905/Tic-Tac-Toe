module com.example.tic_tactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tic_tactoe to javafx.fxml;
    exports com.example.tic_tactoe;
}