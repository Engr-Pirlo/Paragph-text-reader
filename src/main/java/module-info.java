module com.example.assigemtparagph {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assigemtparagph to javafx.fxml;
    exports com.example.assigemtparagph;
}