module com.example.jvmfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jvmfx to javafx.fxml;
    exports com.example.jvmfx;
}