package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class controladorHome {
	@FXML
	private Pane p1;

	@FXML
	private Pane p2;

	@FXML
	private Pane p3;

	@FXML
	private Pane p4;

	public void initialize() {
		backgroundAnimation();
	}
	public void menuBurguer() {
		
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
	}
}
