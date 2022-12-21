package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class IndicatorBuilderImpl implements IndicatorBuilder {
    private Indicator indicator;

    public IndicatorBuilderImpl(Indicator indicator) {
        this.indicator = indicator;
    }

    @Override
    public void buildArc() {
        Arc arc = new Arc(230.0f, 250.0f, 50.0f, 100.0f, 0.0f, 100.0f);

        indicator.getChildren().add(arc);

        arc.setStrokeWidth(4);

        arc.setFill(Color.RED);
        arc.setStroke(Color.GREEN);

        indicator.updateArc(arc);
    }

    @Override
    public void buildCircles() {
        Circle circle = new Circle();

        indicator.getChildren().add(circle);

        circle.setCenterX(250);
        circle.setCenterY(200);
        circle.setRadius(100);

        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLUE);

    }

    @Override
    public void buildLines() {
        Line line = new Line();

        indicator.getChildren().add(line);

        line.setStrokeWidth(3);

        line.setStartX(250);
        line.setStartY(270);

        line.setEndX(250);
        line.setEndY(130);

        indicator.update(line);
    }

    @Override
    public Indicator getIndicator() {
        return indicator;
    }

}
