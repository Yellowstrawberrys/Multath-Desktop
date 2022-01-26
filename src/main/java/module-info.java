module cf.yellowstrawberry.multath {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires vosk;
    requires org.json;

    opens cf.yellowstrawberry.multath.gui to javafx.fxml;
    opens cf.yellowstrawberry.multath.data.System to javafx.fxml;
    exports cf.yellowstrawberry.multath;
    exports cf.yellowstrawberry.multath.gui;
    exports cf.yellowstrawberry.multath.data.System;
}