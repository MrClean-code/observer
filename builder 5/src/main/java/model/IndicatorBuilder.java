package model;

public interface IndicatorBuilder {
    void buildLines();
    void buildCircles();
    void buildArc();
    Indicator getIndicator();

}
