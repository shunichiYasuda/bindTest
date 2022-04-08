module com.GenSci.sample.bindtest {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.GenSci.sample.bindtest to javafx.fxml;
    exports com.GenSci.sample.bindtest;
}
