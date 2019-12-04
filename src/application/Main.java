package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author rober
 * @see controlador
 * @see controladorHome
 * @see controladorWizard
 * @version 1.0
 * 
 *          Esta actividad tiene 5 ramas: 
 *          	master: solo contiene el login (la
 *          estetica). 
 *          	carrusel: contiene master y un carrusel de imagenes en el
 *          fondo del login. 
 *          	splash: contiene las dos anteriores, y añade un
 *          splash antes de entrar al login. 
 *          	home: contiene las anteriores, y
 *          añade la pagina home con otro carrusel en su parte superior del
 *          fondo. 
 *          	wizard: contiene todo el trabajo, añadiendo una "guia" de uso
 *          de la aplicacion 
 *          
 *          
 *          
 *          
 *          La aplicacion se inicia te muestra el splash, a
 *          continuación sale el login, si le das al boton entras en la guia de
 *          la aplicacion, al terminarla te lleva a la pagina home con sus
 *          botoenes y menu burguer.
 * 
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("splash.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 570, 320);

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			// primaryStage.setResizable(false);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
