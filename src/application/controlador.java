package application;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class controlador {
	@FXML
	private Pane p1;

	@FXML
	private Pane p2;

	@FXML
	private Pane p3;

	@FXML
	private Pane p4;

	@FXML
	private ImageView im;

	@FXML
	private Label lab;

	@FXML
	private AnchorPane anch;
	
	@FXML
	private JFXButton getStarted;
	
	

	public void initialize() {
		splashTransicion();
		backgroundAnimation();
	}

	@FXML
	private void splashTransicion() {
		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.1), im);
		translateTransition.setByY(1000);
		translateTransition.play();

		TranslateTransition translateTransition0 = new TranslateTransition(Duration.seconds(0.1), lab);
		translateTransition0.setByY(1000);
		translateTransition0.play();

		translateTransition.setOnFinished(event -> {

			TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(1), im);
			translateTransition1.setByY(-1000);
			translateTransition1.play();

			translateTransition1.setOnFinished(event1 -> {
				RotateTransition rotateTran = new RotateTransition(Duration.seconds(1.5), im);
				rotateTran.setByAngle(360);
				rotateTran.setCycleCount(1);
				rotateTran.play();

				rotateTran.setOnFinished(event2 -> {
					TranslateTransition translateTransition11 = new TranslateTransition(Duration.seconds(1), lab);
					translateTransition11.setByY(-1000);
					translateTransition11.play();

					translateTransition11.setOnFinished(event3 -> {
						ScaleTransition scale = new ScaleTransition(Duration.seconds(2), anch);
						scale.setFromX(1);
						scale.setFromY(1);
						scale.setByX(1);
						scale.setByY(1);
						scale.play();

						scale.setOnFinished(event4 -> {
							FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(2), anch);
							fadeTransition1.setFromValue(1);
							fadeTransition1.setToValue(0.1);
							fadeTransition1.play();

							fadeTransition1.setOnFinished(event5 -> {
								Stage thisStage = (Stage) anch.getScene().getWindow();
								cambio();
								thisStage.close();
							});

						});
					});
				});

			});

		});
	}

	@FXML
	private void cambio2() {
		try {
			
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("wizard.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 500, 400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			Stage cerrar = (Stage) p1.getScene().getWindow();
			cerrar.close();
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	private void cambio() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 570, 320);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void backgroundAnimation() {

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(5), p4);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();

		fadeTransition.setOnFinished(event -> {

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3), p3);
			fadeTransition1.setFromValue(1);
			fadeTransition1.setToValue(0);
			fadeTransition1.play();

			fadeTransition1.setOnFinished(event1 -> {
				FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(3), p2);
				fadeTransition2.setFromValue(1);
				fadeTransition2.setToValue(0);
				fadeTransition2.play();

				fadeTransition2.setOnFinished(event2 -> {

					FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(3), p2);
					fadeTransition3.setFromValue(0);
					fadeTransition3.setToValue(1);
					fadeTransition3.play();

					fadeTransition3.setOnFinished(event3 -> {

						FadeTransition fadeTransition4 = new FadeTransition(Duration.seconds(3), p3);

						fadeTransition4.setFromValue(0);
						fadeTransition4.setToValue(1);
						fadeTransition4.play();

						fadeTransition4.setOnFinished(event4 -> {

							FadeTransition fadeTransition5 = new FadeTransition(Duration.seconds(3), p4);

							fadeTransition5.setFromValue(0);
							fadeTransition5.setToValue(1);
							fadeTransition5.play();

							fadeTransition5.setOnFinished(event5 -> {

								backgroundAnimation();
							});

						});

					});
				});
			});
		});
//		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), p4);
//		fadeTransition.setFromValue(1);
//		fadeTransition.setToValue(0);
//		fadeTransition.play();
//
//		fadeTransition.setOnFinished(event -> {
//
//			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3), p3);
//			fadeTransition1.setFromValue(1);
//			fadeTransition1.setToValue(0);
//			fadeTransition1.play();
//
//			fadeTransition1.setOnFinished(event1 -> {
//				FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(3), p2);
//				fadeTransition2.setFromValue(1);
//				fadeTransition2.setToValue(0);
//				fadeTransition2.play();
//
//				fadeTransition2.setOnFinished(event2 -> {
//
//					FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(3), p1);
//					fadeTransition3.setFromValue(0);
//					fadeTransition3.setToValue(1);
//					fadeTransition3.play();
//
//					fadeTransition3.setOnFinished(event3 -> {
//
//						backgroundAnimation();
//					});
//				});
//			});
//		});

	}
}
