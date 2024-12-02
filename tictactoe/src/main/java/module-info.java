module com.mycompany.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.tictactoe to javafx.fxml;
    exports com.mycompany.tictactoe;
}
