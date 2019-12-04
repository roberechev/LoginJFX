package application;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class controladorWizard {
	@FXML
	private AnchorPane p1;

	@FXML
	private AnchorPane p2;

	@FXML
	private AnchorPane p3;

	public void initialize() {
		pasarWizard(0.5, p2, 600);
		pasarWizard(0.5, p3, 600);
	}

	public void pasarWizard(double duracion, Node node_anchorPane, double ejeX) {

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duracion), node_anchorPane);
		translateTransition.setByX(ejeX);
		translateTransition.play();

	}

	int posicion = 0;

	@FXML
	void Adelante() {

		if (posicion == 0) {
			pasarWizard(0.5, p2, -600);
			posicion++; // showSlide=1
		} else if (posicion == 1) {

			pasarWizard(0.5, p3, -600);
			posicion++; // showSlide=2

		}

	}

	@FXML
	void Atras() {

		if (posicion == 0) {
			System.out.println("No more slides");
		} else if (posicion == 1) {
			pasarWizard(0.5, p2, 600);
			posicion--; // showSlide=0
		} else if (posicion == 2) {
			pasarWizard(0.5, p3, 600);
			posicion--; // showSlide=1
		}

	}

	@FXML
	void Salir() {
		cambio3();
	}

	@FXML
	private void cambio3() {
		try {

			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 570, 550);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			Stage cerrar = (Stage) p1.getScene().getWindow();
			cerrar.close();
			// primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
