module GUI {
	requires javafx.controls;
	requires java.desktop;
	requires java.xml;
	opens application to javafx.base;
	
	exports application to javafx.graphics, javafx.fxml,javafx.base;
}
