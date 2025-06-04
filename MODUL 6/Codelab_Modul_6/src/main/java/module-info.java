module com.example.codelab_modul_6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.codelab_modul_6 to javafx.fxml;
    exports com.example.codelab_modul_6;
}