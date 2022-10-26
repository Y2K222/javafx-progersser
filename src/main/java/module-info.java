module com.zawhtetaung.jafafxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zawhtetaung.jafafxproject to javafx.fxml;
    exports com.zawhtetaung.jafafxproject;
}