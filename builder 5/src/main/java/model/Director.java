package model;


public class Director {
    public Indicator build(IndicatorBuilder builder) {
        builder.buildCircles();
//        builder.buildLines();
        builder.buildArc();
        return builder.getIndicator();
    }
}
