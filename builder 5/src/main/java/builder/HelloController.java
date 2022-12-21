package builder;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import model.Director;
import model.IndicatorBuilderImpl;
import model.Indicator;


public class HelloController {
    @FXML
    public Pane pane;
    @FXML
    private TextField textField;
    private Director direct;
    private Indicator indicator;

    public void indicator() {
        direct = new Director();
        indicator = new Indicator();

        pane.getChildren().clear();

        indicator.getTime(Double.valueOf((textField.getText())));

        direct.build(new IndicatorBuilderImpl(indicator));

        pane.getChildren().add(indicator);
    }
}
