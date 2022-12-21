package model;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Indicator extends Pane {
    private Double textField;
    private RotateTransition rotateTransition;

    public void getTime(Double textField) {
        this.textField = textField;
    }

    public void update(Line line) {
        rotateTransition = new RotateTransition();

        line.setStroke(Color.WHITE);

        rotateTransition.setDuration(Duration.seconds(textField));
        rotateTransition.setNode(line);
        rotateTransition.setByAngle(180);
        rotateTransition.setCycleCount((1));
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
        rotateTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                getChildren().remove(line);
            }
        });
    }

    public void updateArc(Arc arc) {
        rotateTransition = new RotateTransition();

        arc.setStroke(Color.GOLD);

        rotateTransition.setDuration(Duration.seconds(textField));
        rotateTransition.setNode(arc);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount((1));
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
        rotateTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                getChildren().remove(arc);
            }
        });
    }

}
