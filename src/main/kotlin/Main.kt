import javafx.application.Application
import javafx.application.Platform
import javafx.stage.Stage

class App: Application() {
    override fun start(primaryStage: Stage?) {
        primaryStage?.let {
            primaryStage.show();
        }
    }

}


fun main(args: Array<String>) {
    Platform.startup {
        App().start(Stage());
    }
}