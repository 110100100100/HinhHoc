public class Circle {
    protected double radius;
    protected String color;
    protected double area;
    public Circle (){
        this.radius = 0.0 ;
        this.color = "red";
        this.area = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {

        return area;
    }
    public double Area(double radius, double area ){
        area = radius* 3.14;
        return area ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
