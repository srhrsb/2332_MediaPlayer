module com.brh.mp3player {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.media;

    opens com.brh.mp3player to javafx.fxml;
    exports com.brh.mp3player;
}