public class Cylinder extends Circle {
    public double height;
    public Cylinder(){
        this.height= 0.0;
        this.radius = 0.0 ;
        this.color = "red";
        this.area = 0.0;
    }
    public double volumeCylinder(double area, double height){
        double pi = 3.14;
        double volumeCylinder= pi * getArea()* height;
        return volumeCylinder;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Hình trụ:" + height + " " + radius + " " + color + " " + area + " " + volumeCylinder() ;
    }

    private String volumeCylinder() {
        return  volumeCylinder();
    }
}
