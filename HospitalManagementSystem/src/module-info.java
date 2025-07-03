module hospitalmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; // for database
    requires mysql.connector.j; // for MySQL
    requires de.jensd.fx.glyphs.fontawesome; // FontAwesomeFX


    opens hospitalmanagementsystem to javafx.fxml;
    exports hospitalmanagementsystem;
}
